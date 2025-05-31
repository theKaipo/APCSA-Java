
public class Friday extends WeekDay{
	private int bedTime;
	
	public Friday(String d, int bt) {
		super(d);
		bedTime = bt;
	}
	
	public void HWLoad() {
		System.out.println("less than 45 min");
	}
	
	public void hasPlans() {
		System.out.println("Out w/ friends");
	}
}
