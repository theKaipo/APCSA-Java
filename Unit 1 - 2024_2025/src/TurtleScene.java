
public class TurtleScene {
	
	public static void main(String[] args) {
		//Turtle draws ground
		Turtle ground = new Turtle();
		ground.penColor("brown");
		ground.up();
		ground.forward(200);
		ground.left(180);
		ground.width(10);
		ground.down();
		ground.forward(400);
		ground.hide();
		
		//Turtle sun
		Turtle sunshine = new Turtle();
		sunshine.up();
		sunshine.forward(100);
		sunshine.left(90);
		sunshine.forward(200);
		sunshine.penColor("yellow");
		sunshine.width(50);
		sunshine.dot();
		sunshine.down();
		sunshine.width(10);
		//0
		sunshine.forward(120);
		sunshine.backward(120);
		sunshine.right(45);
		//45
		sunshine.forward(120);
		sunshine.backward(120);
		sunshine.right(45);
		//90
		sunshine.forward(120);
		sunshine.backward(120);
		sunshine.right(45);
		//135
		sunshine.forward(120);
		sunshine.backward(120);
		sunshine.right(45);
		//180
		sunshine.forward(120);
		sunshine.backward(120);
		sunshine.right(45);
		//225
		sunshine.forward(120);
		sunshine.backward(120);
		sunshine.right(45);
		//270
		sunshine.forward(120);
		sunshine.backward(120);
		sunshine.right(45);
		//315
		sunshine.forward(120);
		sunshine.backward(120);
		sunshine.right(45);
		//360
		sunshine.forward(120);
		sunshine.backward(120);
		sunshine.right(45);
		
		sunshine.hide();
		
		//Flower Turtle
		Turtle flower = new Turtle();
		flower.up();
		flower.left(180);
		flower.forward(120);
		flower.right(90);
		flower.penColor("green");
		flower.width(10);
		flower.down();
		flower.forward(120);
		//left stem
		flower.backward(80);
		flower.left(30);
		flower.forward(75);
		flower.backward(75);
		flower.right(30);
		//right stem
		flower.forward(40);
		flower.right(45);
		flower.forward(50);
		flower.backward(50);
		flower.left(45);
		//main flower
		flower.up();
		flower.forward(50);
		flower.width(20);
		flower.shape("circle");
		flower.fillColor("red");
		flower.stamp();
		flower.bgcolor("cyan");
	}
}
