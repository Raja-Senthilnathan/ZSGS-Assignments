package Tenkasi;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Question5 {
	
//	5
//	5-You.
//	1-Hi
//	3- I
//	2-Adam!
//	4-Love
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    sc.nextLine();
	    int max=0;
	    String maxString="" ,input= "";
	    Map<Integer,String> map = new TreeMap<>();
	    for(int i=0; i<n; i++){
	    	input=sc.nextLine();
	    	if(max<=input.length()) {
	    		max=input.length();
	    		maxString=input;
	    	}
	    	String[] split = input.split("-");
	    	map.put(Integer.parseInt(split[0]),split[1]);
	    }
	    System.out.print("Message:");
	    for(String s : map.values()) {
	    	System.out.print(s);
	    }
	    System.out.println();
	    System.out.println("Buffered packet with maximum length:"+max+" - "+maxString); 
	}
}
