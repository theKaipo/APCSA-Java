
public class TurtleIntro {
	public static void main(String[] args) {
		//Coded by Kaipo Ojas
		//November 26, 2024
		
		Turtle t1= new Turtle();
		t1.width(5);
		
		//Menu for choosing shapes
		
		//Selection Structure for calling on the method
		
		//Triangle
		printTriangle(t1);
	}
	
	public static void printTriangle(Turtle t1) {
		t1.penColor("blue");
		for(int i = 0; i < 3; i++) {
			t1.forward(80);
			t1.right(120);
		}
	}
}
