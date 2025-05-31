
public class NestedForLoops {

	public static void main(String[] args) {
		//Coded by Kaipo Ojas
		//December 13, 2024
		//CS121/APCSA
		//LT: Nested For Loops
		
		for (int i=1; i<6; i++) {
			for (int j = 1; j<=i; j++) {
				System.out.print("*");
			}//end j loop
			System.out.println();
		}//end of i loop
		
		for (int i=1; i<3; i++) {
			for (int j = 1; j<=2; j++) {
				System.out.print("*");
			}//end j loop
			System.out.println();
		}//end of i loop
		System.out.println("End of program.");
	}//end of main
}//end of class
