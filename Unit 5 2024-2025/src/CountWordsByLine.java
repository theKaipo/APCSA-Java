import java.util.*;
import java.io.*;

public class CountWordsByLine {

	public static void main(String[] args) throws FileNotFoundException {
		// Coded by Kaipo Ojas
		//January 15, 2025
		//CS121/APCSA
		//Prints number of words per line
		
		Scanner fileScan = new Scanner(new File("src/jabberwock.txt"));
		countWordsPerLines(fileScan);
	}//end of main
	
	public static void countWordsPerLines(Scanner fileScan) {
		while (fileScan.hasNextLine()) {
			String line = fileScan.nextLine();
			Scanner lineScan = new Scanner(line);
			//Creates lineScan with one line to use Scanner methods
			int count = 0;
			//Manipulation of a single line
			while(lineScan.hasNext()) {
				String word = lineScan.next();
				count++;
			}
			System.out.println("Line has " + count + " words.");
		}//end of file loop
	}//end of countWords method

}//end of class
