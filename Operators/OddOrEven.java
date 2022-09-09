package Zoho;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OddOrEven {
	
	public static boolean method(int n) {
		
		if((n&1)==0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static void main(String[]args) {

		System.out.println("Enter a value");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        System.out.println(method(n)==true ? "Even" : "Odd");
		
	}
}
     
     