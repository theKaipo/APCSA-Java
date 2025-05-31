import java.util.Scanner;
public class Shape {
	public static void main(String[] args) {
		// Coded by Kaipo Ojas
		//December 18, 2024
		//CS121/APCSA
		
		Scanner kb = new Scanner(System.in);
		Turtle t1 = new Turtle();


		System.out.println("Choose a shape to print. \n1: Triangle \n2: Star \n3: Square \n4: Circle");
		int selectNum = kb.nextInt();
		
		if (selectNum == 1) {
			showTriangle(t1);
		} else if (selectNum == 2) {
			showStar(t1);
		} else if (selectNum == 3) {
			showSquare(t1);
		} else if (selectNum == 4) {
			showCircle(t1);
		} else {
			System.out.println("Invalid Entry.");
		}


	}//end of main
	
	//Task 1
	public static void showTriangle(Turtle turtle) {
		turtle.penColor("green");
		turtle.bgcolor("red");
		for (int j = 0; j <= 3; j++) {
			turtle.forward(80);
			turtle.right(120);
		}
	}//end of triangle
	
	//Task 2
	public static void showStar(Turtle turtle) {
		turtle.penColor("yellow");
		turtle.bgcolor("purple");
		for(int i = 0; i <=10; i++) {
			for(int j = 0; j <= 5; j++) {
				turtle.forward(80);
				turtle.right(144);
			}
			turtle.up();
			turtle.left(45);
			turtle.forward(150);
			turtle.down();
		}
	}//end of star
	//Task 3
	public static void showSquare(Turtle turtle) {
		int turns = 0;
		turtle.penColor("blue");
		turtle.bgcolor("green");
		for(int i = 0; i <= 7; i++) {
			for(int j = 0; j <= 3; j++) {
				turtle.forward(50);
				turtle.right(90);
				turns++;
			}
			turtle.up();
			turtle.left(45);
			turtle.forward(100);
			turtle.down();
		}
		System.out.println(turtle + " has turned " + turns + " times!");
	}//end of square
	//Task 4
	public static void showCircle(Turtle turtle) {
		turtle.penColor("yellow");
		turtle.bgcolor("cyan");
		turtle.speed(1);
		for(int i = 0; i <= 7; i++) {
				for(int j = 0; j <= 360; j++) {
					turtle.right(1);
					turtle.forward(1);
				}
				turtle.up();
				turtle.left(45);
				turtle.forward(30);
				turtle.down();
	}
	}//end of circle
}//end of class
