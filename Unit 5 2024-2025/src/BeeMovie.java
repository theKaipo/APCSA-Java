import java.util.*;
import java.io.*;

public class BeeMovie {

	public static void main(String[] args) throws FileNotFoundException {
		// Coded by Kaipo Ojas
		//Jan 16, 2025
		//CS121/APCSA
		
		Scanner kb = new Scanner(System.in);
		
		System.out.print("Enter input file: ");
		String fileName = kb.next(); //May need to put src/fileName
		
		Scanner input = new Scanner(new File(fileName)); 
		fileReader(input, kb);
	}//end of class
	
	public static void fileReader(Scanner file, Scanner kb) {
		int wordCount = 1;
		boolean answer = true;
		
		while(file.hasNext() && answer == true) {
			String wordCorrect = file.next();
			
			System.out.print("What is word " + wordCount + "? ");
			String wordGuess = kb.next();
			
			if(wordGuess.equals(wordCorrect) && answer == true) {
				answer = true;
			} else {
				//Add the BZZZ correct	
				System.out.println("BZZZ: Correct Answer - " + wordCorrect);
				answer = false;
				System.out.print("Incorrect");
				System.out.println();
				System.out.println("You got " + (wordCount - 1) + " word(s) correct, nice job!");
			}
			wordCount++;
		}
	}
}//end of main
