
public class Marker extends WritingUtensil {
	private String tipType;
	public Marker(int pixels, String type) {
		super(pixels);
		tipType = type;
	}
	
	public String toString() {
		String result = "";
		result += super.toString();
		result += ". Tip type is: " + tipType;
		return result;
	}
}
