package Sep19;

public class DiagonalOf2DArray {
	
	public static void main(String[] args) {
		
		int[][] array = {{2,3,1,5,0},{7,1,5,3,1},{2,5,7,8,1},{0,1,5,0,1},{3,4,9,1,5}};
		
		System.out.println("Original Array");
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array[i].length; j++) {
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("Diagonal Array");
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array[i].length; j++) {
				if(i<=j) {
				System.out.print(array[i][j]+" ");	
				}
				else {
					System.out.print("  ");
				}
		}
			System.out.println();
		}
	}

}
