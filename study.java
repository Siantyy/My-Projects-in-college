import java.util.Scanner;

public class TicTacToe{
    public static Scanner sc = new Scanner(System.in); 
    
    public static void main(String[] args){
        
        char[][] board =  new char[3][3];
        printingBoard(board);
        playerTurn(board);
    }
    
    public static void printingBoard(char[][] board){
        
        System.out.println("               COL");
        System.out.println("      1         2         3");
        
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.print("   [");
                System.out.print(board[i][j]);
                System.out.print("    ]");
            }
            System.out.println();
        }
    }
    
    public static void playerTurn(char[][] arr){
        while(true){    
            try{
                int row = 0, col = 0;
                System.out.println("Enter move (row,col)");
                
                String input = sc.nextLine();
                
                String[] parts = input.split(",\\s*");
                
                if(parts.length != 2){
                    throw new InputMismatchException("Expected row, col");
                }
                
                try{
                    row = Integer.parseInt(parts[0].trim());
                }catch(NumberFormatException e){
                    throw new InputMismatchException("Row must be an integer");
                }
                
                try{
                    col = Integer.parseInt(parts[1].trim());
                }catch(NumberFormatException e){
                    throw new InputMismatchException("Column must be an integer");
                }
                
                if(arr[row][col] != '\0'){ 
                    System.out.println("That spot is already taken. Try again.");
                    continue;
                }

                arr[row][col] = 'X';
                printingBoard(arr);

            }catch(InputMismatchException e){
                System.out.println(e.getMessage());
            }catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Row and column must be 0-2 only!");
            }
        }   
    }
}
