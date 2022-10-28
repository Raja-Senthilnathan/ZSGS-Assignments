package Oct28;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Question2 {
	
	public static void main(String[] args) {
		int[] a = {16,17,4,3,5,2};
		int n= 6; 
		int max=a[n-1];
		List<Integer> list = new ArrayList<>();
		list.add(max);
		for(int i=a.length-2; i>=0; i--) {
			if(a[i]>a[i+1] && a[i]>max) {
				list.add(a[i]);
			}
			max=Math.max(max, a[i]);
		}
		Collections.reverse(list);
		System.out.println(list);
	}
}
