package observer;

import java.text.DateFormat;
import java.util.Locale;
import java.util.Observable;
import java.util.Observer;

public class EnglishClock implements Observer {

	private Clock clock;
	private DateFormat englishFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, new Locale("EN","en"));

	public EnglishClock(Clock clock) {
		super();
		this.clock = clock;
	}

	@Override
	public void update(Observable o, Object arg) {
		System.out.println(englishFormat.format(((Clock)o).getDate()));
	}

}
