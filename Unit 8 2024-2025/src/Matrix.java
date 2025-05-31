
public class Matrix {

	public static void main(String[] args) {
		//Coded by KAipo Ojas
		//March 25, 2025
		//CS121/APCSA 2D array algorithms
		
		boolean[][] matrix = new boolean[2][5];
		
		//Fill array with random values of true or falses
		for(int row=0; row < matrix.length; row++) {
			for(int col = 0; col < matrix[0].length; col++) {
				int num = (int)(Math.random()*2);
				if(num == 0) {
					matrix[row][col] = false;
				} else {
					matrix[row][col] = true;
				}
				System.out.print(matrix[row][col] + " ");
			}
			System.out.println();
		}
		
		//Call method
		System.out.println("Percent of true values is: " + percentTrue(matrix));
	}
	//Given a 2D array of boolean values,
	//return the percentage of elements(in decimals)
	//that set to true
	public static double percentTrue(boolean[][] matrix) {
		int trueCounter = 0;
		
		for(int row=0; row < matrix.length; row++) {
			for(int col = 0; col < matrix[0].length; col++) {
				if(matrix[row][col] == true) {
					trueCounter++;
				} else {
				}
			}
		}
		
		return ((double)trueCounter)/(matrix.length*matrix[0].length);
	}

}
