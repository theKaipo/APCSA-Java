
public class DogDriver {

	public static void main(String[] args) {
		//Coded by Kaipo Ojas
		//November 19, 2024
		//Create a Dog Object
		
		//Create 2 instances of dogs
		Dog dog1 = new Dog();
		Dog dog2 = new Dog("Scooby", "Husky",8);
		
		//Print attributes through a toString
		System.out.println(dog1);
		System.out.println(dog2);
		
		//Change name
		dog2.setName("Snoopy");
		
		//Call on a void methods
		dog1.barkMessage();
		dog2.barkMessage();
		
		//Call on a non-void message 
		System.out.println(dog2.getName() + " in human age is: " + dog2.humanYears());
		
	}

}
