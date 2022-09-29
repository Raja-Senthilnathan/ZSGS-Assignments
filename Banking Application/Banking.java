package BankingApplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Banking {
	
	    static List<CustomerData> customers = new ArrayList<CustomerData>();
	    static Scanner input = new Scanner(System.in);
	    static int a=0;
	    int acc;
	    int pass;
	    
	public void addCustomerData() {
		
		customers.add(new CustomerData("Antany", 12345, 500, 622423565, "Karaikudi"));
		customers.add(new CustomerData("Seralathan", 12345, 500, 633423565, "Namakkal"));
		customers.add(new CustomerData("Ram Kumar", 12345, 500, 622423656, "Kumbakonam"));
		a=customers.size();
	
	}
	public void newCustomer() {
		
		System.out.println("Enter your name");
		String name =input.nextLine();
		System.out.println("Enter your contact number");
		long contact = input.nextLong();
		System.out.println("Enter your city");
		String city = input.next();
		System.out.println("Deposit minimum balance of amount rupees 500 or more");
		double minBal = input.nextDouble();
		System.out.println("Enter your password");
		int password = input.nextInt();
		
		customers.add(new CustomerData(name, password, minBal, contact, city));
		a++;
		System.out.println("Your account has been created successfully");
		System.out.println(customers.get(a-1).getAccountNumber()+" this is your account number");
		Application.welcome();
	}
	public void existingCustomer() {
		
		System.out.println("Enter your account number");
		acc = input.nextInt();
		System.out.println("Enter your password");
		pass = input.nextInt();
		operations();
	}	
	public void operations() {	
		int check=0;
		for(int i=0; i<customers.size(); i++) {
			if((customers.get(i).getAccountNumber()==acc)&&(customers.get(i).getPassword()==pass)) {
				System.out.println("Choose any one \n1)Withdraw \n2)Deposit \n3)Balance Enquiry \n4)Exit");
				int choice = input.nextInt();
				logIn(choice,i);
				check++;
			}
		}
		if(check==0) {
				System.out.println("Your account number or password is incorrect");
				System.out.println("Please enter correct details");
				existingCustomer();
		}
	}
    public void logIn(int choice,int index) {
    	
    	switch(choice) {
    	case 1 : withdraw(index);
    	         break;
    	
    	case 2 : deposit(index);
    	         break;
    	
    	case 3 : balanceEnquiry(index);
    	         break;
    	
    	default :System.out.println("Thank you !!!");
    		     break;
    	}
    }
	private void balanceEnquiry(int index) {
		
		System.out.println("Your Balance is :"+customers.get(index).getMinimumBalance());
		System.out.println("Thank You !!!");
		
	}
	private void deposit(int index) {
		
		System.out.println("Enter the deposit amount");
		double deposit = input.nextDouble();
		if(deposit>0) {
			double dep = customers.get(index).getMinimumBalance()+deposit;
			customers.get(index).setMinimumBalance(dep);
			System.out.println("Amount successfully deposited in your account");
			System.out.println("After deposition your balance is :"+dep);
			operations();
		}
		else {
			System.out.println("Invalid amount \nplease deposit the valid amount");
			deposit(index);
		}
	}
	private void withdraw(int index) {
		
		System.out.println("Enter the withraw amount");
		double withdrawAmount = input.nextDouble();
		if(customers.get(index).getMinimumBalance()-withdrawAmount>=0) {
			double balance = customers.get(index).getMinimumBalance()-withdrawAmount;
			customers.get(index).setMinimumBalance(balance);
			System.out.println("Your withdrawal is successful");
			System.out.println("After withdrawal your Balance is :"+balance);
			operations();
		}
		else {
			System.out.println("Insufficient balance \nchoose the amount within the balance");
			withdraw(index);
		}
	}
}
