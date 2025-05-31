
public class WhileLoops {

	public static void main(String[] args) {
		// Coded by Kaipo Ojas
		//January 6, 2025
		//CS121APCSA
		//While Loops
		
		//Rand number between 1 and 10
		int num = (int)(Math.random() * 10) + 1;
		int counter = 1;
		
		while (num != 6) {
			System.out.print(num + " ");
			num = (int)(Math.random() * 10) + 1;
			counter++;
		}
		System.out.print("\n" + num + " generated a 6!");
		System.out.print("\nIt took " + counter + " tries!");
	}//end of main
}//end of class
