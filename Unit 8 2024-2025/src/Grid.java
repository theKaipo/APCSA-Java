
public class Grid {

	public static void main(String[] args) {
		//Coded by Kaipo Ojas
		//March 21, 2025
		//CS12/APCSA
		//Traversing a 2D Array
		
		String[][] grid = {{"A", "B","C","D","E"},
							{"F", "G","H","I","J"},
							{"K", "L","M","N","O"},
							{"P", "Q","R","S","T"}
							};
		System.out.println(grid[0][4]);
		System.out.println(grid[3][4]);
		
		tradLoop(grid);
		enhancedLoop(grid);
		colMajor(grid);
		practice();
	}
	
	public static void tradLoop(String[][] grid) {
		System.out.println("Traditional For Loop");
		for(int row =0; row < grid.length; row++) {
			for(int col = 0; col < grid[0].length; col++) {
				System.out.print(grid[row][col] + " ");
			}//end of col
			System.out.println();
		}//end of row
	}
	
	public static void enhancedLoop(String[][] grid) {
		System.out.println("Enhanced For Loop");
		for(String[] row:grid) {
			for(String col:row) {
				System.out.print(col + " ");
			}
			System.out.println();
		}
	}
	
	public static void colMajor(String[][] grid) {
		System.out.println("Column Major Order");
		for(int col = 0; col < grid[0].length; col++) {
			for(int row =0; row < grid.length; row++) {
				System.out.print(grid[row][col]);
			}//end of col
			System.out.print(" ");
		}//end of row
		System.out.println();
	}
	
	public static void practice() {
		String[][] arr = {{"My", "A"}, {"AP", "Class"},{"CS", "Rocks!"}};
		
		System.out.println("Practice For Loop");
		for(int col = 0; col < arr[0].length; col++) {
			for(int row =0; row < arr.length; row++) {
				System.out.print(arr[row][col] + " ");
			}//end of col
		}//end of row
	}
}
