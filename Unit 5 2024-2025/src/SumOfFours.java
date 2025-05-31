
public class SumOfFours {

	public static void main(String[] args) {
		// Coded by Kaipo Ojas
		//December 4, 2024
		//CS121/APCSA
		//While loops
		int r = 0;
		int sum = 0;
		
		while(sum <= 100) {
			if (r%4 == 0)
				sum += r;
			r++;
		}
		System.out.println("Sum = " + sum);
	}//end of main
}//end of class
