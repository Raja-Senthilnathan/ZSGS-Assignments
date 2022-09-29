package Sep15;

import java.util.Random;
import java.util.Scanner;

public class StonePaperScissor {
	
	public static void main(String[]args) {
		
		int i;
		String[] options = {"Stone", "Paper", "Scissor"};
		Random r = new Random();
		String computer = options[r.nextInt(options.length)];
		System.out.println("Let's Play");
        System.out.println("Choose any one of this number \n0)Stone\n1)Paper\n2)Scissor");
        Scanner sc = new Scanner(System.in);
        i = sc.nextInt();
        if(i>2) {
        	System.out.println("Invalid Input");
        	System.out.println("Please choice from this number 0,1,2");
        	i=sc.nextInt();
        }
        String player = options[i];
        System.out.println("Your choice is : "+player);
		System.out.println("Computer's choice is : "+computer);
		
		if(computer.equals(player)) {
			System.out.println("Match Draw");
		}
		else if(computer.equals("Stone")) {
			if(player.equals("Paper")) {
				System.out.println("You Win");
			}
			else {
				System.out.println("Computer Win");
			}
		}
		else if(computer.equals("Paper")) {
			if(player.equals("Scissor")) {
				System.out.println("You Win");
			}
			else {
				System.out.println("Computer Win");
			}
		}
		else if(computer.equals("Scissor")) {
			if(player.equals("Stone")) {
				System.out.println("You Win");
			}
			else {
				System.out.println("Computer Win");
			}
		}
		System.out.println("Game Ends");
	}

}
