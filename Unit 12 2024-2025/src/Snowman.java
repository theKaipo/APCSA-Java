
public class Snowman {
	//Coded by Kaipo Ojas
	//November 18, 2024
	//Snowman Object
	//Attributes
	private String name;
	private int numButtons;
	private boolean hasCarrotNose;
	
	//Constructor
	public Snowman() {
		name = "";
		numButtons = 0;
		hasCarrotNose = false;
	}
	
	public Snowman(String snowName, int snowButtons, boolean snowNose) {
		name = snowName;
		numButtons = snowButtons;
		hasCarrotNose = snowNose;
	}
	
	//Getter methods
	public String getName() {
		return name;
	}
	
	public int getButtons() {
		return numButtons;
	}
	
	public boolean gteNose() {
		return hasCarrotNose;
	}
	
	//Setter Methods
	public void setName(String newName) {
		name = newName;
	}
	
	public void setButtons(int newNumButtons) {
		numButtons = newNumButtons;
	}
	
	public void setCarrotNose(boolean newCarrotNose) {
		hasCarrotNose = newCarrotNose;
	}
	//==============
	public void printMessage() {
		System.out.println(name + " is wearing a scraf!");
	}
	
	//ToString
	public String toString() {
		String result = "";
		result += "My name is " + name + "\n";
		result += "My number of buttons is " + numButtons + "\n";
		result += "I have a carrot nose: " + hasCarrotNose + "\n";
		return result;
	}
}
