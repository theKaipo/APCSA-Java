
public class CastingNumbers {

	public static void main(String[] args) {
		//Coded by Kaipo Ojas
		//October 7, 2024
		//This program will demonstrate type casting
		System.out.println(6/4);
		System.out.println(6.0/4);
		System.out.println(6/4.0);
		System.out.println( (double) 6/4);
		
		double number = 11.0/4;
		int roundedNumber = (int) (number + 0.5);
		System.out.println("11.0 /4 = " + number);
		System.out.println("11/4 = " + (int)number);
		System.out.println("11.0 / 4 rounded = " + roundedNumber);
	}

}
