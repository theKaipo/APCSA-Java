import java.util.Scanner;

public class WordInWord {

	public static void main(String[] args) {
		//Coded by Kaipo Ojas
		//December 10, 2024
		//CS121/APCSA
		//Substring practice with loops
		
		Scanner kb = new Scanner(System.in);
		String again="y";
		
		while(again.equalsIgnoreCase("y")) {
			//User Input
			System.out.print("Please enter a word: ");
			String word = kb.next();
			
			System.out.print("Please enter a word to look for: ");
			String sub = kb.next();
			
			System.out.println(findSub(word, sub));
			
			//Play again loop
			System.out.print("Play again? --> (y/n): ");
			again = kb.next();
		}//end of while
		
	}//end of main
	
	public static String findSub(String word, String subword) {
		boolean flag = false;
		String result = "";
		
		for(int i = 0; i <= word.length()-subword.length(); i++) {
			String portion = word.substring(i, i + subword.length());
			if (portion.equals(subword)) 
				flag = true;
		}//end of for loop
		
		if(flag)
			result += "We found the smaller string";
		else
			result += "We did not find the smaller substring";
		
		return result;
	} //end of method
}//end of class
