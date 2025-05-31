import java.util.*;
import java.io.*;

public class FlipLines {

	public static void main(String[] args) throws FileNotFoundException {
		//Coded by Kaipo Ojas
		//January 15, 2025
		//CS121/APCSA
		//Flipping pairs of lines
		
		Scanner fileScan = new Scanner(new File("src/jabberwock.txt"));
		flipLines(fileScan);
	}//end of main
	
	public static void flipLines(Scanner fileScan) {
			while (fileScan.hasNextLine()) {
				//Grab a line
				String line1 = fileScan.nextLine();
				if(fileScan.hasNextLine()) {
					String line2 = fileScan.nextLine();
					System.out.println(line2);
				}//end of if statement
				System.out.println(line1);
			}//end of file loop
	}// end of flipLines method

}//end of class
