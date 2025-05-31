import java.util.Scanner;

public class MadLibs {

	public static void main(String[] args) {
		// Coded by Kaipo Ojas
		//October 11, 2024
		//CSE 121/APCSA
		//Unit 2 Project MadLib
		
		Scanner kb = new Scanner(System.in);
		
		//Get Variables
		System.out.println("What is your name: ");
		String name = kb.next();
		
		System.out.println("To start " + name + " please enter a forest name: ");
		String forestName = kb.next();
		
		System.out.println("Please enter an noun: ");
		String noun2 = kb.next();
		
		System.out.println("Also enter an animal: ");
		String animal1 = kb.next();
		
		System.out.println("Enter another animal: ");
		String animal2 = kb.next();
		
		System.out.println(name + " please give me another noun: ");
		String noun1 = kb.next();
		
		System.out.println(name + " enter a snack: ");
		String snack1 = kb.next();
		
		System.out.println("Please enter a name: ");
		String name2 = kb.next();
		
		System.out.println("Now " + name + " enter a plural noun: ");
		String plNoun1 = kb.next();
		
		System.out.println("Enter a verb: ");
		String verb1 = kb.next();
		
		System.out.println(name + " please enter a adjective:");
		String adjective1 = kb.next();
		
		//Print story
		System.out.println("This weekend I am going camping in the " + forestName + " forest. \nI packed tent, smores, and "
		+ noun1 + ". Also right before leaving I decided to pack some " + plNoun1 + ". \nI was so " + verb1 
		+ " while driving there. I almost ran into a " + adjective1 + " " + animal1 
		+ ". \nAfter getting to the site safely I setup my tent and decided to go fishing. \nI reeled up a " + noun2 
		+ ", which I decided to take home as a souvenir. \nWhile walking back to my tent I found a " + animal2 
		+ ". Which I tamed with a " + snack1 + ". \nI sang songs with my " + animal2 + " that I decided to name " + name2 
		+ ". \nAnd ended up taking it home the next day.");
	} //end of main

} //end of class
