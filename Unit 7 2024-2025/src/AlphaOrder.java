import java.util.ArrayList;

public class AlphaOrder {

	public static void main(String[] args) {
		// Coded by Kaipo Ojas
		//March 10th
		//CS121/APCSA
		ArrayList<String> names = new ArrayList<String>();
		names.add("Eldon");
		names.add("Aiden");
		names.add("Sami");
		names.add("Jaden");
		names.add("Annaliese");
		names.add("Mico");
		names.add("Anatolii");
		names.add("Jacob");
		names.add("Ruvim");
		names.add("Gabby");
		names.add("Kaipo");
		names.add("Cooper");		
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
