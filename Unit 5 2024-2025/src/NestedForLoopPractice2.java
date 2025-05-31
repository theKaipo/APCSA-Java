
public class NestedForLoopPractice2 {

	public static void main(String[] args) {
		// Coded by Kaipo Ojas
		//December 16, 2024
		//CS121/APCSA
		//Nested For Loop Practice
		
		 for (int i = 1; i <= 5; i++){
			for(int j = 1; j <= i; j++) {
				System.out.print(i);
			}
			System.out.println();
		} 
		 
		for (int x = 1; x <= 5; x++) {
			for(int y = 4; y >= x; y--) {
				System.out.print("-");
			}
			System.out.print("*");
			System.out.println();
		}
		
		/*int x = 230857;
		for (int i = 0; i < 6; i++) {
			System.out.println(x%10);
			System.out.println(x/10);
			x /= 10;
		}*/
	}

}
