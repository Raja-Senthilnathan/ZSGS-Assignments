package Zoho;

import java.util.Arrays;

public class Rotate90Degree {
	
	public static void main(String[]args) {
		
		int[][] a = {{1,2,3},{4,5,6},{7,8,9}};
	    System.out.println("Before Rotation ");
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("After 90 Degree Rotation ");
        for(int i=0; i<a.length; i++) {
        	for(int j=a.length-1; j>=0; j--) {
        		System.out.print(a[j][i]+" ");
        	}
        	System.out.println();
        }
	}
}
