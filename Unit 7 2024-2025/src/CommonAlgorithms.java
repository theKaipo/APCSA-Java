import java.util.ArrayList;

public class CommonAlgorithms {

	public static void main(String[] args) {
		// Coded by Kaipo Ojas
		//CS1221/APCSA
		//COmmon Algorithms with ArrayList
		
		ArrayList <Double> numbers = new ArrayList<Double>();
		ArrayList<Integer> numbers2 = new ArrayList<Integer>();
		numbers2.add(4);
		numbers2.add(2);
		numbers2.add(1);
		numbers2.add(7);
		numbers2.add(5);
		numbers2.add(11);
		numbers.add(3.2);
		numbers.add(2.7);
		numbers.add(1.0);
		numbers.add(7.9);
		numbers.add(5.0);
		numbers.add(11.8);
		System.out.println("Original Double Array: " + numbers);
		System.out.println("Original Integer Array: " + numbers2);
		System.out.println("Max value is: " + findMax(numbers));
		System.out.println("Min value is: " + findMin(numbers2));
		System.out.println("Sum of value is: " + findSum(numbers2));
	}
	
	public static double findMax(ArrayList<Double> val) {
		double max = val.get(0);
		for(int i = 1; i < val.size(); i++) {
			if(val.get(i) > max) 
				max = val.get(i);
		}
		
		return max;
	}
	
	public static int findMin(ArrayList<Integer> val) {
		int min = Integer.MAX_VALUE;
				
		for(int number:val) {
			if(min > number)
				min = number;
		}
		return min;
	}
	
	public static int findSum(ArrayList<Integer> val) {
		int sum = 0;
		for(int num:val) {
			sum+=num;
		}
		return sum;
	}
}
