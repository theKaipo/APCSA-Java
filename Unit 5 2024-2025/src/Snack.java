import java.util.Scanner;

public class Snack {
	//Attributes or private instance data
	private String name;
	private int calories;
	Scanner kb = new Scanner(System.in);
	
	//Default Consturctor
	public Snack() {
		name = "";
		calories = 0; 
	}
	
	//Overloaded Constructor
	public Snack(String name, int calories) {
		this.name = name;
		this.calories = calories;
	}
	
	//Accessor
	public String getName() {
		return name;
	}
	public int getCalories() {
		return calories;
	}
	//Setters
	public void setName(String name) {
		this.name = name;
	}
	public void setCalories(int calories) {
		this.calories = calories;
	}
	
	//Determine total price of snack with quantity
	//PreCondition: Quantity is greater than 0
	public void totalPrice(int quantity) {
		System.out.print("Enter item price: ");
		double price = kb.nextDouble();
		double total = price * quantity;
		System.out.println("Total price is $" + total+ "\n");
	}
	
	//toString
	public String toString() {
		String results = "";
		results += "My snack's name is " + name + "\n";
		results += "My snack's calories is " + calories + "\n";
		return results;
	}
	//==========
	public boolean isCool() {
		if(name.length() > 8) {
			return true;
		} else {
			return false;
		}
	}
	
	//void method
	public void snackStatement() {
		System.out.println("This " + name + " is very yummy!");
	}
	
	//Main
	public static void main(String[] args) {
		//Kaipo Ojas
		//Jan 21 2025
		//CS121/APCSA
		Snack s1 = new Snack();
		Snack s2 = new Snack("cookie", 250);
		
		System.out.println(s1);
		System.out.println(s2);
		s2.snackStatement();
		
		//Using methods on s2
		s2.setName("Marshmellow");
		System.out.println(s2.getName());
		System.out.println(s2.getName() + " is cool " + s2.isCool());
		s2.totalPrice(3);
	}
	
}


