import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JProgressBar;
import java.awt.Label;
import java.awt.Button;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class CalorieLog extends Log{

	private JPanel contentPane;
	private int calBurnedToday;
	private int[] calBurnedThisMonth;
	int dailyCalGoal;
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
		dailyCalGoal=500;
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setForeground(Color.GREEN);
		progressBar.setBounds(122, 321, 271, 36);
		contentPane.add(progressBar);
		
		Label goal = new Label("0000");
		goal.setForeground(Color.WHITE);
		goal.setBounds(44, 331, 72, 36);
		contentPane.add(goal);
		
		Button switchScreenButton = new Button("");
		switchScreenButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				Log.stepLogFrame.setVisible(true);
				Log.calorieLogFrame.setVisible(false);
			}
		});
		switchScreenButton.setForeground(Color.GREEN);
		switchScreenButton.setBackground(Color.GREEN);
		switchScreenButton.setBounds(351, 39, 42, 137);
		contentPane.add(switchScreenButton);
		
		Label slash = new Label("/");
		slash.setForeground(Color.WHITE);
		slash.setBounds(88, 302, 15, 36);
		contentPane.add(slash);
		
		Label stepsTaken = new Label("0000");
		stepsTaken.setForeground(Color.WHITE);
		stepsTaken.setBounds(10, 292, 86, 53);
		contentPane.add(stepsTaken);
		
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
		
		Label Hour = new Label("0");
		Hour.setForeground(Color.GREEN);
		Hour.setFont(new Font("Dialog", Font.PLAIN, 90));
		Hour.setBounds(44, 166, 59, 78);
		contentPane.add(Hour);
		
		Label label_4 = new Label(":");
		label_4.setForeground(Color.GREEN);
		label_4.setFont(new Font("Dialog", Font.PLAIN, 90));
		label_4.setBounds(92, 150, 24, 96);
		contentPane.add(label_4);
		
		Label minute = new Label("00");
		minute.setForeground(Color.GREEN);
		minute.setFont(new Font("Dialog", Font.PLAIN, 90));
		minute.setBounds(122, 166, 103, 78);
		contentPane.add(minute);
		
		Label AMPM = new Label("AM/PM");
		AMPM.setForeground(Color.GREEN);
		AMPM.setBounds(228, 178, 114, 45);
		contentPane.add(AMPM);
	}

}
