package Sep15;

import java.util.Stack;

public class StackMethods {
	
	public static void main(String[]args) {
	       
	      Stack s = new Stack();
	      //push is used to add the element
	      s.push("Zoho");
	      s.push("School");
	      s.push("for");
	      s.push("Graduates");
	      
	      System.out.println(s);
	      
	      //pop is used to delete the last element 
	      System.out.println(s.pop());

	      //peek is used to print the last element
	      System.out.println(s.peek());
	      
	      System.out.println(s);
			
		}

}
