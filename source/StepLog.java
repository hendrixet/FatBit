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


public class StepLog extends Log{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	int stepsToday;
	int[] StepsThisMonth;
	int dailyStepGoal;
	static Label minute = new Label("00");
	static Label hour = new Label("0");
	static Label ampm = new Label("AM/PM");
	
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
		
		Label dash = new Label("/");
		dash.setForeground(Color.WHITE);
		dash.setBounds(88, 217, 15, 36);
		contentPane.add(dash);
		hour.setAlignment(Label.RIGHT);
		
		hour.setFont(new Font("Dialog", Font.PLAIN, 90));
		hour.setBounds(10, 98, 97, 78);
		contentPane.add(hour);
		
		Label Steps = new Label("Steps");
		Steps.setFont(new Font("Dialog", Font.PLAIN, 54));
		Steps.setForeground(Color.BLUE);
		Steps.setBounds(10, 39, 140, 53);
		contentPane.add(Steps);
		
		Label label_4 = new Label(":");
		label_4.setFont(new Font("Dialog", Font.PLAIN, 90));
		label_4.setBounds(98, 80, 24, 96);
		contentPane.add(label_4);
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setBounds(122, 233, 271, 36);
		contentPane.add(progressBar);
		
		Button switchScreenButton = new Button("");
		switchScreenButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				HeartRateLog.hour.setText(Integer.toString(Log.Hour));
				if(Log.Minute>9) {
					HeartRateLog.minute.setText(Integer.toString(Log.Minute));
					}
				else {
					HeartRateLog.minute.setText("0"+Integer.toString(Log.Minute));
				}
				HeartRateLog.ampm.setText(Log.AMPM);
				UILayer.switchToHeartScreen();
			}
		});
		switchScreenButton.setBackground(Color.BLUE);
		switchScreenButton.setBounds(351, 39, 42, 137);
		contentPane.add(switchScreenButton);
		
		Label stepsTaken = new Label("0000");
		stepsTaken.setAlignment(Label.RIGHT);
		stepsTaken.setFont(new Font("Dialog", Font.PLAIN, 29));
		stepsTaken.setForeground(Color.WHITE);
		stepsTaken.setBounds(10, 217, 72, 36);
		contentPane.add(stepsTaken);
		
		Label goal = new Label(Integer.toString(dailyStepGoal));
		goal.setFont(new Font("Dialog", Font.PLAIN, 29));
		goal.setForeground(Color.WHITE);
		goal.setBounds(44, 247, 72, 36);
		contentPane.add(goal);
		
		Label Taken = new Label("Taken");
		Taken.setFont(new Font("Dialog", Font.PLAIN, 54));
		Taken.setBounds(156, 39, 186, 53);
		contentPane.add(Taken);
		
		minute.setFont(new Font("Dialog", Font.PLAIN, 90));
		minute.setBounds(122, 98, 103, 78);
		contentPane.add(minute);
		ampm.setFont(new Font("Eras Medium ITC", Font.PLAIN, 32));
		
		ampm.setBounds(231, 116, 114, 45);
		contentPane.add(ampm);
		
		Button TakeStep = new Button("Take Step");
		TakeStep.addMouseListener(new MouseAdapter() {
			//represents step taken
			@Override
			public void mousePressed(MouseEvent e) {
				stepsToday+=StepCounter.getData();
				stepsTaken.setText(Integer.toString(stepsToday));
				progressBar.setValue((int)(Float.parseFloat(stepsTaken.getText())/Float.parseFloat(goal.getText())*100));
			}
		});
		TakeStep.setBounds(10, 335, 383, 45);
		contentPane.add(TakeStep);
		
	}
}
