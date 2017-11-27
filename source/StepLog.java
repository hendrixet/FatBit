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

public class StepLog extends Log{

	private JPanel contentPane;
	int stepsToday;
	int[] StepsThisMonth;
	int dailyStepGoal;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StepLog frame = new StepLog();
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
	public StepLog() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 439, 493);
		contentPane = new JPanel();
		contentPane.setForeground(Color.BLUE);
		contentPane.setFocusCycleRoot(true);
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		stepsToday=0;
		dailyStepGoal=500;
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setBounds(122, 233, 271, 36);
		contentPane.add(progressBar);
		
		Button switchScreenButton = new Button("");
		switchScreenButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				Log.heartRateLogFrame.setVisible(true);
				Log.stepLogFrame.setVisible(false);
			}
		});
		switchScreenButton.setBackground(Color.BLUE);
		switchScreenButton.setBounds(351, 39, 42, 137);
		contentPane.add(switchScreenButton);
		
		Label label_1 = new Label("/");
		label_1.setForeground(Color.WHITE);
		label_1.setBounds(88, 217, 15, 36);
		contentPane.add(label_1);
		
		Label stepsTaken = new Label("0000");
		stepsTaken.setForeground(Color.WHITE);
		stepsTaken.setBounds(10, 212, 86, 41);
		contentPane.add(stepsTaken);
		
		Label goal = new Label("0000");
		goal.setForeground(Color.WHITE);
		goal.setBounds(44, 250, 72, 36);
		contentPane.add(goal);
		
		Label label = new Label("Steps");
		label.setFont(new Font("Dialog", Font.PLAIN, 54));
		label.setForeground(Color.BLUE);
		label.setBounds(10, 39, 140, 53);
		contentPane.add(label);
		
		Label label_2 = new Label("Taken");
		label_2.setFont(new Font("Dialog", Font.PLAIN, 54));
		label_2.setBounds(156, 39, 186, 53);
		contentPane.add(label_2);
		
		Label label_3 = new Label("0");
		label_3.setFont(new Font("Dialog", Font.PLAIN, 90));
		label_3.setBounds(44, 98, 59, 78);
		contentPane.add(label_3);
		
		Label label_4 = new Label(":");
		label_4.setFont(new Font("Dialog", Font.PLAIN, 90));
		label_4.setBounds(98, 80, 24, 96);
		contentPane.add(label_4);
		
		Label label_5 = new Label("00");
		label_5.setFont(new Font("Dialog", Font.PLAIN, 90));
		label_5.setBounds(122, 98, 103, 78);
		contentPane.add(label_5);
		
		Label label_6 = new Label("AM/PM");
		label_6.setBounds(231, 116, 114, 45);
		contentPane.add(label_6);
		
		Button button = new Button("Take Step");
		button.setBounds(10, 335, 383, 45);
		contentPane.add(button);
	}
}
