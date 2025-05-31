import java.util.ArrayList;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// Coded by Kaipo Ojas
		//3/3/2025
		//CS121/APCSA
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(3);
		numbers.add(5);
		numbers.add(5);
		numbers.add(6);
		System.out.println("Original Array: " + numbers);
		
		for(int i = 0; i < numbers.size(); i++) {
			for(int j = 0; j < numbers.size(); j++) {
				if(numbers.get(i).equals(numbers.get(j)) && i != j) {
					numbers.remove(j);
				}
			}
		}
		System.out.println("Duplicates Removed Array: " + numbers);

	}

}
