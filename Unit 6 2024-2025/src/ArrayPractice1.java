
public class ArrayPractice1 {

	public static void main(String[] args) {
		// Coded by Kaipo Ojas
		//Practice with array
		
		double [] price = new double[5];
		//Manually assign prices for burgers
		price[0]= 13.99;
		price[1]=15.99;
		price[2]=5.99;
		price[3]=14.99;
		price[4]=18.99;
				
		//Print out the array values
		for(int i = 0; i < price.length; i++) {
			System.out.println("Price on burger " + (i + 1) + " $" + price[i]);
		}//for loop
		
		//Create a string array using an initislizer list
		String[] names = {"McDonalds", "Red Robin", "Dicks", "Wendys", "HopsNDrops"};
		
		for(int i = 0; i < names.length; i++) {
			System.out.println("Resturant name: " + names[i]);
		}//for loop
		//Methods on arrays
		System.out.println("The length of names " + names.length);
		System.out.println("The first element of names: " + names[0]);
		System.out.println("The last element of names: " + names[names.length - 1]);
		
		System.out.println("The middle element of names: " + names[names.length / 2]);
		
		//Enhanced for loop
		for(double values:price) {
			System.out.println(values);
		}
		
	}//end of main

}//end of class
