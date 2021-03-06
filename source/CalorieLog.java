
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JProgressBar;
import java.awt.Label;
import java.awt.Button;

import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class CalorieLog extends Log{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	static int calBurnedToday = 0;
	static int[] calBurnedThisMonth;
	static int dailyCalGoal=500;
	static Label minute = new Label("00");
	static Label hour = new Label("0");
	static Label ampm = new Label("AM/PM");
	static Label calBurned = new Label("0000");
	static JProgressBar progressBar = new JProgressBar();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalorieLog frame = new CalorieLog();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CalorieLog() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 439, 493);
		contentPane = new JPanel();
		contentPane.setForeground(Color.BLUE);
		contentPane.setFocusCycleRoot(true);
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		hour.setAlignment(Label.RIGHT);
		
		
		hour.setForeground(Color.GREEN);
		hour.setFont(new Font("Dialog", Font.PLAIN, 90));
		hour.setBounds(10, 166, 95, 78);
		contentPane.add(hour);
		
		
		
		progressBar.setForeground(Color.GREEN);
		progressBar.setBounds(122, 321, 271, 36);
		contentPane.add(progressBar);
		
		Label goal = new Label(Integer.toString(dailyCalGoal));
		goal.setFont(new Font("Dialog", Font.PLAIN, 29));
		goal.setForeground(Color.WHITE);
		goal.setBounds(44, 331, 72, 36);
		contentPane.add(goal);
		
		Button switchScreenButton = new Button("");
		switchScreenButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				StepLog.hour.setText(Integer.toString(Log.Hour));
				if(Log.Minute>9) {
					StepLog.minute.setText(Integer.toString(Log.Minute));
					}
				else {
					StepLog.minute.setText("0"+Integer.toString(Log.Minute));
				}
				StepLog.ampm.setText(Log.AMPM);
				UILayer.switchToStepScreen();
			}
		});
		switchScreenButton.setForeground(Color.GREEN);
		switchScreenButton.setBackground(Color.GREEN);
		switchScreenButton.setBounds(351, 39, 42, 137);
		contentPane.add(switchScreenButton);
		
		Label slash = new Label("/");
		slash.setFont(new Font("Dialog", Font.PLAIN, 29));
		slash.setForeground(Color.WHITE);
		slash.setBounds(81, 297, 15, 48);
		contentPane.add(slash);
		calBurned.setAlignment(Label.RIGHT);
		calBurned.setFont(new Font("Dialog", Font.PLAIN, 29));
		
		
		calBurned.setForeground(Color.WHITE);
		calBurned.setBounds(10, 297, 72, 45);
		contentPane.add(calBurned);
		
		Label Calories = new Label("Calories");
		Calories.setFont(new Font("Dialog", Font.PLAIN, 54));
		Calories.setForeground(Color.GREEN);
		Calories.setBounds(10, 39, 214, 53);
		contentPane.add(Calories);
		
		Label Burned = new Label("Burned");
		Burned.setForeground(Color.GREEN);
		Burned.setFont(new Font("Dialog", Font.PLAIN, 54));
		Burned.setBounds(159, 107, 186, 53);
		contentPane.add(Burned);
		
		Label label_4 = new Label(":");
		label_4.setForeground(Color.GREEN);
		label_4.setFont(new Font("Dialog", Font.PLAIN, 90));
		label_4.setBounds(101, 150, 27, 96);
		contentPane.add(label_4);
		

		minute.setForeground(Color.GREEN);
		minute.setFont(new Font("Dialog", Font.PLAIN, 90));
		minute.setBounds(122, 166, 103, 78);
		contentPane.add(minute);
		ampm.setFont(new Font("Eras Medium ITC", Font.PLAIN, 32));
		
		
		ampm.setForeground(Color.GREEN);
		ampm.setBounds(228, 178, 114, 45);
		contentPane.add(ampm);
	}

}
