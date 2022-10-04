package Thirukkural;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Adhikaram {
	
	    Scanner sc = new Scanner(System.in);
	public Adhikaram() throws IOException {
		
		FileReader input = new FileReader("C:\\Users\\SIVA\\Desktop\\Adhikaram.txt");
		BufferedReader reader = new BufferedReader(input);
		String line = reader.readLine();
		System.out.println("நீங்கள் விரும்பும் அதிகாரம் எண்ணைக் கொடுங்கள்");
		int adhikaram = sc.nextInt();
		int lineCount=0;
		for(int i=0; i<adhikaram*22; i++) {
			if(lineCount>=(adhikaram*22)-22) {
				System.out.print(line);
				System.out.println();
			}
			line = reader.readLine();
			lineCount++;
		}	
	}
}
