import java.io.*;
import java.util.*;
public class StringsAreTasty {
	static List<String> inputLines = new ArrayList<>();
	static List<String> outputLines = new ArrayList<>();
	
	public static void main(String[] args) throws IOException{
		// Coded by Kaipo
		
		readInput();
		compute();
		writeOutput();

	}
	//==============
	public static void readInput() throws IOException{
		String fName="src/tasty_input.txt";
		Scanner reader = new Scanner(new File(fName));
		
		while(reader.hasNextLine()) {
			inputLines.add(reader.nextLine());
		}
	}
	//============
	public static void writeOutput() throws IOException {
		String fName = "src/outputTasty.out.txt";
		BufferedWriter writer = new BufferedWriter(new FileWriter(fName));
		for (String str: outputLines) {
			writer.write(str+"\n");
		}
		writer.close();
	}
	//=============
	public static void compute() throws IOException {
		String brains = "brains";
		for(String str: inputLines) {
			int i = 0;
			for(char ch: str.toLowerCase().toCharArray()) {
				if(brains.length() > i && ch == brains.charAt(i)) {
					i++;
				}
			}
			if(i==brains.length()) {
				outputLines.add("Tasty!");
			} else {
				outputLines.add("Not Tasty!");
			}
		}
	}
}
