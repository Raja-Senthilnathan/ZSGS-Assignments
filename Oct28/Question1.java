package Oct28;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question1 {
	
	public static void main(String[] args) {
		
		String s = "abbab";
		List<String> list = new ArrayList<>();
		int i=0, j=1, k=1;
		while(k<s.length()) {
			if(j>s.length()) {
				i=0;
				k++;
				j=i+k;
			}
			char[] c = s.substring(i, j).toCharArray();
			Arrays.sort(c);
			list.add(new String(c));
			i++;
			j=i+k;
		}
		int result=0;
		for(int x=0; x<list.size()-1; x++) {
			for(int y=x+1; y<list.size(); y++) {
				if(list.get(x).equals(list.get(y))) {
					System.out.println(list.get(x)+" "+list.get(y));
					result++;
				}
			}
		}
		System.out.println(result);
	}
}
