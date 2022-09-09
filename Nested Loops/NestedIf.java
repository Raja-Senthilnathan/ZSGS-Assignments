package Zoho;

import java.util.Scanner;

public class NestedIf {
	
	public static void main(String[]args) {
		
		System.out.println("Enter the Marks");
        Scanner sc = new Scanner(System.in);
		int marks = sc.nextInt();
        
		if(marks<=50) {
			
			if(marks<35) {
				System.out.println("Below Average");
			}
			else {
				System.out.println("Average");
			}
		}
		else {
			if(marks<75) {
				System.out.println("Above Average");
			}
			else {
				System.out.println("Good");
			}
		}	
	}
}
