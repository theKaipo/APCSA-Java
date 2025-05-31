
public class QuadraticFormula {

	public static void main(String[] args) {
		//Coded by Kaipo Ojas
		//October 23, 2024
		
		System.out.println("Root one of x: " + rootOne());
		System.out.println("Root two of x: " + rootTwo());
		
	}//end of main
	// When a = 1, b =-3 and c= -4 then -1 and 4 will be the roots
	public static double rootOne() {
		int a = (int)(Math.random() * 9) + 2;
		int b = (int)(Math.random() * 14)+ 12;
		int c = (int)(Math.random() * 22)- 25;
		double x = (-b + Math.sqrt(Math.pow(b, 2) - 4*a*c))/(2*a);
		return x;
	}
	public static double rootTwo() {
		int a = (int)(Math.random() * 9) + 2;
		int b = (int)(Math.random() * 14)+ 12;
		int c = (int)(Math.random() * 22)- 25;
		double y = (-b - Math.sqrt(Math.pow(b, 2) - 4*a*c))/(2*a);
		return y;
	}

}//end of class
