package Evaluation;

import java.util.HashSet;
import java.util.Set;

public class SubSequence {

	static Set<String> result = new HashSet<>();
	String combo="";
	
	public static void main(String[] args) {
		
		String s = "XAXBXA";
		SubSequence sub = new SubSequence();
	    sub.generateSequence(s,0);	
	    System.out.println(result);
	    System.out.println(result.size());
	}
	
	private void generateSequence(String s, int index) {
		
		if(combo.length()>1) {
			containsSequence(combo,s.substring(index-1));
		}
		for(int i=index; i<s.length(); i++) {
			combo+=s.charAt(i);
			generateSequence(s,i+1);
			combo=combo.substring(0,combo.length()-1);
		}
	}

	private void containsSequence(String comb, String sub) {
		
		int index=-1;
		boolean check=true;
		for(int i=0; i<comb.length(); i++) {
			sub=sub.substring(index+1);
			index=sub.indexOf(comb.charAt(i));
			if(index==-1) {
				check=false;
				break;
			}
		}
		if(check) 
			result.add(comb);	
	}
}
