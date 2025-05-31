
public class Musician extends Performer {
	private String instrument;

	public Musician() {
		super("Beethoven", 25);
		instrument="piano";
	}
	public Musician(String inst) {
		instrument = inst;
	}
	public String getInstrument(){
		return instrument;
	}
	public void playInstrument() {
		System.out.println("I play" + instrument);
	}
}
