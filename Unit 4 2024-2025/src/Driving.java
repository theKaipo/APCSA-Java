
public class Driving {
	public static void main(String[] args) {
		int myAge = (int)(Math.random()*5) +14;
		System.out.println("Current age: " + myAge);
		if (myAge >= 18) {
			System.out.println("You can learn to drive a car and can vote.");
		}
		else if(myAge >= 16) {
			System.out.println("You can learn to drive a car.");
		}
		else {
			System.out.println("Your not old enough for a license yet.");
		}
		System.out.println("Have a nice day.");
	}
}
