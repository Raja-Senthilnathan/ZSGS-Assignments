package Zoho;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixMultiplication {
	
	public static void main(String[]args) {
		
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the size of 1st 2D Array");
	    int a1s1 = sc.nextInt();
	    int a1s2 = sc.nextInt();
	    int[][] arr1 = new int[a1s1][a1s2];
	    System.out.println("Enter the value of 1st 2D Array");
	    for(int i=0; i<arr1.length; i++) {
	    	for(int j=0; j<arr1[i].length; j++) {
	    		arr1[i][j]= sc.nextInt();
	    	}
	    }
	    
	    System.out.println("Enter the Size of 2nd 2D Array");
	    int a2s1 = sc.nextInt();
	    int a2s2 = sc.nextInt();
	    int[][] arr2 = new int[a2s1][a2s2];
	    System.out.println("Enter the value of 1st 2D Array");
	    for(int i=0; i<arr2.length; i++) {
	    	for(int j=0; j<arr2[i].length; j++) {
	    		arr2[i][j]= sc.nextInt();
	    	}
	    }
	    
	    int[][] res = new int[a1s1][a2s2];
	    
	    for(int i=0; i<a1s1; i++) {
	    	for(int j=0; j<a2s2; j++) {
	    		for(int k=0; k<res.length; k++) {
	    		   res[i][j]=res[i][j]+(arr1[i][k]*arr2[k][j]);	
	    		}
	    	}
	    }
	    System.out.println(Arrays.deepToString(res));
	}
}
