import javax.swing.JFrame;

public class Log extends JFrame {

	private static final long serialVersionUID = 1L;
	public Log() {
	}
	
	static Log setTimeFrame = new SetTime();
	static Log calorieLogFrame = new CalorieLog();
	static Log heartRateLogFrame = new HeartRateLog();
	static Log stepLogFrame = new StepLog();
	static int Hour;
	static int Minute;
	static String AMPM;
	static Clock clock = new Clock();
	static Thread time = new Thread(clock);
	
	public static int getHour() {
		return Hour;
	}
	public static void setHour(int hour) {
		Hour = hour;
	}
	public static int getMinute() {
		return Minute;
	}
	public static void setMinute(int minute) {
		Minute = minute;
	}

}
