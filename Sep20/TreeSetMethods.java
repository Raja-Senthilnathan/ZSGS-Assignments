package Sep20;
import java.util.*;

public class TreeSetMethods {
	
	public static void main(String[] args) {
		
		TreeSet<Integer> set = new TreeSet<>();
		set.add(5);
		set.add(3);
		set.add(7);
		set.add(1);
		
		System.out.println("TreeSet : "+set);
		
		System.out.println("Greater than or equal to the given input : "+set.ceiling(4));
		System.out.println("Less than or equal to the given input : "+set.floor(4));
		
		System.out.println("Retrive & remove the first element : "+set.pollFirst());
		
	}
}
