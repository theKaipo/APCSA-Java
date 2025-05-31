import java.util.*;

public class Example {
	public static void main(String[] args) {
		//Coded by Kaipo Ojas
		//October 17, 2024
		//Practice random Number
		//UW
		Random rand = new Random();
		int randInt = rand.nextInt();
		//CB
		int randInt2=(int)(Math.random()*Integer.MAX_VALUE);
		
		System.out.println("nextInt(): " + randInt);
		System.out.println("nextInt2(): " + randInt2);
		
		//generating an random number between 0 and 10
		int randIntRange = rand.nextInt(10);
		int randIntRange2 = (int)(Math.random()*10);
		System.out.println("UW nextInt(): : " + randIntRange);
		System.out.println("CB nextInt(): " + randIntRange2);
		randomDouble();
	}//end of main
	
	public static void randomDouble() {
		//double randDoub = rand.nextDouble();
		//random double between 0.0 and 1.0
		double randDoub2 = (double)(Math.random()*100);
		System.out.println("Inside of method");
		System.out.println("Random double: " + randDoub2);
	}//end of randomDouble
	
}//end of class
