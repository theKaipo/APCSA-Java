
public class SnowmanDriver {
	
	public static void main(String[] args) {
		//Coded by Kaipo Ojas
		//November 18, 2024
		//Create an instance of snowman
		Snowman s1 = new Snowman();
		Snowman s2 = new Snowman("Elsa", 3, false);
		
		System.out.println(s1);
		System.out.println(s2);
		
		//get a name
		System.out.println("My name is: " + s2.getName());
		
		//set a new button number
		s2.setButtons(2);
		System.out.println(s2.getButtons());
		
		//call on the void message
		s2.printMessage();
		
	}

}
