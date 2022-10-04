package Thirukkural;

import java.io.IOException;
import java.util.Scanner;

public class Main {
	
	Scanner input = new Scanner(System.in);
	public static void main(String[] args) throws IOException {
		
		Main main = new Main();
		main.choice();
		
	}
	public void choice() throws IOException {
		
		System.out.println("ஏதேனும் ஒன்றை தேர்வு செய்யவும் \n1)அதிகாரம் \n2)குறள்");
		int options = input.nextInt();
		switch(options) {
		case 1 : Adhikaram adhikaram = new Adhikaram();
		         break;
		case 2 : Kural kural = new Kural();
		         break;
		default : System.out.println("Invalid input");
		          choice();
		}	
	}
}
