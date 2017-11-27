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

public class HeartRateLog extends Log{

	private JPanel contentPane;
	int currentHeartRate;
	int[] heartRateHistoryToday;
	int[] dailyHeartRateAverage;
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
				Log.calorieLogFrame.setVisible(true);
				Log.heartRateLogFrame.setVisible(false);
			}
		});
		switchScreenButton.setBackground(Color.RED);
		switchScreenButton.setBounds(351, 39, 42, 137);
		contentPane.add(switchScreenButton);
		
		Label stepsTaken = new Label("000");
		stepsTaken.setFont(new Font("Dialog", Font.PLAIN, 75));
		stepsTaken.setForeground(Color.WHITE);
		stepsTaken.setBounds(74, 217, 128, 107);
		contentPane.add(stepsTaken);
		
		Label Current = new Label("Current");
		Current.setFont(new Font("Dialog", Font.PLAIN, 54));
		Current.setForeground(Color.RED);
		Current.setBounds(10, 24, 192, 53);
		contentPane.add(Current);
		
		Label label_2 = new Label("Heartrate");
		label_2.setForeground(Color.RED);
		label_2.setFont(new Font("Dialog", Font.PLAIN, 54));
		label_2.setBounds(93, 83, 239, 53);
		contentPane.add(label_2);
		
		Label label_3 = new Label("0");
		label_3.setForeground(Color.RED);
		label_3.setFont(new Font("Dialog", Font.PLAIN, 90));
		label_3.setBounds(44, 133, 59, 78);
		contentPane.add(label_3);
		
		Label label_4 = new Label(":");
		label_4.setForeground(Color.RED);
		label_4.setFont(new Font("Dialog", Font.PLAIN, 90));
		label_4.setBounds(92, 115, 24, 96);
		contentPane.add(label_4);
		
		Label label_5 = new Label("00");
		label_5.setForeground(Color.RED);
		label_5.setFont(new Font("Dialog", Font.PLAIN, 90));
		label_5.setBounds(122, 133, 103, 78);
		contentPane.add(label_5);
		
		Label label_1 = new Label("BPM");
		label_1.setFont(new Font("Dialog", Font.PLAIN, 52));
		label_1.setForeground(Color.WHITE);
		label_1.setBounds(199, 241, 151, 62);
		contentPane.add(label_1);
		
		Label label_6 = new Label("AM/PM");
		label_6.setForeground(Color.RED);
		label_6.setBounds(231, 151, 119, 45);
		contentPane.add(label_6);
		
		Button button = new Button("Get Heartrate");
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
			}
		});
		button.setForeground(Color.RED);
		button.setBounds(44, 335, 349, 45);
		contentPane.add(button);
	}

}
