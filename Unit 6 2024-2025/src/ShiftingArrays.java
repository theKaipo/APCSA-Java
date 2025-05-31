
public class ShiftingArrays {
	public static void main(String[] args) {
		// Coded by Kaipo Ojas
		//February 3, 2025
		//CS121/APCSA
		//Shifting contents of an array
		int[] numbers = {10, 5, 100, 1, 2, 3};
		int[] right = new int[numbers.length];
		
		right[0] = numbers[numbers.length-1];
		for (int i = 0; i < numbers.length-1; i++) {
			right[i + 1] = numbers[i];
		}
		//Print original array
		System.out.println("The original array: ");
		for(int value:numbers)
			System.out.print(value + " ");
		//Print the new shifted array
		System.out.println("\nThe shifted array: ");
		for (int j:right) {
			System.out.print(j + " ");
		}
		
		//Shifting String array
		System.out.println();
		String[] names = {"name1", "name2", "name3", "name4"};
		String[] namesRight = new String[names.length];
		
		namesRight[0] = names[names.length-1];
		for (int i = 0; i < names.length-1; i++) {
			namesRight[i + 1] = names[i];
		}
		//Print original array
		System.out.println("The original array: ");
		for(String value:names)
			System.out.print(value + " ");
		//Print the new shifted array
		System.out.println("\nThe shifted array: ");
		for (String j:namesRight) {
			System.out.print(j + " ");
		}
		
		//Shift Array Left
		int[] nums = {1, 2, 3, 4, 5};
		int[] left = new int[nums.length];
		
		left[nums.length - 1] = nums[0];
		for (int i = nums.length; i > 1; i--) {
			left[(nums.length - 1) - i] = nums[i];
		}
	}
}
