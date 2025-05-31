import java.util.Scanner;

public class MoreForLoops {

	public static void main(String[] args) {
		// Coded by Kaipo Ojas
		//October 29, 2024
		//CS 121/APCSA
		//Practice of For Loops
		
		//Every fourht letter
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter a word: ");
		String word = kb.nextLine();
		System.out.println(everyFourthLetter(word));
		
		//Sum of Numbers
		/*System.out.print("Enter a number: ");
		int num = kb.nextInt(); */
		
		int num = (int)(Math.random()*10)+1;
		System.out.println("The sum of all the numbers between 1 and "+ num +
				" is: " + sumOfAllNumbers(num));
		
		//Factorial of Numbers
		/*System.out.print("Enter a number: ");
		int n = kb.nextInt();*/
		
		int n = (int)(Math.random() * 10)+1;
		System.out.println("The factorial of the numbers between 1 and " + n +
				" is: " + factOfAllNum(n));
		
		//Print Text Copy
		String text = "Hi";
		int repeatTimes = 3;
		
		System.out.println(stringTimes(text, repeatTimes));
		
		//
		String frontWord = "Chocolate";
		int numOfLetters = 3;
		int numOfTimes = 2;
		System.out.println(frontTimes(frontWord, numOfTimes, numOfLetters));
		
	}//end of main
	
	public static String everyFourthLetter(String word) {
		String smallWord = "";
		for (int i = 0; i < word.length(); i += 4) {
			smallWord += word.charAt(i);
		}
		return smallWord;
	}//end of method
	
	//Write method that given number and calculates the sum of the first 10.
	//Like sum of 1 to 10 = 55
	
	public static int sumOfAllNumbers(int num) {
		int sum = 0;
		for (int i = 1; i <= num; i++) {
			sum += i;
		}
		return sum;
	}//end of method

	public static int factOfAllNum(int num) {
		int sum = 1;
		for (int i = 1; i <= num; i++) {
			sum *= i;
		}
		return sum;
	}//end of method
	
	public static String stringTimes(String word, int num) {
		String localWord = "";
		for (int i = 1; i<= num; i++) {
			localWord += word;
		}
		
		return localWord;
	}//end of method
	
	public static String frontTimes(String word, int numOfTimes, int numOfLetters) {
		String localWord = "";
		for(int i = 0; i < numOfTimes; i++ ) {
			localWord += word.substring(0, numOfLetters);
		}
		return localWord;
	}
	
}//end of class
