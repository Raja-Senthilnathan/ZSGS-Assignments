package Zoho;

public class PatternProgram {
	
	public static void main(String[]args) {
		
		String s = "PROGRAM";
		char[] c = s.toCharArray();
	    int n = c.length;
	    
        if(n%2!=0) {
        	
	    for(int i=0; i<c.length; i++) {
	    	
	    	for(int j=0; j<c.length; j++) {
	    		if(i==j || i+j==n-1) {
	    			System.out.print(c[j]);
	    		}
	    		else {
	    			System.out.print(" ");
	    		}
	    	}
	    	System.out.println();
	    }
        }
        else {
        	System.out.println("0");
        }	
	}
}
