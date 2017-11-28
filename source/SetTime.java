import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class SetTime extends Log{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private final Button confirm = new Button("Confirm");
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SetTime frame = new SetTime();
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
	public SetTime() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 439, 493);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JSpinner sethour = new JSpinner();
		sethour.setFont(new Font("Tahoma", Font.PLAIN, 35));
		sethour.setModel(new SpinnerNumberModel(1, 1, 12, 1));
		sethour.setBounds(67, 190, 68, 46);
		contentPane.add(sethour);
		
		JSpinner set_min1 = new JSpinner();
		set_min1.setFont(new Font("Tahoma", Font.PLAIN, 35));
		set_min1.setModel(new SpinnerNumberModel(0, 0, 5, 1));
		set_min1.setBounds(155, 190, 55, 46);
		contentPane.add(set_min1);
		
		JSpinner set_min2 = new JSpinner();
		set_min2.setFont(new Font("Tahoma", Font.PLAIN, 35));
		set_min2.setModel(new SpinnerNumberModel(0, 0, 9, 1));
		set_min2.setBounds(216, 190, 50, 48);
		contentPane.add(set_min2);
		
		String[] AP= {"AM", "PM"};
		JComboBox setAMPM = new JComboBox(AP);
		setAMPM.setToolTipText("AM/PM");
		setAMPM.setForeground(Color.BLACK);
		setAMPM.setMaximumRowCount(2);
		setAMPM.setBounds(278, 192, 94, 45);
		contentPane.add(setAMPM);
		confirm.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				Log.setHour((Integer)sethour.getValue());
				String currentMinute =  Integer.toString((Integer)set_min1.getValue()) + Integer.toString((Integer)set_min2.getValue()); 
				Log.setMinute(Integer.parseInt(currentMinute));
				Log.AMPM = setAMPM.getSelectedItem().toString();
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
		confirm.setBounds(67, 340, 266, 40);
		contentPane.add(confirm);
		
		Label label = new Label("Press Confirm");
		label.setFont(new Font("Eras Medium ITC", Font.PLAIN, 26));
		label.setForeground(Color.WHITE);
		label.setBounds(173, 120, 178, 45);
		contentPane.add(label);
		
		Label label_1 = new Label("Welcome To Fatbit:");
		label_1.setForeground(Color.WHITE);
		label_1.setFont(new Font("Eras Medium ITC", Font.PLAIN, 39));
		label_1.setBounds(10, 10, 383, 45);
		contentPane.add(label_1);
		
		Label label_2 = new Label("Please Input Time and");
		label_2.setForeground(Color.WHITE);
		label_2.setFont(new Font("Eras Medium ITC", Font.PLAIN, 27));
		label_2.setBounds(21, 69, 292, 45);
		contentPane.add(label_2);
	}
}
