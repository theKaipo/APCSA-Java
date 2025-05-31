import java.util.Scanner;

public class SumOfThree {

	public static void main(String[] args) {
		// Coded by Kaipo Ojas
		//September 30, 2024
		//Declare three vars and find the ouptut their sum
		Scanner kb = new Scanner(System.in);
		
		//Declaring and intialize
		System.out.print("Enter number one: ");
		int numOne = kb.nextInt();
		System.out.print("Enter number two: ");
		int numTwo = kb.nextInt();
		System.out.print("Enter number three: ");
		int numThree = kb.nextInt();
		
		//Do the Math
		int sum = numOne + numTwo + numThree;
		
		//Output results
		System.out.println("The sum is: " + sum);

	}

}
