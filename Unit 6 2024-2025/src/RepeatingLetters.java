
public class RepeatingLetters {

	public static void main(String[] args) {
		String[] names= {"Kaipo","name1", "name12","name123","name1234","name12345","name123456","name1234567","name12345678"};
		System.out.println("The number of double letters in my array is: " + doubleLetters(names));
	}
	
	public static int doubleLetters(String[] n) {
		int count = 0;
		for(int i = 0; i < n.length; i++) {
			for(int j = 0; j<n[i].length() - 1;j++) {
				if(n[i].substring(j, j+1).equalsIgnoreCase(n[i].substring(j+1, j+2))) {
					count++;
				}
			}
		}
		return count;
	}

}
