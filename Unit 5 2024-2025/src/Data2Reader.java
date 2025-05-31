import java.io.*;
import java.util.*;

public class Data2Reader {

	public static void main(String[] args) throws FileNotFoundException {
		// Coded by Kaipo Ojas
		//January 10, 2025
		//CS121/APCSA
		
		Scanner input = new Scanner(new File("src/data.txt"));
		
		while(input.hasNextLine()) {
			System.out.println(input.nextLine());
		}
	}

}
