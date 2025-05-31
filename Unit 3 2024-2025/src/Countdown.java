import java.util.Scanner;

public class Countdown {

	public static void main(String[] args) {
		//Coded by Kaipo Ojas
		//October 25, 2024
		//CS121
		
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter starting value: ");
		int startVal = kb.nextInt();
		
		for(int i = startVal; i >= 1; i--) {
			System.out.print(i + ", ");
		}
		System.out.print("blastoff!");
	}

}
