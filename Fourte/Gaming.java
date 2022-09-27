package Fourte;

import java.util.Scanner;

public class Gaming {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the resultant value");
		int result = input.nextInt();
		System.out.println("Enter the inputs four values");
		int valueOne = input.nextInt();
		int valueTwo = input.nextInt();	
		int valueThree = input.nextInt();
		int valueFour = input.nextInt();
        
		Gaming game = new Gaming();
		game.commonOperation(valueOne, valueTwo, valueThree, valueFour, result);
		game.additionOperation(valueOne, valueTwo, valueThree, valueFour, result);
		game.subtractionOperation(valueOne, valueTwo, valueThree, valueFour, result);
		game.multiplicationOperation(valueOne, valueTwo, valueThree, valueFour, result);
		game.divisionOperation(valueOne, valueTwo, valueThree, valueFour, result);
		game.withoutAddition(valueOne, valueTwo, valueThree, valueFour, result);
		game.withoutSubtraction(valueOne, valueTwo, valueThree, valueFour, result);
		game.withoutMultiplication(valueOne, valueTwo, valueThree, valueFour, result);
		game.withoutDivision(valueOne, valueTwo, valueThree, valueFour, result);
		
	}
	public void commonOperation(int valOne, int valTwo, int valThree, int valFour, int result) {
		
		if((valOne+valTwo+valThree+valFour)==result) {
			System.out.println(valOne+"+"+valTwo+"+"+valThree+"+"+valFour+"="+result);
		}
		if((valOne-valTwo-valThree-valFour)==result) {
			System.out.println(valOne+"-"+valTwo+"-"+valThree+"-"+valFour+"="+result);
		}
		if((valOne*valTwo*valThree*valFour)==result) {
			System.out.println(valOne+"*"+valTwo+"*"+valThree+"*"+valFour+"="+result);
		}
		if((valOne/valTwo/valThree/valFour)==result) {
			System.out.println(valOne+"/"+valTwo+"/"+valThree+"/"+valFour+"="+result);
		}
	}
	public void additionOperation(int valOne, int valTwo, int valThree, int valFour, int result) {
		
		if((valOne-valTwo+valThree+valFour)==result) {
			System.out.println(valOne+"-"+valTwo+"+"+valThree+"+"+valFour+"="+result);
		}
		if((valOne+valTwo-valThree+valFour)==result) {
			System.out.println(valOne+"+"+valTwo+"-"+valThree+"+"+valFour+"="+result);
		}
		if((valOne+valTwo+valThree-valFour)==result) {
			System.out.println(valOne+"+"+valTwo+"+"+valThree+"-"+valFour+"="+result);
		}
		
		if((valOne*valTwo+valThree+valFour)==result) {
			System.out.println(valOne+"*"+valTwo+"+"+valThree+"+"+valFour+"="+result);
		}
		if((valOne+valTwo*valThree+valFour)==result) {
			System.out.println(valOne+"+"+valTwo+"*"+valThree+"+"+valFour+"="+result);
		}
		if((valOne+valTwo+valThree*valFour)==result) {
			System.out.println(valOne+"+"+valTwo+"+"+valThree+"*"+valFour+"="+result);
		}
		
		if((valOne/valTwo+valThree+valFour)==result) {
			System.out.println(valOne+"/"+valTwo+"+"+valThree+"+"+valFour+"="+result);
		}
		if((valOne+valTwo/valThree+valFour)==result) {
			System.out.println(valOne+"+"+valTwo+"/"+valThree+"+"+valFour+"="+result);
		}
		if((valOne+valTwo+valThree/valFour)==result) {
			System.out.println(valOne+"+"+valTwo+"+"+valThree+"/"+valFour+"="+result);
		}
	}
    public void subtractionOperation(int valOne, int valTwo, int valThree, int valFour, int result) {
		
		if((valOne+valTwo-valThree-valFour)==result) {
			System.out.println(valOne+"+"+valTwo+"-"+valThree+"-"+valFour+"="+result);
		}
		if((valOne-valTwo+valThree-valFour)==result) {
			System.out.println(valOne+"-"+valTwo+"+"+valThree+"-"+valFour+"="+result);
		}
		if((valOne-valTwo-valThree+valFour)==result) {
			System.out.println(valOne+"-"+valTwo+"-"+valThree+"+"+valFour+"="+result);
		}
		
		if((valOne*valTwo-valThree-valFour)==result) {
			System.out.println(valOne+"*"+valTwo+"-"+valThree+"-"+valFour+"="+result);
		}
		if((valOne-valTwo*valThree-valFour)==result) {
			System.out.println(valOne+"-"+valTwo+"*"+valThree+"-"+valFour+"="+result);
		}
		if((valOne-valTwo-valThree*valFour)==result) {
			System.out.println(valOne+"-"+valTwo+"-"+valThree+"*"+valFour+"="+result);
		}
		
		if((valOne/valTwo-valThree-valFour)==result) {
			System.out.println(valOne+"/"+valTwo+"-"+valThree+"-"+valFour+"="+result);
		}
		if((valOne-valTwo/valThree-valFour)==result) {
			System.out.println(valOne+"-"+valTwo+"/"+valThree+"-"+valFour+"="+result);
		}
		if((valOne-valTwo-valThree/valFour)==result) {
			System.out.println(valOne+"-"+valTwo+"-"+valThree+"/"+valFour+"="+result);
		}
	}
    public void multiplicationOperation(int valOne, int valTwo, int valThree, int valFour, int result) {
		
		if((valOne+valTwo*valThree*valFour)==result) {
			System.out.println(valOne+"+"+valTwo+"*"+valThree+"*"+valFour+"="+result);
		}
		if((valOne*valTwo+valThree*valFour)==result) {
			System.out.println(valOne+"*"+valTwo+"+"+valThree+"*"+valFour+"="+result);
		}
		if((valOne*valTwo*valThree+valFour)==result) {
			System.out.println(valOne+"*"+valTwo+"*"+valThree+"+"+valFour+"="+result);
		}
		
		if((valOne-valTwo*valThree*valFour)==result) {
			System.out.println(valOne+"-"+valTwo+"*"+valThree+"*"+valFour+"="+result);
		}
		if((valOne*valTwo-valThree*valFour)==result) {
			System.out.println(valOne+"*"+valTwo+"-"+valThree+"*"+valFour+"="+result);
		}
		if((valOne*valTwo*valThree-valFour)==result) {
			System.out.println(valOne+"*"+valTwo+"*"+valThree+"-"+valFour+"="+result);
		}
		
		if((valOne/valTwo*valThree*valFour)==result) {
			System.out.println(valOne+"/"+valTwo+"*"+valThree+"*"+valFour+"="+result);
		}
		if((valOne*valTwo/valThree*valFour)==result) {
			System.out.println(valOne+"*"+valTwo+"/"+valThree+"*"+valFour+"="+result);
		}
		if((valOne*valTwo*valThree/valFour)==result) {
			System.out.println(valOne+"*"+valTwo+"*"+valThree+"/"+valFour+"="+result);
		}
	}
    public void divisionOperation(int valOne, int valTwo, int valThree, int valFour, int result) {
		
		if((valOne+valTwo/valThree/valFour)==result) {
			System.out.println(valOne+"+"+valTwo+"/"+valThree+"/"+valFour+"="+result);
		}
		if((valOne/valTwo+valThree/valFour)==result) {
			System.out.println(valOne+"/"+valTwo+"+"+valThree+"/"+valFour+"="+result);
		}
		if((valOne/valTwo/valThree+valFour)==result) {
			System.out.println(valOne+"/"+valTwo+"/"+valThree+"+"+valFour+"="+result);
		}
		
		if((valOne-valTwo/valThree/valFour)==result) {
			System.out.println(valOne+"-"+valTwo+"/"+valThree+"/"+valFour+"="+result);
		}
		if((valOne/valTwo-valThree/valFour)==result) {
			System.out.println(valOne+"/"+valTwo+"-"+valThree+"/"+valFour+"="+result);
		}
		if((valOne/valTwo/valThree-valFour)==result) {
			System.out.println(valOne+"/"+valTwo+"/"+valThree+"-"+valFour+"="+result);
		}
		
		if((valOne*valTwo/valThree/valFour)==result) {
			System.out.println(valOne+"*"+valTwo+"/"+valThree+"/"+valFour+"="+result);
		}
		if((valOne/valTwo*valThree/valFour)==result) {
			System.out.println(valOne+"/"+valTwo+"*"+valThree+"/"+valFour+"="+result);
		}
		if((valOne/valTwo/valThree*valFour)==result) {
			System.out.println(valOne+"/"+valTwo+"/"+valThree+"*"+valFour+"="+result);
		}
	}
    public void withoutAddition(int valOne, int valTwo, int valThree, int valFour, int result) {
		
		if((valOne/valTwo-valThree*valFour)==result) {
			System.out.println(valOne+"/"+valTwo+"-"+valThree+"*"+valFour+"="+result);
		}
		if((valOne/valTwo*valThree-valFour)==result) {
			System.out.println(valOne+"/"+valTwo+"*"+valThree+"-"+valFour+"="+result);
		}
		
		if((valOne*valTwo/valThree-valFour)==result) {
			System.out.println(valOne+"*"+valTwo+"/"+valThree+"-"+valFour+"="+result);
		}
		if((valOne*valTwo-valThree/valFour)==result) {
			System.out.println(valOne+"*"+valTwo+"-"+valThree+"/"+valFour+"="+result);
		}
		
		if((valOne-valTwo*valThree/valFour)==result) {
			System.out.println(valOne+"-"+valTwo+"*"+valThree+"/"+valFour+"="+result);
		}
		if((valOne-valTwo/valThree*valFour)==result) {
			System.out.println(valOne+"-"+valTwo+"/"+valThree+"*"+valFour+"="+result);
		}
	}
    public void withoutSubtraction(int valOne, int valTwo, int valThree, int valFour, int result) {
		
		if((valOne/valTwo+valThree*valFour)==result) {
			System.out.println(valOne+"/"+valTwo+"+"+valThree+"*"+valFour+"="+result);
		}
		if((valOne/valTwo*valThree+valFour)==result) {
			System.out.println(valOne+"/"+valTwo+"*"+valThree+"+"+valFour+"="+result);
		}
		
		if((valOne*valTwo/valThree+valFour)==result) {
			System.out.println(valOne+"*"+valTwo+"/"+valThree+"+"+valFour+"="+result);
		}
		if((valOne*valTwo+valThree/valFour)==result) {
			System.out.println(valOne+"*"+valTwo+"+"+valThree+"/"+valFour+"="+result);
		}
		
		if((valOne+valTwo*valThree/valFour)==result) {
			System.out.println(valOne+"+"+valTwo+"*"+valThree+"/"+valFour+"="+result);
		}
		if((valOne+valTwo/valThree*valFour)==result) {
			System.out.println(valOne+"+"+valTwo+"/"+valThree+"*"+valFour+"="+result);
		}
	}
    public void withoutMultiplication(int valOne, int valTwo, int valThree, int valFour, int result) {
		
		if((valOne-valTwo+valThree/valFour)==result) {
			System.out.println(valOne+"-"+valTwo+"+"+valThree+"/"+valFour+"="+result);
		}
		if((valOne-valTwo/valThree+valFour)==result) {
			System.out.println(valOne+"-"+valTwo+"/"+valThree+"+"+valFour+"="+result);
		}
		
		if((valOne/valTwo-valThree+valFour)==result) {
			System.out.println(valOne+"/"+valTwo+"-"+valThree+"+"+valFour+"="+result);
		}
		if((valOne/valTwo+valThree-valFour)==result) {
			System.out.println(valOne+"/"+valTwo+"+"+valThree+"-"+valFour+"="+result);
		}
		
		if((valOne+valTwo/valThree-valFour)==result) {
			System.out.println(valOne+"+"+valTwo+"/"+valThree+"-"+valFour+"="+result);
		}
		if((valOne+valTwo-valThree/valFour)==result) {
			System.out.println(valOne+"+"+valTwo+"-"+valThree+"/"+valFour+"="+result);
		}
	}
    public void withoutDivision(int valOne, int valTwo, int valThree, int valFour, int result) {
		
		if((valOne-valTwo+valThree*valFour)==result) {
			System.out.println(valOne+"-"+valTwo+"+"+valThree+"*"+valFour+"="+result);
		}
		if((valOne-valTwo*valThree+valFour)==result) {
			System.out.println(valOne+"-"+valTwo+"*"+valThree+"+"+valFour+"="+result);
		}
		
		if((valOne*valTwo-valThree+valFour)==result) {
			System.out.println(valOne+"*"+valTwo+"-"+valThree+"+"+valFour+"="+result);
		}
		if((valOne*valTwo+valThree-valFour)==result) {
			System.out.println(valOne+"*"+valTwo+"+"+valThree+"-"+valFour+"="+result);
		}
		
		if((valOne+valTwo*valThree-valFour)==result) {
			System.out.println(valOne+"+"+valTwo+"*"+valThree+"-"+valFour+"="+result);
		}
		if((valOne+valTwo-valThree*valFour)==result) {
			System.out.println(valOne+"+"+valTwo+"-"+valThree+"*"+valFour+"="+result);
		}
	}
}
