import java.util.ArrayList;

public class SwappingPairs {

	public static void main(String[] args) {
		// Coded by Kaipo Ojas
		//3/7/2025
		//CS121/APCSA
		
		ArrayList<String> words = new ArrayList<String>();
		words.add("four");
		words.add("score");
		words.add("and");
		words.add("seven");
		words.add("years");
		words.add("ago");
		words.add("test");
		System.out.println("Original: \n" + words);
		
		swapPairs(words);
	}//end of main
	
	public static void swapPairs(ArrayList<String> words) {
		if(words.size() % 2 == 0 ) {
			for(int i = 0; i < words.size(); i+=2) {
				String temp = words.get(i);
				words.set(i,  words.get(i + 1));
				words.set(i + 1,  temp);
			}//end of for
		} else {
			for(int i = words.size() - 2; i >= 0; i-=2) {
				String temp = words.get(i);
				words.set(i,  words.get(i - 1));
				words.set(i - 1,  temp);
			}//end of for
		}
		System.out.println("Swapped Array: \n"+words);
	}//end of method

}//end of class
