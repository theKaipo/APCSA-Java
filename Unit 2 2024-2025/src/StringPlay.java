
public class StringPlay {
	public static void main(String[] args) {
		//Coded by Kaipo Ojas
		//October 9, 2024
		//Demonstrate String methods
		String animals = "I love the zoo!";
		
		//Find the length of the String, starts count at 1
		int length = animals.length();
		System.out.println("The length of my string is " + length);
		//Print the first letter of the string, start count at 0
		System.out.println(animals.charAt(2));
		System.out.println(animals.charAt(length-1));
		
		//Find the index position of a letter
		System.out.println(animals.indexOf("t"));
		
		//substring with one paramter
		System.out.println(animals.substring(2, 6));
		System.out.println(animals.substring(8, 10));
		
		//Print out 5 new words using substring
		String word = "Computer Science Rocks!";
		System.out.println(word.substring(0, 4));
		System.out.println(word.substring(9, 16));
		System.out.println(word.substring(9, 10) + word.substring(18, 21));
		System.out.println(word.substring(3, 5) + word.substring(19, 22));
		System.out.println(word.substring(2, 3) + word.substring(1,2) + word.substring(18));
	}
}
