
public class NestedForLoopPractice3 {

	public static void main(String[] args) {
		// Coded by Kaipo Ojas
		//December 17, 2024
		//CS121/APCSA
		//NestedForLoop
		
		final int LIMIT = 10;
		
		for(int row = 1; row <= LIMIT; row++) {
			for(int space = 1; space <= (LIMIT-row); space++) {
				System.out.print(" ");
			}//end of space loop
			
			//Stars
			for(int star = 1; star <= row; star ++) {
				System.out.println("*");
			}
			System.out.println();
		}
	}

}
