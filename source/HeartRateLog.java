import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Label;
import java.awt.Button;

import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class HeartRateLog extends Log{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	static int currentHeartRate;
	static public ArrayList<Integer> heartRateHistoryToday = new ArrayList<Integer>();
	static int[] dailyHeartRateAverage;
	static Label minute = new Label("00");
	static Label hour = new Label("0");
	static Label ampm = new Label("AM/PM");
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HeartRateLog frame = new HeartRateLog();
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
	public HeartRateLog() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 439, 493);
		contentPane = new JPanel();
		contentPane.setForeground(Color.BLUE);
		contentPane.setFocusCycleRoot(true);
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Button switchScreenButton = new Button("");
		switchScreenButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				CalorieLog.hour.setText(Integer.toString(Log.Hour));
				if(Log.Minute>9) {
					CalorieLog.minute.setText(Integer.toString(Log.Minute));
					}
				else {
					CalorieLog.minute.setText("0"+Integer.toString(Log.Minute));
				}
				CalorieLog.calBurned.setText(Integer.toString(((CalorieLog.calBurnedToday)/(CalorieLog.dailyCalGoal))));
				if((((CalorieLog.calBurnedToday)/(CalorieLog.dailyCalGoal)))/5<100) {
					CalorieLog.progressBar.setValue((((CalorieLog.calBurnedToday)/(CalorieLog.dailyCalGoal)))/5);
				}
				else {
					CalorieLog.progressBar.setValue(100);
				}
				CalorieLog.ampm.setText(Log.AMPM);
				UILayer.switchToCalorieScreen();
			}
		});
		switchScreenButton.setBackground(Color.RED);
		switchScreenButton.setBounds(351, 39, 42, 137);
		contentPane.add(switchScreenButton);
		
		Label heartRate = new Label("000");
		heartRate.setFont(new Font("Dialog", Font.PLAIN, 75));
		heartRate.setForeground(Color.WHITE);
		heartRate.setBounds(74, 217, 128, 107);
		contentPane.add(heartRate);
		
		Label Current_label = new Label("Current");
		Current_label.setFont(new Font("Dialog", Font.PLAIN, 54));
		Current_label.setForeground(Color.RED);
		Current_label.setBounds(10, 24, 192, 53);
		contentPane.add(Current_label);
		
		Label Heartrate_Label = new Label("Heartrate");
		Heartrate_Label.setForeground(Color.RED);
		Heartrate_Label.setFont(new Font("Dialog", Font.PLAIN, 54));
		Heartrate_Label.setBounds(93, 83, 239, 53);
		contentPane.add(Heartrate_Label);
		
		hour.setForeground(Color.RED);
		hour.setFont(new Font("Dialog", Font.PLAIN, 90));
		hour.setBounds(44, 133, 59, 78);
		contentPane.add(hour);
		
		Label label_4 = new Label(":");
		label_4.setForeground(Color.RED);
		label_4.setFont(new Font("Dialog", Font.PLAIN, 90));
		label_4.setBounds(92, 115, 24, 96);
		contentPane.add(label_4);
		
		minute.setForeground(Color.RED);
		minute.setFont(new Font("Dialog", Font.PLAIN, 90));
		minute.setBounds(122, 133, 103, 78);
		contentPane.add(minute);
		
		Label BPM = new Label("BPM");
		BPM.setFont(new Font("Dialog", Font.PLAIN, 52));
		BPM.setForeground(Color.WHITE);
		BPM.setBounds(199, 241, 151, 62);
		contentPane.add(BPM);
		ampm.setFont(new Font("Eras Medium ITC", Font.PLAIN, 32));
		
		ampm.setForeground(Color.RED);
		ampm.setBounds(231, 151, 119, 45);
		contentPane.add(ampm);
		
		Button button = new Button("Get Heartrate");
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
			currentHeartRate=HeartrateMoniter.getData();	
			heartRate.setText(Integer.toString(currentHeartRate));
			heartRateHistoryToday.add(currentHeartRate);
			CalorieLog.calBurnedToday = CalorieCounter.getData();
			}
		});
		button.setForeground(Color.RED);
		button.setBounds(44, 335, 349, 45);
		contentPane.add(button);
	}
}
