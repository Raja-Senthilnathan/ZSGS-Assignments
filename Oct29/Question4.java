package Tenkasi;

public class Question4 {
	
	public static void main(String[] args) {
		String s = "ZOHOISHIRINGFORSOFTWAREDEVELOPER";
		int row=8;
		printZigzag(s,row);
	}
    public static void printZigzag(String s, int row) {
    	
    	String[][] zz = new String[row][s.length()];
    	int i=0, j=0, index=0;
    	while(index<s.length()) {
    		while(i<row && index<s.length()) {
    			zz[i][j]=""+s.charAt(index);
    			i++;
    			index++;
    		}
    		i-=2;
    		j++;
    		while(i>0 && index<s.length()) {
    			zz[i][j]=""+s.charAt(index);
    			i--;
    			j++;
    			index++;
    		}
    	}
    	for(int x=0; x<row; x++) {
    		for(int y=0; y<s.length(); y++) {
    			if(zz[x][y]!=null)
    			System.out.print(zz[x][y]+" ");
    			else
    		    System.out.print("  ");		
    		}
    		System.out.println();
    	}
    }		
}
