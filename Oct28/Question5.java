package Oct28;

import java.util.HashMap;
import java.util.Map;

public class Question5 {
	
	public static void main(String[] args) {
		int n=7, k=2;
		int[] a = {1,7,4,3,4,8,7};
		Map<Integer,Integer> map = new HashMap<>();
		for(int i=0; i<n; i++) {
			if(map.containsKey(a[i])) {
				map.put(a[i],map.get(a[i])+1);
				if(map.get(a[i])==k) {
					System.out.println(a[i]);
					break;
				}
			}
			else {
				map.put(a[i],1);
			}
		}
	}
}
