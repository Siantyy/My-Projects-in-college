import java.util.Scanner;

public class TicTacToe{
    public static Scanner sc = new Scanner(System.in); 
	public static int move = 0;
	public static boolean gameOver = false;
    public static char[][] board =  new char[3][3];
	
	
    public static void main(String[] args){
        
        while(!gameOver){
			printingBoard(board);
			playerTurn(board);
			
        }
    }
    
	//for printing the board
    public static void printingBoard(char[][] board){
        
        System.out.println("                     COL");
        System.out.println("            1         2         3");
       
        for(int i = 0; i < 3; i++){
				for(int j = 0; j < 3; j++){
					if(j<1){
						System.out.print("R");
						System.out.print("O");
						System.out.print("W  " + (i + 1));
					}
					System.out.print( "   [");
					System.out.print("  " + board[i][j]);
					System.out.print("  ]");
				}
            
            System.out.println();
			
            
        }
			
    }
	

	
	//input handler
	public static void playerTurn(char[][] board){
		int col, row;
		
		
		System.out.println("Enter row and col 1-3");
		String input = sc.nextLine();	
		String[] parts = input.split(",");
		
		if(parts.length != 2){
			System.out.println("Try correct format");
			return;
		}
		try{
			col = Integer.parseInt(parts[0].trim()) -1;
			row = Integer.parseInt(parts[1].trim()) -1;
			
			if (col < 0 || col > 2 || row < 0 || row > 2) {
                System.out.println("Numbers must be between 1 and 3.");
                return;
            }
	
		}catch(NumberFormatException e){
			System.out.print("Invalid input, try again.");
			return;
		}
		
		if(board[col][row] != '\0'){
			System.out.println("Already marked");
			return;
		} 
	
		//for alternating move
		if(move%2 == 0){
			board[col][row] = 'O'; 
		}else if(move%2 == 1){
			 board[col][row] = 'X'; 
		}
			
		move++;	
	}
	
	public static boolean gameOver(){
		if ((board[0][0] == 'X' && board[1][1] == 'X' && board[2][2] == 'X') ||
               (board[1][3] ==  'X' && board[2][2] == 'X' && board[3][1] == 'X')) {
			return true; // Winning row or column
		}	
		System.out.println("game ends");
		return false;
	}
}
