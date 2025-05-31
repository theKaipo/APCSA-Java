import java.io.*;
import java.util.*;

public class TemperatureForLoop {

	public static void main(String[] args) throws FileNotFoundException {
		// Coded by Kaipo Ojas
		//January 13, 2025
		//CS121/APCSA
		
		Scanner input = new Scanner(new File("src/weather.txt"));
		double first = input.nextDouble();
		
		while (input.hasNextDouble()) {
			double second = input.nextDouble();
			System.out.print(first + " to " + second + " change = ");
			System.out.printf("%.1f",(second-first));
			System.out.println();
			first = second;
		}
	}

}
