import java.util.*;
import java.io.*;

public class EvenNumberCount {

	public static void main(String[] args) throws FileNotFoundException {
		// Coded by Kaipo Ojas
		//January 14, 2025
		//CS121/APCSA
		Scanner input = new Scanner(new File("src/evenNumbers.txt"));
		evenNumbers(input);
	}
	public static void evenNumbers(Scanner input) {
		int count = 0;
		int evenCount = 0;
		int sum = 0;
		
		while(input.hasNextInt()) {
			int num = input.nextInt();	
			count++;
			sum += num;
			if(num%2 == 0) {
				evenCount++;
			}
		}//end of while loop
		double percent = 100.0 * evenCount/count;
		System.out.println(count + " numbers, sum = " + sum);
		System.out.printf("%d evens (%.2f%%)\n", evenCount, percent);
		
	}//end of method

}//end of class
