package CalculatorApplication;

import java.util.Scanner;

public class Calculator {
	
	static Scanner input = new Scanner(System.in);
	
    public void operations(double inputOne) {
       
       System.out.println("press c to clear (or)");
	   System.out.println("choose the operator \n+     - \n*     / \n%     =");
	   System.out.println("sqrt  pow");
	   String operator = input.next();
	   
       switch(operator) {
       case "+" : addition(inputOne);
                  break;
       case "-" : subtraction(inputOne);
                  break;
       case "*" : multiplication(inputOne);
                  break;
       case "/" : division(inputOne);
                  break;
       case "%" : modulus(inputOne);
                  break;
       case "=" : result(inputOne);
                  break;
       case "c" : Main.method();
                  break;
       case "sqrt" : squareRoot(inputOne);
                     break;
       case "pow" : power(inputOne);
                    break;
       default : System.out.println("Invalid operator \nChoose correct Operator");
                 operations(inputOne);
       }
    }
	private void result(double inputOne) {
		
		System.out.println(inputOne);
	
	}
	private void power(double inputOne) {
		
		System.out.println("Enter the value");
		double inputTwo = input.nextDouble();
		double result = Math.pow(inputOne, inputTwo);
		System.out.println(result);
		operations(result);
		
	}
	private void squareRoot(double inputOne) {
	
		double result = Math.sqrt(inputOne);
		System.out.println(result);
		operations(result);
		
	}
	private void modulus(double inputOne) {
		
		System.out.println("Enter the value");
		double inputTwo = input.nextDouble();
		double result = inputOne%inputTwo;
		System.out.println(result);
		operations(result);
		
	}
	private void division(double inputOne) {
		
		System.out.println("Enter the value");
		double inputTwo = input.nextDouble();
		double result = inputOne/inputTwo;
		System.out.println(result);
		operations(result);
		
	}
	private void multiplication(double inputOne) {
		
		System.out.println("Enter the value");
		double inputTwo = input.nextDouble();
		double result = inputOne*inputTwo;
		System.out.println(result);
		operations(result);
		
	}
	private void subtraction(double inputOne) {
		
		System.out.println("Enter the value");
		double inputTwo = input.nextDouble();
		double result = inputOne-inputTwo;
		System.out.println(result);
		operations(result);
		
	}
	private void addition(double inputOne) {
	    
		System.out.println("Enter the value");
		double inputTwo = input.nextDouble();
		double result = inputOne+inputTwo;
		System.out.println(result);
		operations(result);
	}
}
