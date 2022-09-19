package Sep19;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDimensionalArray {
	
	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of row");
        int size1 = sc.nextInt();
		System.out.println("Enter the size of column");
		int size2 = sc.nextInt();
		int[][] array = new int[size1][size2];
		System.out.println("Enter the values of 2D Array");
		for(int i=0; i<size1; i++) {
			for(int j=0; j<size2; j++) {
				array[i][j]=sc.nextInt();
			}
			System.out.println();
		}
		
		System.out.println("Two Dimensional Array");
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array[i].length; j++) {
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
		
		
		int[] sumOfRow = new int[size1];
		int[] sumOfColumn = new int[size2];
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array[i].length; j++) {
				sumOfRow[i]+=array[i][j];
				sumOfColumn[i]+=array[j][i];
			}
		}
		System.out.println("Sum of the rows");
		System.out.println(Arrays.toString(sumOfRow));
		System.out.println("Sum of the Columns");
		System.out.println(Arrays.toString(sumOfColumn));
		
		int sum=0;
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array[i].length; j++) {
				sum+=array[i][j];
			}
		}
		System.out.println("Sum of the total elements");
		System.out.println(sum);
	}
}
