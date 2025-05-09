import java.util.Scanner;

public class ticTactoe{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		char[][] board = {{' ', ' ', ' ' } ,
						  {' ', ' ', ' ' } ,
						  {' ', ' ', ' ' }};
						  
		boolean gOver = false;
		
		int Systemknowerplayer = 9;
		
		printBoard(board);
		
		//player turn
		
		while(gOver == false){
			for(int i = 0; i < Systemknowerplayer; i++){
				if(i%2 == 0){
			
					char move = 'X';
						
					System.out.println();
					System.out.println("[" + "Player 1 X" + "]");
					System.out.println();
					System.out.println("input colmn 1-3");
					int rows = sc.nextInt() - 1;
					
					System.out.println("input rows 1-3 ");
					int colmn = sc.nextInt() -1;
					
					board[colmn][rows] = move;
						
					printBoard(board);
				}else if(i%2 == 1){
						
					char move = 'O';
						
					System.out.println();
					System.out.println("[Player 2 O]");
					System.out.println();
					System.out.println("input colmn 1-3");
					int colmn = sc.nextInt() - 1;
						
					System.out.println("input rows 1-3 ");
					int rows = sc.nextInt() -1;
						
					board[colmn][rows] = move;
					printBoard(board);
				}else{
					System.out.println("invalid move");
					printBoard(board);
				}
						
			}
				
		}

		
	//for printing the board 
	static void printBoard(char[][] board) {
        System.out.println("Current Board ");
		System.out.println();
		System.out.println("       Columns    ");
		System.out.println(" rows   1    2    3 ");
		
        for (int i = 0; i < 3; i++) {	
			System.out.print("   " + (i + 1) + "  "); // Print row number.
            for (int j = 0; j < 3; j++) {				
                if (j < 3) {
					System.out.print("[ "); // Add vertical separators
					System.out.print(board[i][j]);
					System.out.print(" ]");
				}						
				
            }
            System.out.println();
             // Add horizontal separators
        }
    }
	
}