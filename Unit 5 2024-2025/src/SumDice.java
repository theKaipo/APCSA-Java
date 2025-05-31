import java.util.Scanner;

public class SumDice {
	public static void main(String[] args) {
		//Coded by Kaipo Ojas
		//January 6, 2025
		//CS1221/APCSA
		
		Scanner kb = new Scanner(System.in);
		
		//Asking intial sum
		System.out.println("Enter a sum between 2 and 12 for the sum of 2 dices: ");
		int target = kb.nextInt();
		
		while (target >= 12 || target <= 2) {
			System.out.println("Number is not between 2 and 12. Enter a valid number: ");
			target = kb.nextInt();
		}
		
		//Dice
		int dice1 = (int)(Math.random() * 6) + 1;
		int dice2 = (int)(Math.random() * 6) + 1;
		int counter = 1;
		int sum = dice1 + dice2;
		
		while(sum != target) {
			System.out.println("Dice 1 is: " + dice1 + ". Dice 2 is: " + dice2 + ". Sum is: " + sum);
			dice1 = (int)(Math.random() * 6) + 1;
			dice2 = (int)(Math.random() * 6) + 1;
			sum = dice1 + dice2;
			counter++;
		}
		System.out.println("Dice 1 is: " + dice1 + ". Dice 2 is: " + dice2 + ".\nDesired sum of " + sum + " has been achieved!");		
	}
}
