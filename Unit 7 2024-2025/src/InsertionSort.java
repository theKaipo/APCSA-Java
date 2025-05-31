import java.util.ArrayList;

public class InsertionSort {

	public static void main(String[] args) {
		// Coded by Kaipo Ojas
		//March 13
		//CS121/APCSA
		int[] arr = new int[10];
		System.out.print("Original Array: ");
		for(int i=0; i < arr.length;i++) {
			arr[i]= (int)(Math.random()*22-11);
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		//Printing sorted array
		arr = insertionSort(arr);
		System.out.print("Sorted Array: ");
		for(int val:arr) {
			System.out.print(val + " ");
		}
		System.out.println();
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		//Get random numbers
		for(int i = 0; i <= 10; i++) {
			int rand = (int)(Math.random()*22-11);
			list.add(rand);
		}
		System.out.println("Original ArrayList: " + list);
		System.out.println("Sorted ArrayList: " + ALinsertionSort(list));
		
	}
	public static int[] insertionSort(int[] num) {
		for(int i = 1; i < num.length; i++) {
			int key = num[i];
			int pos = i;
			while(pos>0 && num[pos-1]>key) {
				num[pos] = num[pos-1];
				pos--;
			}
			num[pos] = key;
		}
		return num;
	}
	public static ArrayList<Integer> ALinsertionSort(ArrayList<Integer> nums) {
		for(int i = 1; i < nums.size(); i++) {
			int key = nums.get(i);
			int pos = i;
			while(pos>0 && nums.get(pos-1)>key) {
				nums.set(pos, nums.get(pos-1));
				pos--;
			}
			nums.set(pos, key);
		}
		return nums;
	}
}
