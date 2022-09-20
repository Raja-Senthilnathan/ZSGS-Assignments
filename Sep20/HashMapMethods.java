package Sep20;
import java.util.*;

public class HashMapMethods {
	
	public static void main(String[] args) {
		
	     HashMap<String,Integer> map1 = new HashMap<>();
	     map1.put("Tomato",40);
	     map1.put("Carrot",40);
	     map1.put("Cucumber",40);
	     map1.put("Ladies Finger",40);
	     
	     System.out.println("Size of the map : "+map1.size());
	     
	     Object map2 = map1.clone();
	     System.out.println("Copy of one map element to another map : "+map2);
	     
	     map1.clear();
	     System.out.println("Map is Empty : "+map1.isEmpty());
		
	}
}
