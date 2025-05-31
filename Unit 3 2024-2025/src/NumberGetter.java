import java.util.Scanner;

public class NumberGetter {

	public static void main(String[] args) {
		System.out.println("Sum: " + sumOfThree());
		System.out.println("Product is: " + productOfThree());
		System.out.println("Average is: " + averageOfThree());

	}//end of main
	//==========================================
	public static int sumOfThree() {
		Scanner kb = new Scanner(System.in);
		
		System.out.print("Enter 3 ints: ");
		int num1 = kb.nextInt();
		int num2 = kb.nextInt();
		int num3 = kb.nextInt();
		int sum = num1 + num2 + num3;
		return sum;
	}
	//==========================================
	public static int productOfThree() {
		int value1 = (int)(Math.random() * 10)+1;
		int value2 = (int)(Math.random() * 10)+1;
		int value3 = (int)(Math.random() * 10)+1;
		return (value1 * value2 * value3);
	}
	//==========================================
	//Create a non-method that return the average of three random ints between 1-100
	public static double averageOfThree() {
		int rand1 = (int)(Math.random() * 100) + 1;
		int rand2 = (int)(Math.random() * 100) + 1;
		int rand3 = (int)(Math.random() * 100) + 1;
		double average = (rand1 + rand2 + rand3)/3.0;
		return average;
	}
}//end of class
