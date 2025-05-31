import java.util.ArrayList;

public class ArrayListTraversal {

	public static void main(String[] args) {
		// Coded by Kaipo Ojas
		//2/27/2025
		//CS121/APCSA
		//Tranversing an array list
		
		ArrayList<String> names = new ArrayList<String>();
		names.add("name1");
		names.add("name12");
		names.add("name123");
		names.add("name1234");
		names.add("name12345");
		names.add("name123456");
		names.add("name1234567");
		names.add("name12345678");
		names.add("name123456789");
		names.add("Cookies");
		names.add("Kaipo");
		names.add("Blueberry");
		
		System.out.println(names);
		
		int sum = 0;
		for(int i = 0; i<names.size(); i++) {
			sum += names.get(i).length();
		}
		System.out.println("Total class char: " + sum);
		double average = (double)sum/names.size();
		System.out.println("Average char in class: " + average);
	}

}
