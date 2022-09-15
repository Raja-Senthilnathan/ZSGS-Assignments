package Sep15;

import java.util.*;
import java.util.Map.Entry;

public class ImplementationOfMap {
	
	public static void main(String[]args) {
		
		Map<String,Integer> fruits = new LinkedHashMap<>();
		//put() is used to add key & value
		fruits.put("Apple",150);
		fruits.put("Grapes",90);
		fruits.put("Orange",120);
		fruits.put("GreenApple",200);
		System.out.println(fruits);
		
		//keySet() is used to get the key 
		System.out.println(fruits.keySet());
		
		//values() is used to get the value
		System.out.println(fruits.values());
		
		//entrySet() is used to iterate in the combination of key & value
		Set<Entry<String,Integer>> loop = fruits.entrySet();
		for(Entry<String,Integer> iterate : loop) {
			System.out.println(iterate);
		}
		
		//replace() is used the value
		fruits.replace("Grapes", 190);
		System.out.println(fruits);
		
		//get() is used to get the value of particular key
		System.out.println(fruits.get("Grapes"));
		
		//remove() is used to remove the values
		fruits.remove("GreenApple");
		System.out.println(fruits);
		
	}
}
