import java.util.Scanner;

public class TicTacToe{
    public static Scanner sc = new Scanner(System.in); 
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
		
        char[][] board =  new char[3][3];
        while(true){
			printingBoard(board);
			playerTurn(board);
        }
    }
    
	//for printing the board
    public static void printingBoard(char[][] board){
        
        System.out.println("               COL");
        System.out.println("      1         2         3");
        
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.print("   [");
                System.out.print("  " + board[i][j]);
                System.out.print("  ]");
            }
            System.out.println();
        }
    }
	
	//for player turn
	
	public static void playerTurn(char[][] board){
		System.out.println("Enter column 1-3");
		int col = sc.nextInt() - 1;
		System.out.println("Enter row 1-3");
		int row = sc.nextInt() - 1;
		
		
	    char playerMark = 'X';
		
		if(playerMark=='X'){
			playerMark = 'O';
			board [row][col] = playerMark ; 
		}else if(playerMark=='O'){
			playerMark = 'X';
			board[row][col] = playerMark;
		}else{
			throw 
		}
		
		
	}
}
