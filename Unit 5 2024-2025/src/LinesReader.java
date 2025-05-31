import java.io.*;
import java.util.*;

public class LinesReader {

	public static void main(String[] args) throws FileNotFoundException {
		// Coded by Kaipo Ojas
		//Jan 10, 2025
		//CS121/APCSA
		//PLU 3rd Practice Question
		
		Scanner input = new Scanner(new File("src/lines.dat"));
		input.nextLine();
		
		while(input.hasNextLine()) {
			System.out.println(input.nextLine() + " lines were sent");
		}
	}

}
