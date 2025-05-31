
public class Circumference {

	public static void main(String[] args) {
		// Coded by: Kaipo Ojas
		//September 30, 2024
		//Computer circumference and area of a circle
		//Declare and initialize vars
		final double PI = 3.14159;
		int radius = 10;
		
		//Do the Math
		double circumference = 2 * PI * radius;
		double area = PI * (radius * radius);
		
		//Output results
		System.out.println("The circumference is: " + circumference);
		System.out.println("The area is: " + area);
	}

}
