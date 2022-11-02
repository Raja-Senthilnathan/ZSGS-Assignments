package Evaluation;

import java.util.Arrays;
import java.util.Scanner;

public class ProductOfAnArray {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] array = new int[size];
		for(int index=0; index<size; index++) {
			array[index]=sc.nextInt();
		}
		
		int multiple=1;
		int[] result = new int[size];
		for(int index1=0; index1<size; index1++) {
			for(int index2=0; index2<size; index2++) {
				if(index1!=index2)
					multiple*=array[index2];
			}
			result[index1]=multiple;
			multiple=1;
		}
		System.out.println(Arrays.toString(result));
	}
}
