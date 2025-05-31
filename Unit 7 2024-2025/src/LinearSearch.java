import java.util.ArrayList;

public class LinearSearch {

	public static int counter=0;
	
	public static void main(String[] args) {
		// Coded by Kaipo Ojas
			//3/5/2025
			//CS121/APCSA
			ArrayList<String> names = new ArrayList<String>();
			names.add("Apple");
			names.add("Afro");
			names.add("Sushi");
			names.add("Joker");
			names.add("Allow");
			names.add("Mice");
			names.add("Oranges");
			names.add("Pineapple");
			names.add("Strawberry");
			names.add("Banana");
			names.add("Kaipo");
			names.add("Cookies");		
			System.out.println("The Original Array List: " + names);
			
			int rand = (int)(Math.random()* names.size());
			String target = names.get(rand);
			System.out.println("Random name: " + target);
			System.out.println("Position of target is: " + linearSearch(names, target));
			System.out.println("The number of checks is: " + counter);
	}
	public static int linearSearch(ArrayList<String> names, String target) {
		for(int i = 0; i < names.size(); i++) {
			counter++;
			if(names.get(i).equals(target)) {
				return i;
			}
		}
		return -1;
	}

}
