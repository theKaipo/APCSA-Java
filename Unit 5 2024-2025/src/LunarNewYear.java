
public class LunarNewYear {

	public static void main(String[] args) {
		//Coded by Kaipo Ojas
		//January 8, 2025
		//CS121/APCSA
		
		int numEnvelopes = 5;
		int randNum = 0;
				
		handingOutEnvelopes(randNum, numEnvelopes);
	}
	public static void handingOutEnvelopes(int r, int n) {
		System.out.println("I have " + n + " lucky red envelops to hand out!");
		while(n > 1) {
			//Create random number that is 1 - (n/2)
			r = (int)(Math.random() * (int)(n / 2)) + 1;
			//Output statement that says how many RE you give out
			System.out.println("I am handing out "+r+" lucky red envelope(s)!");
			
			//update to n
			n -= r;
		}
		System.out.println("I am handing out my last lucky red envelop!\nHappy Lunar New Year!");
	}
}
