
public class DrawBoxes {

	public static void main(String[] args) {
		//Coded by Kaipo Ojas
		//October 18, 2024
		//CS 121/APCSA
		//Method Practice
		drawTriangle();
		drawBoxes();
		drawUSBox();
		drawBoxes();
		drawTriangle();
		
	}//end of main
	public static void drawTriangle() {
		System.out.println("   /\\   ");
		System.out.println("  /  \\  ");
		System.out.println(" /    \\ ");
		System.out.println("/      \\");
	}
	
	public static void drawBoxes() {
		System.out.println("+------+");
		System.out.println("|      |");
		System.out.println("|      |");
		System.out.println("+------+");
	}
	public static void drawUSBox() {
		System.out.println("+------+");
		System.out.println("|United|");
		System.out.println("|States|");
		System.out.println("+------+");
	}
}//end of class
