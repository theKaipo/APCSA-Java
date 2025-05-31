import java.util.*;

public class StudentNames {

	public static void main(String[] args) {
		// Coded by Kaipo Ojas
		//Jan 31, 2024
		//CS121/APCSA
		//Array practice with Strings
		
		Scanner kb = new Scanner(System.in);
		
		System.out.print("Enter the size of the list: ");
		int size = kb.nextInt();
		
		String[] names = new String[size];
		for(int i = 0; i < names.length; i++) {
			System.out.print("Enter name " + (i + 1)+ ": ");
			names[i] = kb.next(); 
		}
		//Print the original
		for(int i = 0; i < names.length; i++) {
			System.out.print(names[i] + "\t");
		}
		System.out.println();
		
		//Store initials
		char[] firstInitial = new char[size];
		
		for(int i = 0; i < firstInitial.length; i++) {
			firstInitial[i] = names[i].charAt(0);
		}
		for(int i = 0; i < firstInitial.length; i++) {
			System.out.print(firstInitial[i] + "\t");
		}
	}

}
