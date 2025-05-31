import java.util.ArrayList;

public class SwappingItems {

	public static void main(String[] args) {
		// Coded by Kaipo Ojas
		//3/7/2025
		//APCSACS121
		
		ArrayList<String> names = new ArrayList<String>();
		names.add("Mary");
		names.add("Robyn");
		
		System.out.println("original: " + names);
		
		//3 step swapping techniques
		String temp = names.get(0);
		names.set(0,  names.get(1));
		names.set(1,  temp);
		System.out.println("Vers. 2: " + names);

	}

}
