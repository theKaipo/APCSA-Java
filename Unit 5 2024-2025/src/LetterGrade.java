import java.util.Scanner;

public class LetterGrade {

	public static void main(String[] args) {
		//Coded by Kaipo Ojas
		//December 3, 2024
		//CS121/APCSA
		Scanner kb = new Scanner(System.in);
		String check="y";
		
		while(check.equalsIgnoreCase("y")) {
			System.out.println("Enter your grade percentage: ");
			int percent = kb.nextInt();
			
			if(percent >= 90)
				System.out.println("Your grade is: A");
			else if(percent >= 80)
				System.out.println("Your grade is: B");
			else if(percent >= 70)
				System.out.println("Your grade is: C");
			else if(percent >= 60)
				System.out.println("Your grade is: D");
			else
				System.out.println("Your grade is: F");
			
			System.out.print("Check again? --> (y/n): ");
			check = kb.next();
		}//end of while


	}

}
