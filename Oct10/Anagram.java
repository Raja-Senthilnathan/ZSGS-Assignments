package Oct10;

import java.util.Scanner;

public class Anagram {
	
public static void main(String[] args) {
		
	    Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		String s2 = sc.next();
		
		char[] c = s2.toCharArray();
		
		if(s1.length()==s2.length()) {
		   for(int i=0; i<c.length; i++) {
			String s = ""+c[i];
			s1=s1.replace(s,"");
		   }
		   System.out.println(s1.isEmpty());
		}
		else {
			System.out.println(false);
		}
	}
}
