
public class HolidayTree {

	public static void main(String[] args) {
		// Coded by Kaipo Ojas
		//December 17, 2024
		//CS121/APCSA
		//NestedForLoop
		
		final int LIMIT = 20;
		
		for(int row = 1; row <= LIMIT/2; row++) {
			//spaces
			for(int space = 1; space <= ((LIMIT/2)-row); space++) {
				System.out.print(" ");
			}//end of space loop
			
			//Stars
			for(int star = 1; star <= (row*2)-1; star ++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
