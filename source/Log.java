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
	/**
	 * Launch the application.
	 */
	int Hour;
	int Minute;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					setTimeFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
