package Model;

import javax.swing.Timer;

import java.awt.event.ActionListener;
import java.util.TimerTask;

public class ProcessingTimer {
	private int secs;
	private static int delay = 1000;
	private static int period = 1000;
	private static boolean orderComplete = false;
	private static int interval;	
	
	public ProcessingTimer(int secs) {
		this.secs = secs;
		interval = secs;
	}

	/**
	 * Determines when to halt the timer based on the interval
	 * @return interval
	 */
	private static final int setInterval() {
	    if (interval == 1)
	    	orderComplete = true;
	    return --interval;	
	}
}
