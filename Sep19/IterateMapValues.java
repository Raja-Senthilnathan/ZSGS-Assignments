package Sep19;

import java.util.HashMap;
import java.util.Set;
import java.util.Map.Entry;

public class IterateMapValues {
	
	public static void main(String[] args) {
		
		HashMap<String,Integer> map = new HashMap<>();
		
		map.put("Apple", 100);
		map.put("Orange", 200);
		map.put("tv", 1000);
		map.put("Grapes", 300);
		int sum=0;
		
		Set<Entry<String,Integer>> loop = map.entrySet();
		for(Entry<String,Integer> iterate : loop) {
			sum+=iterate.getValue();
		}
		System.out.println(sum);
	}

}
