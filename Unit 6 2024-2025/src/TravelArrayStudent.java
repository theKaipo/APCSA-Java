import java.util.*;

public class TravelArrayStudent {

	public static void main(String args[])
	{
		//Coded by Kaipo Ojas
		//Jan 29, 2025
		//CS121/APCSA
		//Array Traversal
	double[] myarray1 = {1.2, 3.0, 0.8};
	double sum1 = 0;
	// Pattern 1: i indexes each element
	for (int i = 0; i < myarray1.length; i++)

	{
	sum1 += myarray1[i];
	}
	System.out.println("The sum with a for loop is: " + sum1);
	double sum2 = 0;
	// Pattern 2: d gets each element in myarray1
	for (double d : myarray1)

	{
	sum2 += d;
	}
	System.out.println("The sum with a for each loop is: " + sum1);
	
	// Copy an array

	int[] scores = {10,8,7,4,5};
	int[] copyOfScores = scores;
	System.out.println(scores[1]);
	System.out.println(copyOfScores[1]);
	scores[1] = 100;
	System.out.println(copyOfScores[1]);

	System.out.println("Average of the array: " + average(scores));
	}//end of main

	// Returns the average of the given array of numbers.

	public static double average(int[] numbers) {

	int sum = 0;
	//Option A with traditonal for loop
	/*for (int i = 0; i < numbers.length; i++) {

	sum += numbers[i];

	}*/
	//Option B for each loop
	for(int s:numbers) 
		sum += s;
	return (double) sum / numbers.length;

	}
}//end of class
