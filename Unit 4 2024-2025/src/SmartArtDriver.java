import java.util.Scanner;

public class SmartArtDriver {
	//Coded by Kaipo Ojas
	//November 26 2024
	//CS121//APCSA
	public static void main(String[] args) {
		
		//Scanner
		Scanner kb = new Scanner(System.in);
		
		//Greet user
		System.out.println("Hello, please enter the number correlating with your favorite shape");
		System.out.println("");
		
		//Ask for Choice
		System.out.println("Draw some shapes");
		System.out.println("=================");
		System.out.println("1. Triangle");
		System.out.println("2. Circle");
		System.out.println("3. Star");
		System.out.println("4. Pentagon");
		System.out.println("=================");
		int objectChoice = kb.nextInt();
		
		Turtle t1 = new Turtle();
		t1.bgcolor("cyan");
		t1.width(5);
		
		if (objectChoice == 1) {
			System.out.println("You choose a triangle. Now Printing.");
			for (int i = 0; i < 5; i++) {
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
				}
			}
			
			showTriangle(t1);
		} else if(objectChoice == 2) {
			System.out.println("You choose a circle. Now Printing.");
			for (int i = 0; i < 5; i++) {
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
				}
			}
			showCircle(t1);
		} else if (objectChoice == 3) {
			System.out.println("You choose a star. Now Printing.");
			for (int i = 0; i < 5; i++) {
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
				}
			}
			showStar(t1);
		} else if (objectChoice == 4) {
			System.out.println("You choose a pentagon. Now Printing.");
			for (int i = 0; i < 5; i++) {
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
				}
			}
			showPentagon(t1);
		} else {
			System.out.println("Invalid Input");
		}
		
	}
	
	public static void showTriangle(Turtle turtle) {
		turtle.penColor("green");
		for (int i = 0; i <= 3; i++) {
			turtle.forward(80);
			turtle.right(120);
		}
	}
	
	public static void showCircle(Turtle turtle) {
		turtle.penColor("red");
		for(int i = 0; i <= 360; i++) {
			turtle.right(1);
			turtle.forward(1);
		}
	}
	
	public static void showStar(Turtle turtle) {
		turtle.penColor("yellow");
		for (int i = 0; i <= 5; i++) {
			turtle.forward(80);
			turtle.right(144);
		}
	}
	
	public static void showPentagon(Turtle turtle) {
		turtle.penColor("blue");
		for (int i = 0; i <= 5; i++) {
			turtle.forward(80);
			turtle.left(72);
		}
	}

}
