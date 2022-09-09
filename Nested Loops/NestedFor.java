package Zoho;

import java.util.Scanner;

public class NestedFor {
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the Array");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter the Values of the Array");
		for(int i=0; i<size; i++) {
			arr[i] = sc.nextInt();
		}
		for(int a : arr) {
			System.out.print(a+" ");
		}
		
		System.out.println();
		System.out.println("Sorted Array");
		
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int b : arr) {
			System.out.print(b+" ");
		}
	}
}
