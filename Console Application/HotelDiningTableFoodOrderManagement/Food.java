package HotelDiningTableFoodOrderManagement;

import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Food {
	
	Map<String,Double> pizza = new HashMap<String,Double>();
	Map<String,Double> burger = new HashMap<String,Double>();
	Map<String,Double> sandwich = new HashMap<String,Double>();
	Map<String,Double> drinks = new HashMap<String,Double>();
	Map<String,Double> shakes = new HashMap<String,Double>();
	static List<Map<String,Double>> menu = new ArrayList<>();
	
	public void dishes() {
		
		menu.add(pizza);
		menu.add(burger);
		menu.add(sandwich);
		menu.add(drinks);
		menu.add(shakes);
		
		pizza.put("Chicken Pizza", 280.00);
		pizza.put("Corn Cheese Pizza", 200.00);
		pizza.put("Mushroom Pizza", 230.00);
		pizza.put("Panner Pizza", 230.00);
		pizza.put("Veg Pizza", 180.00);
		
		burger.put("Beef Burger", 230.00);
		burger.put("Chicken Burger", 250.00);
		burger.put("Spicy Burger", 180.00);
		burger.put("Tower Burger", 450.00);
		burger.put("Veg Burger",150.00);
		
		sandwich.put("Chicken Sandwich", 130.00);
		sandwich.put("Egg Sandwich", 80.00);
		sandwich.put("Mushroom Sandwich", 100.00);
		sandwich.put("Panner Sandwich", 100.00);
		sandwich.put("Veg Grill Sandwich",60.00);
		
		drinks.put("Apple Juice", 60.00);
		drinks.put("Banana Juice", 50.00);
		drinks.put("Grapes Juice", 80.00);
		drinks.put("Kirini Juice", 60.00);
		drinks.put("Lime Juice", 40.00);
		drinks.put("Orange Juice", 70.00);
		drinks.put("Pineapple Juice", 60.00);
		drinks.put("Sugarcane Juice", 50.00);
		drinks.put("Watermelon Juice", 60.00);
		
		shakes.put("Chocolate Shake", 90.00);
		shakes.put("Falooda", 210.00);
		shakes.put("Kit Kat Shake", 110.00);
		shakes.put("Monster Shake", 170.00);
		shakes.put("Oreo Shake", 110.00);
		shakes.put("Sharjah Shake", 120.00);
		shakes.put("Snickers Shake", 120.00);
		shakes.put("Stawberry Shake", 100.00);
	}
}
