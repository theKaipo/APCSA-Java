import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BDroidBouncer {

	public static void main(String[] args) throws FileNotFoundException {
		// Coded by Kaipo Ojas
		//2/11/2025
		
		Scanner input = new Scanner(new File("src/b.in.txt"));
		while(input.hasNextLine()) {
			String name = input.nextLine();
			for(int i = 0; i<name.length()-1; i++) {
				if(name.substring(i, i+1).equals(name.substring(i, i+1).toUpperCase())) {
					
				}
			}
		}
	}
}
