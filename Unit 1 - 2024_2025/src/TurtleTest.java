
public class TurtleTest {

	public static void main(String[] args) {
		Turtle cat = new Turtle();
		cat.penColor("red");
		cat.shape("circle");
		cat.shapeSize(10, 10);
		cat.fillColor("red");
		cat.stamp();
		cat.up();
		cat.forward(10);
		cat.penColor("green");
		cat.down();
		cat.right(90);
		cat.forward(20);
		cat.left(90);
		cat.forward(40);
		cat.left(90);
		cat.forward(40);
		cat.left(90);
		cat.forward(40);
		cat.left(90);
		cat.forward(20);
		cat.hide();
	}

}
