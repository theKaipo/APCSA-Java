import java.util.ArrayList;

public class ArrayListError {

	public static void main(String[] args) {
		//Coded by Kaipo Ojas
		//2/28/2025
		//2/28/2025
		//CS121/APCSA
		ArrayList<Double> grades = new ArrayList<Double>();
		grades.add(81.3);
		grades.add(65.8);
		grades.add(100.0);
		grades.add(44.3);
		grades.add(97.5);
		grades.add(90.0);
		
		System.out.println("Original list of grades: ");
		for(Double score:grades) {
			System.out.print(score + " ");
		}
		
		//============
		System.out.println("\nUpdating list of grades: ");
		for(Double score:grades) {
			if(score < 70.0) {
				score=70.0;
			}
			System.out.print(score + " ");
		}
		//===============
		System.out.println("\n Verifying the Original list of grades: ");
		for(Double score:grades) {
			System.out.print(score + " ");
		}
		//=====Fool proof for loop=========
		for(int i=grades.size() - 1; i>=0; i--) {
			if(grades.get(i)<70) {
				grades.remove(i);
			}
		}
		System.out.println("\nNew list of grades: ");
		for(Double score:grades) {
			System.out.print(score + " ");
		}
	}

}
