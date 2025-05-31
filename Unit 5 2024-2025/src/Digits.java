
public class Digits {

	public static void main(String[] args) {
		// Coded by Kaipo Ojas
		//December 4, 2024
		//CS121/APCSA
		//While loops
		printNums(5, 4);
	}
	//===============
	public static void printNums(int value, int numRounds) {
		for(int i = 1; i <= numRounds; i++) {
			int newNum = 0;
			while(newNum != value) {
				newNum = (int)(Math.random() * 10);
				System.out.print(newNum);
			}
			System.out.println();
		}
	}//end of main
}//end of class
