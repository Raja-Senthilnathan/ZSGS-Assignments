package Zoho;

import java.util.Arrays;
import java.util.Scanner;

public class Rotation {
	
	public static void leftRotate(int[]arr,int d) {
		
		for(int i=0; i<d; i++) {
			int first = arr[0];
			for(int j=0; j<arr.length-1; j++) {
				arr[j]=arr[j+1];
			}
			arr[arr.length-1]=first;
		}
		System.out.println(Arrays.toString(arr));
	}
	
    public static void rightRotate(int[]arr,int d) {
		
		for(int i=0; i<d; i++) {
			int last = arr[arr.length-1];
			for(int j=arr.length-1; j>0; j--) {
				arr[j]=arr[j-1];
			}
			arr[0]=last;
		}
		System.out.println(Arrays.toString(arr));
	}
	
	public static void main(String[]args) {
		
	   System.out.println("Enter the size of an array");
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       System.out.println("Enter how many Rotation");
       int d = sc.nextInt();
       int[] a = new int[n];
       System.out.println("Enter the elements of an array");
       for(int i=0; i<n; i++) {
    	   a[i]= sc.nextInt();
       }
       leftRotate(a,d);
       
	}
}
