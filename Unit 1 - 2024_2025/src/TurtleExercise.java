
public class TurtleExercise {

	public static void main(String[] args) {
		Turtle sue = new Turtle();
		sue.up();
		sue.forward(200);
		sue.down();
		sue.penColor("red");
		sue.forward(60);
		sue.left(90);
		sue.forward(60);
		sue.left(90);
		sue.forward(120);
		sue.left(90);
		sue.forward(60);
		sue.left(90);
		sue.forward(60);
		sue.hide();
		
		Turtle sam = new Turtle();
		sam.left(90);
		sam.forward(12);
		sam.backward(2);
		sam.right(90);
		sam.left(5);
		sam.forward(1);
		sam.left(5);
		sam.forward(1);
		sam.left(5);
		sam.forward(1);
		sam.left(5);
		sam.forward(1);
		sam.right(5);
		sam.forward(1);
		sam.right(10);
		sam.forward(1);
		sam.right(10);
		sam.forward(1);
		sam.right(10);
		sam.forward(1);
		sam.hide();
	}

}
