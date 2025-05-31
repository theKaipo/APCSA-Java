
public class TheShow {

	public static void main(String[] args) {

		// Coded by Kaipo Ojas
		// April 14th, 2025
		// AP CSA / CS 121 Inheritance

		Musician Beethoven = new Musician();
		Musician B2 = new Musician("Grande Piano");

		Beethoven.playInstrument();

		System.out.println("My name is "+Beethoven.getName());

		B2.playInstrument();

		System.out.println("My name is "+B2.getName() + " and my age is "+B2.getAge());
		// ================= DAY 2 =================
		Performer penny = new Performer("Penny", 18);
		Comedian Will = new Comedian("Will", 17);

		System.out.print("My name is "+penny.getName()+" and this is what I do: ");
		penny.perform();

		System.out.println("My name is "+Will.getName()+" and this is what I do: ");
		Will.writeJokes();
		Will.perform();
		//================== DAY 3 ==================
		BalletDancer mikhail = new BalletDancer("Mikhail", 23, 9.0);
		
		mikhail.practice();
		mikhail.perform();
	}

}