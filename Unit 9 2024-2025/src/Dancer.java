
public class Dancer extends Performer{
	private double shoeSize;
	
	public Dancer (String n, int a, double s) {
		super(n, a);
		shoeSize = s;
	}
	
	public void selectMusic() {
		String music = "Dress Up";
		System.out.println("My music selection is: " + music);
	}
	
	public void perform() {
		super.perform();
		System.out.println("Dancing is my thing");
		
	}
}
