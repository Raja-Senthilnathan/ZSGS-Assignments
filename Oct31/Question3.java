package Evaluation;

public class Question3 {
	
	public static void main(String[] args) {
		
		String s = "XBXAXB";
		
		String s1 = "", s2= "";
		int count=0;
		for(int i=0; i<s.length(); i++) {
			for(int j=i+1; j<s.length(); j++) {
				s1=""+s.charAt(i)+s.charAt(j);
				for(int k=j+1; k<s.length(); k++) {
					for(int l=k+1; l<s.length(); l++) {
						s2=""+s.charAt(k)+s.charAt(l);
						if(s1.equals(s2)) {
							count++;
						}
					}
				}
			}
		}
		System.out.println(count);
	}
}
