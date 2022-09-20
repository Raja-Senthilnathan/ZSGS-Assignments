package Sep20;
import java.util.*;

public class LinkedListMethods {
	
	public static void main(String[] args) {
		
		LinkedList<Integer> list1 = new LinkedList<>();
		list1.add(1);
		list1.add(3);
		list1.add(5);
		list1.add(7);
		
		System.out.println("LinkedList elements are : "+list1);
		
		list1.addFirst(2);
		list1.addLast(4);
		System.out.println("Adding the elements in first & last position : "+list1);
		
		System.out.println("Get the First position element : "+list1.getFirst());
		System.out.println("Get the Last position element : "+list1.getLast());
		
		Object list2 = list1.clone();
		System.out.println("The clone LinkedList One : "+list2);
		
		System.out.println("Retrieve the first element : "+list1.peekFirst());
		
	}
}
 
