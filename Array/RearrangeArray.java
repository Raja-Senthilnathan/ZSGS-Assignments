package Zoho;

import java.util.Arrays;
import java.util.Scanner;

public class RearrangeArray {
	
	public static void main(String[]args) {
		
		System.out.println("Enter the size of an Array");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] a = new int[size];
		System.out.println("Enter the valuse of Array");
		for(int i=0; i<size; i++) {
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);
		
		int[] b = new int[size];
		int mid;
		if(size%2==0) {
			mid = (size/2)-1;
		}
		else {
			mid = size/2;
		}
		int temp=mid;
		for(int i=0; i<size; i+=2) {
				b[i]=a[mid--];
		}
		mid = temp;
		for(int i=1; i<size; i+=2) {
			    mid++;
			    b[i]=a[mid];
		}
		System.out.print(Arrays.toString(b));
	}
}
