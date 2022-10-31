package Evaluation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Question2 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] array = new int[size];
		for(int index=0; index<size; index++) {
			array[index]=sc.nextInt();
		}
	    
		Set<List<Integer>> set = new HashSet<>();
		Arrays.sort(array);
		int i=0, j=i+1, k=j+1;
		while(i<size-2 && j<size-1 && k<size) {
			if(array[i]+array[j]+array[k]==0) {
				List<Integer> list = new ArrayList<>();
				list.add(array[i]);
				list.add(array[j]);
				list.add(array[k]);
				set.add(list);
			}
			k++;
			if(k==size) {
				j++;
				k=j+1;
			}
			if(j==size-1) {
				i++;
				j=i+1;
				k=j+1;
			}
		}
		System.out.println(set);
	}
}
