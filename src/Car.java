
public class Car {
	//Attribute
	private String color;
	private int year;
	private String make;
	private String model;
	
	//=======================
	//Constructor
	public Car() {
		color = "";
		year = 0;
		make = "";
		model = "";
	}
	public Car(String color, int year, String ma, String mo) {
		this.color = color;
		this.year = year;
		make = ma;
		model = mo;
	} //=====================
	//Getter Methods
	public String getColor() {
		return color;
	}
	
	public int getYear () {
		return year;
	}
	
	public String getModel() {
		return model;
	}
	//====================
	//Setter method
	public void setColor(String newColor) {
		color = newColor;
	}
	
	public void setYear(int newYear) {
		year = newYear;
	}
	
	public void setModel(String newModel) {
		model = newModel;
	}
			
	public void carMessage() {
		System.out.println("Check Engine on your " + model);
	}
	//========================
	public String toString() {
		String result = "";
		result += "My color is " + color + "\n";
		result += "My year is " + year + "\n";
		result += "My make is " + make + "\n";
		result += "My model is " + model + "\n";
		return result;
	}
	//========================
	public static void main(String[] args) {
		//Create a car object 1
		Car c1 = new Car("Silver", 2007, "Toyota", "Corolla");
		c1.carMessage();
		
		System.out.println(c1);
		System.out.println(c1.getColor());
		c1.setColor("Red");
		System.out.println(c1);
		
		//Create a car object 2
		Car c2 = new Car();
		System.out.println(c2);
	}
}
