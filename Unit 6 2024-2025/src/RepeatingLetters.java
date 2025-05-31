
public class RepeatingLetters {

	public static void main(String[] args) {
		String[] names= {"Kaipo","Gabby", "Ruvim","Jacob","Annaliese","Aiden","Eldon","Cami","Jaden"};
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
