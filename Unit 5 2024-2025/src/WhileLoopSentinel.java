import java.util.Scanner;

public class WhileLoopSentinel {
	public static void main(String[] args) {
		//Coded by Kaipo Ojas
		//December 5, 2024
		//CS121/APCSA
		//While Loop
		
		Scanner kb = new Scanner(System.in);
		
		int num = -2;
		int sum = 0;
		//while loop goes here
		while(num!=-1) {
			System.out.println("Please enter a num or -1 to quit: ");
			num = kb.nextInt();
			if (num!=-1) 
				sum += num;
			
		}
		System.out.println("Sum is " + sum);
	}
}
