
public class Factorial {

	public static void main(String[] args) {
		// Coded by Kaipo Ojas
		//4/28/2025
		//CS121/APCSA
		//Recursion
		int n = 4;
		int s = 5;
		
		System.out.println("Factorial on " + n + " is " + factorial(n));
		
		System.out.println("Summation on " + s + " is " + summation(s));
	}
	
	public static int factorial (int num) {
		if(num == 1)
			return 1;
		else
			return num*factorial(num-1);
	}
	
	public static int summation (int num) {
		if (num == 1) {
			return 1;
		}
		else {
			return num+(summation(num-1));
		}
	}
}
