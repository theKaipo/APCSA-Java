import java.util.*;
import java.io.*;

public class PollsReader {

	public static void main(String[] args) throws FileNotFoundException {
		// Coded by Kaipo Ojas
		//January 15, 2025
		//CS121/APCSA
		
		Scanner input = new Scanner(new File("src/poll.txt"));
		int obamaLead = 0;
		int McCainLead = 0;
		
		while (input.hasNextLine()) {
			String state = input.next();
			int obPercent = input.nextInt();
			int McPercent = input.nextInt();
			int electoralVotes = input.nextInt();
			
			if (obPercent >= McPercent) {
				obamaLead += electoralVotes;
			} else {
				McCainLead += electoralVotes;
			}
			input.nextLine();
		}
		System.out.println("Obama: " + obamaLead);
		System.out.println("McCain: " + McCainLead);
	}

}
