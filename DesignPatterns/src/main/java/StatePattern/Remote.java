package StatePattern;

public class Remote {

	public static void main(String[] args) {
		TV tv = new TV();
		State On = new TVOnState();
		State Off = new TVOffState();
		State VolUp = new TVVolUp();
		State VolDown = new TVVolDown();

		tv.setState(On);
		tv.perform();
		
		tv.setState(VolUp);
		tv.perform();
		
		tv.setState(VolDown);
		tv.perform();
		
		tv.setState(Off);
		tv.perform();
		
	}

}