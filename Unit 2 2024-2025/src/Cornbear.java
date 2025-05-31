import java.util.Scanner;

public class Cornbear {

	public static void main(String[] args) {
		// Coded by Kaipo Ojas
		//October 8, 2024
		//Cornbear Coffee Shop Receipt
		
		//Declaring Values
		Scanner kb = new Scanner(System.in);
		final double tax = 1.21;
		double lucyTreatPrice = 2.08;
		double oatmilkLattePrice = 5.49;
		double hungerGamesPrice = 10.99;

		//Questions for Quantity
		System.out.print("Good Morning! How many Lucy's Treat would you like? ");
		int numberLucyTreat = kb.nextInt();
		
		System.out.print("How many Oatmilk Latte would you like? ");
		int numberOatmilkLatte = kb.nextInt();
		
		System.out.print("How many of The Hunger Games would you like? ");
		int numberHungerGames = kb.nextInt();
		
		//Do the Math
		double subtotal = (numberLucyTreat * lucyTreatPrice) + 
				(numberOatmilkLatte * oatmilkLattePrice) + 
				(numberHungerGames * hungerGamesPrice);
		double numberItemsPurchased = numberLucyTreat  + numberOatmilkLatte + numberHungerGames;
		double tip = (subtotal % numberItemsPurchased);
		double grandTotal = subtotal + tip + tax;
		
		//Output Results
		System.out.println("-	Cornbear's		-");
		System.out.println("-	Coffee && Chapters	-");
		System.out.println("	University of	");
		System.out.println("	Washington	");
		System.out.println("	\"Seattle\"	");
		System.out.println("-------------------------");
		System.out.println("	5\\10\\2050	");
		System.out.println("-------------------------");
		System.out.println(numberLucyTreat + " Lucy's Treats $" + (numberLucyTreat * lucyTreatPrice));
		System.out.println(numberOatmilkLatte + " Oatmilk Latte $" + (numberOatmilkLatte * oatmilkLattePrice));
		System.out.println(numberHungerGames + " The Hunger Games $" + (numberHungerGames * hungerGamesPrice));
		System.out.println("Subtotal\t" + "$" + subtotal);
		System.out.println("Bear tax\t" + "$" + tax);
		System.out.println("Tip\t" + "$" + tip);
		System.out.println("Total\t" + "$" + grandTotal);
		System.out.println();
		System.out.println("Thank you <3");
	}

}
