
public class HelloTurtle {

	public static void main(String[] args) {
		//Sept.16
		//Coded by Kaipo
		//Simple turtle movement
		
		//Demo
		
		Turtle myT = new Turtle();
		myT.penColor("red");
		myT.forward(100);
		myT.left(90);
		myT.forward(200);
		myT.left(90);
		myT.forward(100);
		myT.hide();
		

		//====================
		try {
            Thread.sleep(500);
        } catch (Exception e) {
        }
		//Create your own turtle
		Turtle myT2 = new Turtle();
		myT2.penColor("red");
		myT2.left(180);
		myT2.forward(100);
		myT2.right(90);
		myT2.forward(200);
		myT2.right(90);
		myT2.forward(100);
		myT2.hide();
		
		//====================
		try {
		     Thread.sleep(500);
		} catch (Exception e) {
		        }
		//Create Turtle Roof
		Turtle kermit = new Turtle();
		kermit.penColor("blue");
		kermit.up();
		kermit.left(90);
		kermit.forward(350);
		kermit.down();
		kermit.right(135);
		kermit.forward(212.13);
		kermit.right(135);
		kermit.forward(300);
		kermit.right(135);
		kermit.forward(212.13);
		kermit.write("test", null, 10, 12, 1.2, 1.2);
		//kermit.write("House", "ariel", 15, 12, 1.2, 1.2);
		//kermit.hide();
	}

}
