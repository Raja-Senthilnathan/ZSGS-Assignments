package CalculatorApplication;

import java.util.Scanner;

public class Main {
	
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		
          method();
          
	}
	public static void method() {
		
		System.out.println("Enter the value");
		double inputOne = input.nextDouble();
        Calculator calc = new Calculator();
        calc.operations(inputOne);
        
	}
}
