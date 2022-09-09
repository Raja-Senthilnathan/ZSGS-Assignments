package Zoho;

import java.util.Arrays;
import java.util.*;

public class RemoveDuplicate {
	
	public static void main(String[]args) {
		
		int[] n = {3,4,5,6,3,4,5};
        
		int count = 0;
		
		for(int i=0; i<n.length; i++) {
			count = (count^n[i]);
		}
		System.out.println(count);
	}
}
