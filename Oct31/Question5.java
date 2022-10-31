package Evaluation;

import java.util.LinkedList;
import java.util.Scanner;

public class Question5 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		LinkedList<Integer> list = new LinkedList<>();
		for(int i=0; i<size; i++) {
			list.add(sc.nextInt());
		}
		
		int max;
		for(int i=0; i<list.size(); i++) {
			max=list.get(i);
			for(int j=i+1; j<list.size(); j++) {
		        max=Math.max(max, list.get(j));	    
			}
			if(max==list.get(i)) {
				list.set(i,0);
			}
			else {
				list.set(i,max);
			}
		}
		System.out.println(list);
	}
}
