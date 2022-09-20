package Sep20;
import java.util.*;

public class HashSetMethods {
	
	public static void main(String[] args) {
		
		HashSet<Integer> set1 = new HashSet<>();
		set1.add(11);
		set1.add(33);
		set1.add(44);
		set1.add(22);
		
		System.out.println("Iteration of set");
		for(Integer iterate : set1) {
			System.out.println(iterate);
		}
		
		Integer[] array = new Integer[set1.size()];
		array=set1.toArray(array);
		System.out.println("Set to Array : "+Arrays.toString(array));
		
		HashSet<Integer> set2 = new HashSet<>();
		set2.add(55);
		set2.add(33);
		set2.add(66);
		set2.add(22);
		set2.retainAll(set1);
		System.out.println("Same elements in both set : "+set2);
		
		set1.clear();
		System.out.println("The Set is Empty : "+set1.isEmpty());
		
	}
}
