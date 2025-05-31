
public class Student {
	//Instance Data ... Attributes
	private String name;
	private int age;
	
	//===============
	
	public Student(String myName, int myAge) {
		//this.name=name;
		//this.age=age;
		//or...
		name = myName;
		age = myAge;
	}
	
	public String toString() {
		String result = "";
		result += "My name is " + name + "\n";
		result += "My age is " + age + "\n";
		return result;
	}
}
