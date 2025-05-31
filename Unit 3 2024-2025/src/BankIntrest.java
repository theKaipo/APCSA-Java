
public class BankIntrest {

	public static void main(String[] args) {
		//Coded by Kaipo Ojas
		//October 31, 2024
		//CS121
		
		double money = 200;
		
		for(int i = 1; i <= 50; i++) {
			money *= 1.1;
		}
		
		System.out.println("Money in bank account after 50 years is: " + money);
	}

}
