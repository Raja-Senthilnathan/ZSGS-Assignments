package Zoho;

public class Bitwise {
	
	public static void main(String[]args) {
		
		int a = 10;
		int b = 20;
		
		System.out.println("Before Swap a is : "+a);
		System.out.println("Before Swap b is : "+b);
		
		a = a^b;
		b = a^b;
		a = a^b;
		
		System.out.println("After Swap a is : "+a);
		System.out.println("After Swap b is : "+b);
		
	}
}
