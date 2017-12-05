package observer;

import java.util.Date;

public class Timer extends Thread {

	private Clock clock;
	
	public Timer(Clock clock){
		this.clock = clock;
	}
	
	@Override
	public void run() {		
		while (true) {
			try {
				sleep(1000);
				clock.setDate(new Date());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
