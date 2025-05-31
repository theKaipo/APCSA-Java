
public class OddLengthNames {

	public static void main(String[] args) {
		// Coded by Kaipo Ojas
		//2/5/2025
		//CS121/APCSA
		//Swapping and ArrayCounting
		String [] names = {"Kaipo", "Gabby","Ravim", "Jacob", "even"};
		//Print original Array
		for(String n:names) {
			System.out.print(n + " ");
		}
		//Swap the first 2 element
		String temp=names[0];
		names[0]=names[1];
		names[1]=temp;
		//Print Array with swapped names
		System.out.println();
		for(String n:names) {
			System.out.print(n + " ");
		}
		
		System.out.println("\nMy odd length names in my array is: " + oddLength(names));
	}
	
	public static int oddLength(String[] n) {
		int count = 0;
		
		for(int i=0; i < n.length; i++) {
			if (n[i].length() % 2 == 1) {
				count++;
			}
		}
		
		return count;
	}

}
