package Thirukkural;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Kural {
	
	Scanner sc = new Scanner(System.in);
	public Kural() throws IOException {
		
		FileReader input = new FileReader("C:\\Users\\SIVA\\Desktop\\Kural.txt");
		BufferedReader reader = new BufferedReader(input);
		String line = reader.readLine();
		int lineCount = 0;
		System.out.println("நீங்கள் விரும்பும் குறள் எண்ணைக் கொடுங்கள்");
		int kural = sc.nextInt();
		for(int i=0; i<kural*2; i++) {
			if(lineCount>=(kural*2)-2) {
				System.out.print(line);
				System.out.println();
			}
			line = reader.readLine();
			lineCount++;
		}	
	}
}
