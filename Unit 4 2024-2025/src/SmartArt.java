

public class SmartArt {
	public void showTriangle(Turtle turtle) {
		turtle.penColor("green");
		for (int i = 0; i <= 3; i++) {
			turtle.forward(80);
			turtle.right(120);
		}
	}
	
	public void showCircle(Turtle turtle) {
		turtle.penColor("red");
		for(int i = 0; i <= 360; i++) {
			turtle.right(1);
			turtle.forward(1);
		}
	}
	
	public void showStar(Turtle turtle) {
		turtle.penColor("yellow");
		for (int i = 0; i <= 5; i++) {
			turtle.forward(80);
			turtle.right(144);
		}
	}
	
	public void showPentagon(Turtle turtle) {
		turtle.penColor("blue");
		for (int i = 0; i <= 5; i++) {
			turtle.forward(80);
			turtle.right(144);
		}
	}
}
