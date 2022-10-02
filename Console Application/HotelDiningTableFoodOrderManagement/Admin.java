package HotelDiningTableFoodOrderManagement;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Admin {
	
	Scanner input = new Scanner(System.in);
	static List<Dining> dining;
	
	public void pin() {
		
		dining = new ArrayList<Dining>();
		
		dining.add(new Dining());
		dining.add(new Dining());
		dining.add(new Dining());
		dining.add(new Dining());
		dining.add(new Dining());
		
		int pin = 1234;
		int userPin = input.nextInt();
		if(pin==userPin) {
			tables();
		}
		else {
			System.out.println("Invalid Credentials \nPlease enter valid pin");
			pin();
		}
	}
	public void tables() {
		
		System.out.println("Choose the Table");
		System.out.println("----------------");
		System.out.println("0)Exit \n1)Table 1 \n2)Table 2 \n3)Table 3 \n4)Table 4 \n5)Table 5");
		int table = input.nextInt();
		if(table>=1 && table<=5) {
			dining.get(table-1).orderOption();
		}
		else if(table==0) {
			System.out.println("Thank you!!!");
		}
		else {
			System.out.println("Invalid input \nPlease choose table within the option");
		}
	}
}
