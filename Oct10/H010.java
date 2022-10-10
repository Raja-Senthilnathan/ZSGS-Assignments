package Hacktober;

import java.util.Scanner;

public class H010 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String s = sc.next();
		
		int mid = (s.length()/2)+1;
		int k=0;
		
		for(int i=mid; i>=0; i--) {
			for(int j=0; j<i; j++) {
				System.out.print(s.charAt(k));
			}
			k++;
		}
		k=mid;
		for(int i=1; i<mid; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print(s.charAt(k));
			}
			k++;
		}
	}
}
