import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Log extends JFrame {
	public Log() {
	}
	
	static Log setTimeFrame = new SetTime();
	static Log calorieLogFrame = new CalorieLog();
	static Log heartRateLogFrame = new HeartRateLog();
	static Log stepLogFrame = new StepLog();
	static int Hour;
	static int Minute;
	static String AMPM;
	public static Log getSetTimeFrame() {
		return setTimeFrame;
	}
	public static void setSetTimeFrame(Log setTimeFrame) {
		Log.setTimeFrame = setTimeFrame;
	}
	public static Log getCalorieLogFrame() {
		return calorieLogFrame;
	}
	public static void setCalorieLogFrame(Log calorieLogFrame) {
		Log.calorieLogFrame = calorieLogFrame;
	}
	public static Log getHeartRateLogFrame() {
		return heartRateLogFrame;
	}
	public static void setHeartRateLogFrame(Log heartRateLogFrame) {
		Log.heartRateLogFrame = heartRateLogFrame;
	}
	public static Log getStepLogFrame() {
		return stepLogFrame;
	}
	public static void setStepLogFrame(Log stepLogFrame) {
		Log.stepLogFrame = stepLogFrame;
	}
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
