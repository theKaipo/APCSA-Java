import java.util.ArrayList;

public class BinarySearch {
	
	public static int counter=0;

	public static void main(String[] args) {
		// Coded by Kaipo Ojas
		//3/6/2025
		//CS121/APCSA
		ArrayList<Integer> nums = new ArrayList<Integer>();
		nums.add(1);
		nums.add(3);
		nums.add(4);
		nums.add(6);
		nums.add(7);
		nums.add(10);
		nums.add(12);
		System.out.println("The Original Array List: " + nums);
		
		int target = (int)(Math.random()*12);
		System.out.println("Random num: " + target);
		
		System.out.println("Position of target is: " + binarySearch(nums, target));
		System.out.println("The number of checks is: " + counter);
	}
	public static int binarySearch(ArrayList<Integer> nums, int target) {
		int start = 0;
		counter = 0;
		int end = nums.size() - 1;
		int mid = (start+end)/2;
		while(target != nums.get(mid) && start <= end) {
			if(target < nums.get(mid)) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
			mid = (start+end)/2;
			counter++;
		}
		if(target == nums.get(mid)) {
			return mid;
		} else {
			return -1;
		}
	}
}
