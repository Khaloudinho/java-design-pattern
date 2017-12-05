package observer;

public class Main {

	public static void main(String[] args) {	
		
		Clock clock = new Clock();
		Timer timer = new Timer(clock);
		
		FrenchClock frenchClock = new FrenchClock(clock);
		EnglishClock englishClock = new EnglishClock(clock);
		
		clock.addObserver(frenchClock);
		clock.addObserver(englishClock);
		
		timer.start();

	}

}
