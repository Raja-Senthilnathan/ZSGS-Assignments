package Sep25;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileTask {
	
	public static void main(String[] args) throws IOException {
		
		FileWriter input = new FileWriter("C:\\Users\\SIVA\\Desktop\\Zoho.txt");
		BufferedWriter writer = new BufferedWriter(input);
		writer.write("Zoho School for Graduate Studies");
		writer.newLine();
		writer.write("Zoho Schools");
		writer.newLine();
		writer.write("Zoho Corporation");
		writer.newLine();
		writer.flush();
		
		FileReader output = new FileReader("C:\\Users\\SIVA\\Desktop\\Zoho.txt");
        BufferedReader reader = new BufferedReader(output);
        String line = reader.readLine();
        int lineCount = 0;
        int wordCount = 0;
        int characterCount = 0;
        while(line!=null) {
        	lineCount++;
        	System.out.println(line);
        	String[] word = line.split(" ");
        	wordCount+=word.length;
        	characterCount+=line.length();
        	line=reader.readLine();
        }
        writer.write("Number of lines : "+lineCount);
        writer.newLine();
        writer.write("Number of words : "+wordCount);
        writer.newLine();
        writer.write("Number of characters : "+characterCount);
        writer.flush();
        
        System.out.println("Number of lines : "+lineCount);
        System.out.println("Number of words : "+wordCount);
        System.out.println("Number of charcaters : "+characterCount);
        
	}
}
