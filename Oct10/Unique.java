package Oct10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Unique {
	
	public static void main(String[] args) {
		
	    Scanner sc = new Scanner(System.in);
	    String s = sc.next();
	    
	    List list = new ArrayList();
	    for(int i=0; i<s.length(); i++) {
	    	if(list.contains(s.charAt(i))) {
	    		System.out.println(false);
	    		return;
	    	}
	    	else {
	    		list.add(s.charAt(i));
	    	}
	    }
	    System.out.println(true);
	}
}
