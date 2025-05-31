
public class TurtleSquare {

	public static void main(String[] args) {
		//Coded by Kaipo
		//September 23rd, 2024
		//Use a Turtle to Create a Blue Square that is 40 by 40
		Turtle Raven = new Turtle();
		Raven.speed(800);
		Raven.penColor("blue");
		Raven.forward(40);
		Raven.left(90);
		Raven.forward(40);
		Raven.left(90);
		Raven.forward(40);
		Raven.left(90);
		Raven.forward(40);
		
		Raven.up();
		Raven.forward(40);
		Raven.shape("rectangle");
		Raven.stamp();
		Raven.forward(40);
		Raven.shape("circle");
	}

}
