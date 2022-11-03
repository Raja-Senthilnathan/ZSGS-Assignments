package Tenkasi;

import java.util.Arrays;

public class Question2 {
	
	public static void main(String[] args) {
		int n=9;
		int[] a = {10,7,1,-1,4,-10,6,15,21};
		for(int i=0; i<n; i+=2) {
			for(int j=i+2; j<n; j+=2) {
				if(a[i]>a[j]) {
				     swap(a,i,j);
				}
			}
		}
		for(int i=1; i<n; i+=2) {
			for(int j=i+2; j<n; j+=2) {
				if(a[i]<a[j]) {
				     swap(a,i,j);
				}
			}
		}
		System.out.println(Arrays.toString(a));
	}
	private static void swap(int[] a, int i, int j) {
		 int temp=a[i];
		 a[i]=a[j];
		 a[j]=temp;
		 return;
	}
}
