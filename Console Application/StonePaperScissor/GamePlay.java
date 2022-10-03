package StonePaperScissor;

import java.util.Random;
import java.util.Scanner;

public class GamePlay {
	
	Scanner input = new Scanner(System.in);
	
	public void game() {
		
		System.out.println("Enter a number of games you want to play");
		int noOfGames = input.nextInt();
		int playerCount=0;
		int computerCount=0;
	for(int j=0; j<noOfGames; j++) {	
		int i;
		String[] options = {"Stone", "Paper", "Scissor"};
		Random r = new Random();
		String computer = options[r.nextInt(options.length)];
		System.out.println("Let's Play");
        System.out.println("Choose any one of this number \n0)Stone\n1)Paper\n2)Scissor");
        i = input.nextInt();
        if(i>2) {
        	System.out.println("Invalid Input");
        	System.out.println("Please choice from this number 0,1,2");
        	i=input.nextInt();
        }
        String player = options[i];
        System.out.println("Your choice is : "+player);
		System.out.println("Computer's choice is : "+computer);
		
		if(computer.equals(player)) {
			System.out.println("Draw");
		}
		else if(computer.equals("Stone")) {
			if(player.equals("Paper")) {
				playerCount++;
				System.out.println("You got "+playerCount+" points");
			}
			else {
				computerCount++;
				System.out.println("Computer got "+computerCount+" points");
			}
		}
		else if(computer.equals("Paper")) {
			if(player.equals("Scissor")) {
				playerCount++;
				System.out.println("You got "+playerCount+" points");
			}
			else {
				computerCount++;
				System.out.println("Computer got "+computerCount+" points");
			}
		}
		else if(computer.equals("Scissor")) {
			if(player.equals("Stone")) {
				playerCount++;
				System.out.println("You got "+playerCount+" points");
			}
			else {
				computerCount++;
				System.out.println("Computer got "+computerCount+" points");
			}
		}
	}
	if(playerCount>computerCount) {
		System.out.println("You win the series");
	}
	else if(playerCount<computerCount) {
		System.out.println("Computer win the series");
	}
	else {
		System.out.println("This series is Draw");
	}
	   System.out.println("Game Ends");
	}
}
