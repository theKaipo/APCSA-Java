
public class Mystery3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 4; i++) {
			//for loop for spaces
			for(int j = 1; j <=(4-i); j++) {
				System.out.print(" ");
			}
			
			for(int k = 1; k<= i; k++) {
				System.out.print("@");
			}
			
			System.out.println();
		}
	}

}
