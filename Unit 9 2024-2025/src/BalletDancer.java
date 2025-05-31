
public class BalletDancer extends Dancer {
	private String balletShoes;
	
	public BalletDancer(String n, int a, double s) {
		super(n, a, s);
		balletShoes = "Pink";
	}
	
	public void jete() {
		System.out.println("Leaping...");
	}
	
	public void pirouette() {
		System.out.println("Spinning...");
	}
	
	public void perform() {
		super.perform();
		jete();
		pirouette();
	}
}
