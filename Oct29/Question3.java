package Tenkasi;

import java.util.Arrays;
import java.util.LinkedList;

public class Question3 {
	
	public static void main(String[] args) {
		
		int[] a = {1,1,2,0,1,0,1,0,2,1,2,1};
		int index=0;
	    LinkedList<Integer> list = new LinkedList<>();
		for(int i=0; i<a.length; i++) {
			if(a[i]==0) {
				list.addFirst(a[i]);
			}
			else if(a[i]==2) {
				list.addLast(a[i]);
			}
			else {
				index=list.lastIndexOf(0)+1;
				list.add(index, a[i]);
			}
		}
		System.out.println(Arrays.toString(a));
		System.out.println(list);
	}
}
