package Sep15;

import java.util.*;

public class Deque {
	
	public static void main(String[]args) {
		
		ArrayDeque<Integer> adq = new ArrayDeque<>();
		
		adq.offerFirst(1);
		adq.offerFirst(2);
		adq.offerFirst(3);
		adq.offerFirst(4);
		adq.offerFirst(5);
		System.out.println(adq);
        
 		System.out.println("Remove the first elment : "+adq.pollFirst());
		
		adq.offerLast(10);
		adq.offerLast(20);
		adq.offerLast(30);
		adq.offerLast(40);
		adq.offerLast(50);
		System.out.println(adq);

		System.out.println("Remove the last element : "+adq.pollLast());
		
		System.out.println("Return the first element : "+adq.peekFirst());
		System.out.println("Return the last element : "+adq.peekLast());
		
		System.out.println(adq);
	}

}
