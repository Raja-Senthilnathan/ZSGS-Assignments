package Tenkasi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Question1 {
	
	public static void main(String[] args) {
	
		int[] a = {4,1,2,3,1,2,5,2};
		int val=0, index=0;
		Map<Integer,Integer> map = new LinkedHashMap<>();
		List<Integer> key = new ArrayList<>();
		List<Integer> value = new ArrayList<>();
		for(int x : a) {
			map.put(x,map.getOrDefault(x, 0)+1);
		}
        key.addAll(map.keySet());
        value.addAll(map.values());
        for(int i=0; i<map.size(); i++) {
        	val=Collections.max(value);
        	index=value.indexOf(val);
        	for(int j=0; j<val; j++) {
        		System.out.print(key.get(index));
        	}
        	value.set(index, 0);
        }
	}
}
