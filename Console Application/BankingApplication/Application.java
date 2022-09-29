package BankingApplication;

import java.util.Scanner;

public class Application {
	
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Welcome to Indian Bank");
		welcome();
	}
	public static void welcome() {
		  Banking banking = new Banking();
		  banking.addCustomerData();
		  System.out.println("Choose any one \n1)Create Account \n2)Already have an Account \n3)Exit");
		  int choice = input.nextInt();
		
		  switch(choice){
			case 1 : banking.newCustomer();
			         break;
				
			case 2 : banking.existingCustomer();
			         break;
				
			case 3 : System.out.println("Thank you !!!");
			         break;
		}
	}
}
