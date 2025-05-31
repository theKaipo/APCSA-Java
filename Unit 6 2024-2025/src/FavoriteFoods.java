import java.util.Scanner;

public class FavoriteFoods {

	public static void main(String[] args) {
		// Coded by Kaipo Ojas
		Scanner kb = new Scanner(System.in);
		
		System.out.print("Enter the size of array: ");
		int size = kb.nextInt();
		
		String[] foods = new String[size];
		
		for(int i = 0; i < foods.length; i++) {
			System.out.print("Enter favorite food " + (i-1) + ": ");
			foods[i] = kb.next();
		}
		
		int[] lengthArray = new int[size];
	}

}
