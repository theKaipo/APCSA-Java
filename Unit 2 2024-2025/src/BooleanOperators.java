import java.util.Scanner;

public class BooleanOperators {

	public static void main(String[] args) {
		//Coded by Kaipo Ojas
		//October 1, 2024
		//Boolean Operator Practice
		
		//Declare Scanner
		Scanner kb = new Scanner(System.in);
		
		System.out.println("5 < 20: " + (5 < 20));
        System.out.println("29.8 == 14825.7942: " + (29.8 == 14825.7942));
        System.out.println("18 % 2 != 0: " + (18 % 2 != 0));
        System.out.println("-6 < -6: " + (-6 < -6));
        System.out.println("-6 <= -6: " + (-6 <= -6));
        System.out.println("5 < 20 && -6 <= -6: " + (5 < 20 && -6 <= -6));
        System.out.println("5 < 20 && -6 < -6: " + (5 < 20 && -6 < -6));
        System.out.println("5 < 20 || -6 <= -6: " + (5 < 20 || -6 <= -6));
        System.out.println("5 < 20 || -6 < -6: " + (5 < 20 || -6 < -6));
        System.out.println("!(7.162 >= 7): " + !(7.162 >= 7));
        
        //Scanner
        System.out.print("true or false: ");
		boolean boolOne = kb.nextBoolean();
		System.out.print("true or false: ");
		boolean boolTwo = kb.nextBoolean();
		
		//
		boolean test = boolOne && boolTwo;
		
		//Output Result
		System.out.println(test);
	}

}
