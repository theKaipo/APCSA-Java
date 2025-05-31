import java.util.Scanner;

public class EvenOddWithWhileLoop {

	public static void main(String[] args) {
		// Coded by Kaipo Ojas
		//December 3, 2024
		//CS121/APCSA
		//While loop with selection/random
		
		Scanner kb = new Scanner(System.in);
		String again="y";
		
		while(again.equalsIgnoreCase("y")) {
			int number = (int)(Math.random()*7)+5;
			System.out.println("Number is " + number);
			
			if(number%2==0)
				System.out.println("Even");
			else
				System.out.println("Odd");
			
			//Update Sentinal
			System.out.print("Play again? --> (y/n): ");
			again = kb.next();
		}//end of while
		
	}//end of main

}//end of class
