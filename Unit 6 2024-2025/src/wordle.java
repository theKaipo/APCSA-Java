import java.util.*;
import java.io.*;
public class wordle {
	public static void main(String[] args) throws FileNotFoundException {
		// Coded by Kaipo Ojas
		//2/13/2025
		//APCSA//CS121
		
		Scanner input = new Scanner(new File("src/wordle_words.txt"));
		Scanner kb = new Scanner(System.in);
		
		//Getting a random word from file
		int random = (int)(Math.random() * 19) + 1;
		for(int j = 1; j <= random; j++)
			input.nextLine();
		
		String wordle = input.nextLine();
		wordle = wordle.toLowerCase();
		//System.out.println(wordle);
		char[] answer = new char[5];
		answer = wordle.toCharArray();
		int guessNum = 0;
		char[] resp = new char[5];
		
		boolean complete = false;
		//Checks if the wordle is complete and play on if not
		while(!complete && guessNum < 6) {
			//Compute
			int[] output = {0, 0, 0, 0, 0};
			System.out.print("Enter your guess: ");
			String guess = kb.next();
			guess = guess.toLowerCase();
			resp = guess.toCharArray();
			
			//Makes sure its right number of letters
			if(guess.length() == 5) {
				//For loop checking by placeholder numerical values
				for(int i = 0; i< guess.length(); i++) {
					for(int j = 0; j < wordle.length(); j++) {
						if(resp[i] == answer[j] && i == j) {
							output[i] = 3;
						} else if(resp[i] == answer[j] ) {
							if(output[i] < 2) {
								output[i] = 2;
							}
						} else {
							if(output[i] < 1) {
								output[i] = 1;
							}
						}
					}//end of j-loop
				}//end of i-loop
				//Decode numerical values
				String[] results = new String[5];
				for(int i = 0; i < wordle.length(); i++) {
					if(output[i] == 3) {
						results[i] = "green";
					} else if(output[i] == 2) {
						results[i] = "yellow";
					} else {
						results[i] = "grey";
					}
				}
				//Print result
				for(String r:results) {
					System.out.print(r + " ");
				}
				System.out.println();	
				guessNum++;
				
				//Check if all correct
				int checker = 0;
				for(String i:results) {
					if(i == "green" ) {
						checker++;
					}
				}
				if(checker == 5) {
					complete = true;
					System.out.println("You have completed the wordle!");
				}
			} else {
				System.out.println("Wrong number of letters");
			}
		}//end of while
		//Checks if user has reached 6 attempts
		if (guessNum == 6) {
			System.out.println("You have failed the wordle!");
		}//end of if
	}//end of main
}//end of class



