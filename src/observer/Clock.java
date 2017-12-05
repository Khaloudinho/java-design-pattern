package observer;

import java.util.Date;
import java.util.Observable;

public class Clock extends Observable {

	public static Date date;

	public Date getDate(){
		return date;	
	}

	public void setDate(Date dateParam) {
		date = dateParam;
		setChanged();
		this.notifyObservers(date);
	}
	
}
