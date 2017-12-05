package observer;

import java.text.DateFormat;
import java.util.Locale;
import java.util.Observable;
import java.util.Observer;

public class FrenchClock implements Observer {

	private Clock clock;
	private DateFormat frenchFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, new Locale("FR","fr"));

	public FrenchClock(Clock clock) {
		super();
		this.clock = clock;
	}

	@Override
	public void update(Observable o, Object arg) {
		System.out.println(frenchFormat.format(((Clock)o).getDate()));
	}

}
