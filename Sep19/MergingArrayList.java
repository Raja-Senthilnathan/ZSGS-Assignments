package Sep19;

import java.util.*;

public class MergingArrayList {
	
	public static void main(String[] args) {
		
		ArrayList<String> list1 = new ArrayList<>();
		list1.add("a");
		list1.add("b");
		list1.add("c");
		list1.add("d");
		ArrayList<String> list2 = new ArrayList<>();
		list2.add("u");
		list2.add("v");
		list2.add("w");
		list2.add("x");
		list2.add("y");
		list2.add("z");
		
		if(list1.size()>=list2.size()) {
		int j=1;
		String temp ="";
	    for(int i=0; i<list2.size(); i++) {
	    	temp = list2.get(i);
	    	list1.add(j, temp);
	    	j+=2;
	    }
	    System.out.println(list1);
		}
		
		else {
			int j=0;
			String temp ="";
			for(int i=0; i<list2.size(); i++) {
				if(list1.size()==i) {
					break;
				}
				temp = list1.get(i);
				list2.add(j, temp);
				j+=2;
			}
			System.out.println(list2);
		}
	}
}
