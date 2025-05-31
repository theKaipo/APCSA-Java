import java.util.Scanner;

public class FindStudent {
	public static void main(String[] args) {
		//Coded by Kaipo Ojas
		//March 24, 2025
		//CS121/APCSA
		
		String[][] seatingChart = {{"Apple", "Strawberry", "Mango", "Pineapple", "Blueberry", "Rasberry"}, 
				{"Orange", "Grape", "Banana", "Lime", "Cookies", "Kaipo"}
		};
		
		Scanner kb = new Scanner(System.in);
		
		System.out.print("Find Student: ");
		String student = kb.next();
		
		System.out.println("Student was found: " + findingStudent(seatingChart, student));
		System.out.println("Longest name is: " + longestName(seatingChart));
		
		//Printing only even
		for(String[] row:removeEven(seatingChart)) {
			for(String col:row) {
				System.out.print(col + " ");
			}
			System.out.println();
		}
	}
	public static boolean findingStudent(String[][] seating, String target) {
		boolean found = false;
		for(String[] row:seating) {
			for(String col:row) {
				if(col.equalsIgnoreCase(target)) 
					found = true;
			}
		}
		return found;
	}
	
	public static String longestName(String[][] seating) {
		String name = seating[0][0];
		
		for(int row =0; row < seating.length; row++) {
			for(int col = 0; col < seating[0].length; col++) {
				if(seating[row][col].length() > name.length()) {
					name = seating[row][col];
				}
			}//end of col
		}//end of row
		
		return name;
	}
	
	public static String[][] removeEven(String[][] seating) {
		String[][] newSeat = new String[seating.length][seating[0].length];
		for(int row =0; row < seating.length; row++) {
			for(int col = 0; col < seating[0].length; col++) {
				if(seating[row][col].length() % 2 == 0) {
					newSeat[row][col] = seating[row][col];
				}
			}//end of col
		}//end of row
		return newSeat;
	}
	public static void printArray(String[][] seating) {
		
	}
}
