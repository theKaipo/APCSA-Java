import java.util.ArrayList;

public class AlphaOrder {

	public static void main(String[] args) {
		// Coded by Kaipo Ojas
		//March 10th
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
		System.out.println(names);
		
		System.out.println("Riverside".compareTo("Ravens"));
		removeOddLength(names);
	}
	
	public static void removeOddLength(ArrayList<String> list) {
		for(int i = list.size() - 1; i >= 0; i--) {
			if(list.get(i).length() % 2 == 1) {
				list.remove(i);
			}
		}
		System.out.println(list);
	}

}
