import java.util.ArrayList;

public class Comedian extends Performer{

	private ArrayList<String> jokes = new ArrayList<String>();

	public Comedian(String n, int a) {
		super(n, a);
	}

	public void writeJokes() {
		jokes.add("Why was 6 afraid of 7? .... Because 7 ate 9!");
		jokes.add("How do you make a witch itch? .... Take out the \"W\"!");
		jokes.add("Why didn't the skeleton go to school? .... His heart wasn't in it!");
		jokes.add("What do you call a fly with no wings? .... A walk!");
	}

	public void perform() {
		for (String j : jokes) {
			System.out.println(j);
		}
	}
}
