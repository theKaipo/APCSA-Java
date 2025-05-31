
public class AbstractArt {

	public static void main(String[] args) {
		// Coded by Kaipo Ojas
		//October 29, 2024
		//CS121
		
		Turtle t1 = new Turtle();
		t1.bgcolor("cyan");
		t1.width(5);
		t1.speed(5);
		
		//Circle
		t1.up();
		t1.forward(50);
		t1.right(45);
		t1.forward(30);
		t1.penColor("red");
		t1.down();
		for(int i = 0; i <= 360; i++) {
			t1.right(1);
			t1.forward(1);
		}
		
		//Triangle
		t1.up();
		t1.setPosition(50, 200);
		t1.right(25);
		t1.penColor("white");
		t1.down();
		for (int i = 0; i <= 3; i++) {
			t1.forward(80);
			t1.right(120);
		}
		
		//Pentagon
		t1.up();
		t1.setPosition(-50, 150);
		t1.left(40);
		t1.penColor("green");
		t1.down();
		for (int i = 0; i <= 5; i++) {
			t1.forward(80);
			t1.left(72);
		}
		
		//Star
		t1.up();
		t1.setPosition(-100, -80);
		t1.penColor("yellow");
		t1.down();
		for (int i = 0; i <= 5; i++) {
			t1.forward(80);
			t1.right(144);
		}
	}

}
