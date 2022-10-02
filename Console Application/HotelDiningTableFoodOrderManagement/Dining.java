package HotelDiningTableFoodOrderManagement;

import java.util.Map.Entry;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Dining {
	 
    Scanner input = new Scanner(System.in);
	Map<String,Integer> orderedFood = new HashMap<String,Integer>();
	Food food = new Food();
	Admin admin = new Admin();
	static int billNo=100;
	
	public void orderOption() {
         
		System.out.println("Choose the Options");
		System.out.println("------------------");
		System.out.println("0)Change Table \n1)Take Order \n2)Show Order \n3)Cancel Order \n4)Bill");
		int option = input.nextInt();
		switch (option) {
		case 0 : admin.tables();
		         break;
		case 1 : foodCategory();
		         break;
		case 2 : showOrder();
		         break;
		case 3 : cancelOrder();
		         break;
		case 4 : bill();
		         break;
		default : System.out.println("Invalid input \nPlease choose the correct option");
		          System.out.println("--------------------------------");
		          orderOption();
		          break;
		}
	}
    public void foodCategory() {
		
		food.dishes();
		System.out.println("Choose the category");
		System.out.println("-------------------");
		System.out.println("0)Back \n1)Pizza \n2)Burger \n3)Sandwich \n4)Drinks \n5)Shakes");
		int category = input.nextInt();
		
		if(category==0) {
			orderOption();
		}
		else if(category>=1 && category<=5) {
			foodDisplay(category-1);
		}
		else {
			System.out.println("That category is not available \nPlease choose within the category");
			System.out.println("---------------------------------");
	        foodCategory();
		}
	}
	public void foodDisplay(int category) {
		
		System.out.println("Select the Dish");
		System.out.println("---------------");
		Set<Entry<String,Double>> entrySet = Food.menu.get(category).entrySet();
        int index=0;
        System.out.println(0+")Back to mainmenu");
        for(Entry<String,Double> iterate : entrySet) {
        	index++;
        	System.out.printf("%d)%-20s%-5.2f\n",index,iterate.getKey(),iterate.getValue());
        }
        foodOrder(category);  
	}
	public void foodOrder(int category) {
	
		int customerChoice = input.nextInt();
		if(customerChoice==0) {
			foodCategory();
		}
		else if(customerChoice>=1 && customerChoice<=Food.menu.get(category).size()) {
			int index=0;
			Set<Entry<String,Double>> entrySet = Food.menu.get(category).entrySet();
			for(Entry<String,Double> iterate : entrySet) {
				if(index==customerChoice-1) {
					System.out.println("Enter the quantity");
					System.out.println("------------------");
					int quantity = input.nextInt();
					if(orderedFood.containsKey(iterate.getKey())) {
						existingOrder(iterate.getKey(),quantity,category);
					}
					else {
					    orderedFood.put(iterate.getKey(), quantity);
	                    foodCategory();
					}
				}
				index++;
			}
		}
		else {
			System.out.println("Invalid input \nPlease choose with in the category");
			System.out.println("----------------------------------");
			foodDisplay(category);
		}
	}
	public void existingOrder(String existingFood, int newQuantity, int category) {
		
		Set<Entry<String,Integer>> entrySet = orderedFood.entrySet();
		for(Entry<String,Integer> iterate : entrySet) {
			if(iterate.getKey()==existingFood) {
				orderedFood.put(existingFood, iterate.getValue()+newQuantity);
				foodCategory();
			}
		}
	}
	public void showOrder() {
		
		System.out.println("This is your order");
		System.out.println("------------------");
		int index = 0;
		Set<Entry<String,Integer>> entrySet = orderedFood.entrySet();
		for(Entry<String,Integer> iterate : entrySet) {
			index++;
			System.out.printf("%d)%-20s%3d\n",index,iterate.getKey(),iterate.getValue());
		}
		System.out.println();
		orderOption();
	}
	public void cancelOrder() {
		
		System.out.println("Select the item that you want to cancel");
		System.out.println("---------------------------------------");
		int index = 0;
		System.out.println(index+")Back");
		Set<Entry<String,Integer>> entrySet = orderedFood.entrySet();
		for(Entry<String,Integer> iterate : entrySet) {
		    index++;
		    System.out.printf("%d)%-20s%3d\n",index,iterate.getKey(),iterate.getValue());
		}
		int cancellation = input.nextInt();
		index = 0;
		for(Entry<String,Integer> iterate : entrySet) {
		    if(index==cancellation-1) {
		    	orderedFood.remove(iterate.getKey());
		    	System.out.println("Successfully cancelled the item");
		    	System.out.println("-------------------------------");
		    	System.out.println();
		    	orderOption();
		    	break;
		    }
		    index++;
		}
	}
	public void bill() {
		
		DateTimeFormatter dateformatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		LocalDate date = LocalDate.now();
		double total=0;
		billNo++;
		System.out.println("----------------------------------------");
		System.out.printf("%26s\n","CHAAT CHATORE");
		System.out.printf("%s%d%28s\n","Bill.No:",billNo,dateformatter.format(date));
		System.out.println("----------------------------------------");
		System.out.printf("%-5s%-20s%s%9s\n","Qty","Description","Price","Total");
		System.out.println("----------------------------------------");
		Set<Entry<String,Integer>> entrySet = orderedFood.entrySet();
		for(int index=0; index<Food.menu.size(); index++) {
			Set<Entry<String,Double>> menuEntrySet = Food.menu.get(index).entrySet();
			for(Entry<String,Double> iterateMenu : menuEntrySet) {
				for(Entry<String,Integer> iterate : entrySet) {
					if(iterate.getKey()==iterateMenu.getKey()) {
						double value = iterate.getValue()*iterateMenu.getValue();
						total+=value;
						System.out.printf("%-5d%-20s%-6.2f%9.2f\n",iterate.getValue(),iterate.getKey(),iterateMenu.getValue(),value);
						orderedFood.remove(iterate.getKey());
					    break;
					}
				}
			}
			}
		double gst = total*0.05;
		total = total+gst;
		System.out.println("----------------------------------------");
		System.out.printf("%31s%9.2f\n","Gst 5%",gst);
		System.out.printf("%31s%9.2f\n","Grand Total",total);
		System.out.println("----------------------------------------");
		admin.tables();
	}
}

