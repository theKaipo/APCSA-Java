import java.util.ArrayList;

public class ArrayListPractice {
	public static void main(String[] args) {
		//CD: Kaipo Ojas
		//2/26/2025
		//CS121/APCSA
		//Array Lists
		
		ArrayList<String> h = new ArrayList<String>();
		System.out.println(h);
		System.out.println("Size " + h.size());
		h.add("Hello");
		System.out.println(h);
		System.out.println("Size " + h.size());
		h.add("how");
		System.out.println(h);
		System.out.println("Size " + h.size());
		h.add("are");
		System.out.println(h);
		System.out.println("Size " + h.size());
		h.remove(0);
		System.out.println(h);
		System.out.println("Size " + h.size());
		h.set(1, "you");
		System.out.println(h);
		System.out.println("Size " + h.size());
		System.out.println(h.get(0));
	}
}
