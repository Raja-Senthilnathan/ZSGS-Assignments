package Sep20;
import java.util.*;

public class ArrayListMethods {
	
	public static void main(String[] args) {
		
		ArrayList<String> list1 = new ArrayList<>();
		list1.add("Black");
		list1.add("Blue");
		list1.add("White");
		list1.add("Green");
		list1.add("Grey");
		
		System.out.println("ArrayList one : "+list1);
		
		list1.add(0, "Red");
		System.out.println("Adding the element in first index : "+list1);
		
		System.out.println("Retrieve the element by passing index : "+list1.get(3));
		
		System.out.println("Search the element is present or not : "+list1.contains("Orange"));
		
		ArrayList<String> list2 = new ArrayList<>();
		list2.add("Pink");
		list2.add("Orange");
		list2.add("Yellow");
		list2.add("Purple");
		
		System.out.println("ArrayList two : "+list2);
		System.out.println("Comparing two ArrayList : "+list2.equals(list1));
		
		System.out.println("Iterating the ArrayList Two elements : ");
		for(int i=0; i<list2.size(); i++) {
			System.out.println(list2.get(i));
		}
		
	}

}
