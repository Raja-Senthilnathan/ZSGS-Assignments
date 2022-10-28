package Oct28;

import java.util.Arrays;

public class Question4 {
	
	public static void main(String[] args) {
		int n=5;
		int[] a = {1,2,5,4,0};
		int[] b = {2,4,5,0,1};
		Arrays.sort(a);
		Arrays.sort(b);
		System.out.println(equals(a,b));
	}
	private static String equals(int[] a, int[] b) {
		for(int i=0; i<a.length; i++) {
		    if(a[i]!=b[i]) {
		       return "Not Equal";
		    }	
		}	
		return "Equal";
	}
}
