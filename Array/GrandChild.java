package Zoho;

public class GrandChild {
	
public static void main(String[]args) {
		
		String[][] name = {{"luke","shaw"},
						   {"wayne","rooney"},
						   {"rooney","ronaldo"},
		                   {"shaw","rooney"}}; 
		String target = "ronaldo";
		String child = "";
		int j = 1;
		int count = 0;
	    
	    for(int i=0; i<name.length; i++) {
	    		if(name[i][j]==target) {
	    			child = name[i][j-1];
	    			break;
	    	}
	    }
	    
	    for(int i=0; i<name.length; i++) {
	    	if(name[i][j]==child) {
	    		count++;
	    	}
	    }
	    System.out.println("Number of Grand Child for Ronaldo is : " +count);
	}

}
