import java.util.Scanner;

public class BigNumber {

	public static void main(String[] args) {
		//Coded by Kaipo Ojas
		//October 9, 2024
		//To demonstrate largest capacity of an int
		Scanner infile = new Scanner(System.in);
		int bigNumber = Integer.MAX_VALUE;
		int smallNumber = Integer.MIN_VALUE;
		
		System.out.println("Big number: " + bigNumber);
		System.out.println("Small number: " + smallNumber);
		
		//Input a int, double, double without prompt
		/*
		int d = infile.nextInt();
		double w = infile.nextDouble();
		double f = infile.nextDouble();
		
		System.out.printf("%10d %-5.3f %-5.2f\n", d , w, f);
		*/
		double price = 1.2145;
		System.out.printf("$%5.2f", price);
		
	}

}
