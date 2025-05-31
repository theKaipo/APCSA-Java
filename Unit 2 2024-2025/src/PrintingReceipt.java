import java.util.Scanner;

public class PrintingReceipt {

	public static void main(String[] args) {
		//Coded by Kaipo Ojas
		//October 3, 2024
		//Print a Starbucks receipt
		
		Scanner kb = new Scanner(System.in);
		final double tax = 1.10;
		double lattePrice = 6.00;
		double croissantPrice = 2.00;
		
		System.out.print("Good Morning! What is your name? ");
		String name = kb.next();
		
		System.out.print("How many Lattes today " + name + "?");
		int numberOfLattes = kb.nextInt();
		
		System.out.print("How many Croissants today " + name + "?");
		int numberOfCroissants = kb.nextInt();
		
		//Do the Math
		double price = (numberOfLattes * lattePrice) + (numberOfCroissants * croissantPrice) * tax;
		
		//Output Result
		System.out.println("-       Latte's by Kaipo    ");
		System.out.println("-       Coffees of the Day  ");
		System.out.println("-       Auburn, WA          ");
		System.out.println("You chose " + numberOfLattes + " lattes. Each at a cost of " + lattePrice);
		System.out.println("And " + numberOfCroissants + "Croissants. Each at a cost of " + croissantPrice);
		System.out.println("Your total is: $" + price);
		System.out.println("\n\tThank You " + name + " Come Again :)  ");
	}

}
