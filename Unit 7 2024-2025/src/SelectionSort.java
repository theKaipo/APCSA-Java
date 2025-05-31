import java.util.ArrayList;

public class SelectionSort {

	public static void main(String[] args) {
		// Coded by Kaipo Ojas
		//March 3, 2025
		
		int[] arr = {0, 9, 8, 7, 6, 5, -1, 2, 2, 1 };
		//sortArray(arr);
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(5); list.add(-1); list.add(0); 
		list.add(4); list.add(8); list.add(3);
		ArrayList<String> names = new ArrayList<String>();
		names.add("Strawberry");names.add("Pineapple");names.add("Apple");names.add("Blueberry");
		names.add("Grapes");names.add("Lime");names.add("Rasberry");names.add("Peach");
		names.add("Banana");names.add("Mango");names.add("Kaipo");names.add("Orange");		
		
		sortArray(arr);
		sortArrayList(list);
		alphaOrder(names);
	}
	
	public static void sortArray(int arr[]) {
		//Print original array
		System.out.print("Original Array: ");
		for(int num: arr) {
			System.out.print(num + " ");
		}
		
		for(int i = 0; i < arr.length - 1; i++) {
			int minIndex = i;
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}//j-loop
			//Swap Values
			if(minIndex != i) {
				int temp = arr[minIndex];
				arr[minIndex] = arr[i];
				arr[i] = temp;
			}
		}//i-loop
		
		//Print Sorted Array
		System.out.print("\nSorted array: ");
		for(int num: arr) {
			System.out.print(num + " ");
		}
	}//end of Sort Array
	
	public static void sortArrayList(ArrayList<Integer> nums) {
		System.out.println("\nOriginal Array List: " + nums);
		for(int i = 0; i < nums.size() - 1; i++) {
			int minIndex = i;
			for(int j = i + 1; j < nums.size(); j++) {
				if(nums.get(j) < nums.get(minIndex)) {
					minIndex = j;
				}
			}//j-loop
			//Swap Values
			if(minIndex != i) {
				int temp = nums.get(minIndex);
				nums.set(minIndex, nums.get(i));
				nums.set(i, temp);
			}
		}//i-loop
		
		System.out.println("Sorted Array List: " + nums);
	}
	
	public static void alphaOrder(ArrayList<String> names) {
		System.out.println("Original Array List: " + names);
		
		for(int i = 0; i < names.size() - 1; i++) {
			int minIndex = i;
			for(int j = i + 1; j < names.size(); j++) {
				if(names.get(j).compareTo(names.get(minIndex)) < 0) {
					minIndex = j;
				}
			}//j-loop
			//Swap Values
			if(minIndex != i) {
				String temp = names.get(minIndex);
				names.set(minIndex, names.get(i));
				names.set(i, temp);
			}
		}//i-loop
		System.out.println("Alpha Order Array List: "+  names);
	}
}
