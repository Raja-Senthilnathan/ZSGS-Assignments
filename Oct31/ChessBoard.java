package Evaluation;

public class ChessBoard {
	
	 int n=8;
     public static void main(String[] args) {
		
    	 int row=3;
    	 int col=3;
    	 int noOfMoves=1;
    	 int noOfSteps=0;
    	 ChessBoard chess = new ChessBoard();
    	 System.out.println(chess.knight(row,col,noOfMoves,noOfSteps));
	}
     
	private double knight(int row, int col, int noOfMoves, int noOfSteps) {
		double probability=0;
		
		if(row<0 || row>n-1 || col<0 || col>n-1) 
			return 0;
		if(noOfMoves==noOfSteps) 
			return 1;
		
		probability+=knight(row-2,col-1,noOfMoves,noOfSteps+1);
		probability+=knight(row-2,col+1,noOfMoves,noOfSteps+1);
		probability+=knight(row-1,col-2,noOfMoves,noOfSteps+1);
		probability+=knight(row-1,col+2,noOfMoves,noOfSteps+1);
		
		probability+=knight(row+1,col-2,noOfMoves,noOfSteps+1);
		probability+=knight(row+1,col+2,noOfMoves,noOfSteps+1);
		probability+=knight(row+2,col-1,noOfMoves,noOfSteps+1);
		probability+=knight(row+2,col+1,noOfMoves,noOfSteps+1);
		
		return probability/8;
	}
}
