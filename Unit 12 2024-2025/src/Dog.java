
public class Dog {
	//Coded by Kaipo Ojas
	//November 19, 2024
	//Dog Object
	
	//Attributes
	private String name;
	private String breed;
	private int age;
	
	//======Constructor========
	public Dog () {
		name = "";
		breed = "";
		age = 0;
	}
	//Overloaded Constructor
	public Dog(String dogName, String dogBreed, int dogAge) {
		name = dogName;
		breed = dogBreed;
		age = dogAge;
	}
	
	//===========Accessors(Getters)=======
	public String getName() {
		return name;
	}
	
	public String getBreed() {
		return breed;
	}
	
	public int getAge() {
		return age;
	}
	
	//========Mutators(Setter)==========
	public void setName(String newName) {
		name = newName;
	}
	
	public void setBreed(String newBreed) {
		breed = newBreed;
	}
	
	public void setAge(int newAge) {
		age = newAge;
	}
	
	//=======toString==========
	public String toString() {
		String result = "";
		result += "The name of the dog is: " + name + "\n";
		result += "The breed of the dog is: " + breed + "\n";
		result += "The age of the dog is: " + age + "\n";
		return result;
	}
	
	//=========void method==========
		public void barkMessage() {
			System.out.println(name + " loves to bark at cars.");
		}
	
	//=========non-void method==========
	public int humanYears() {
		return age * 7;
	}
	
	
}
