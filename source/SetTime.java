import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

import com.jgoodies.forms.factories.DefaultComponentFactory;
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
		
		
		
		JLabel lblNewJgoodiesTitle_1 = DefaultComponentFactory.getInstance().createTitle("Please Input time and press \r\nconfirm");
		lblNewJgoodiesTitle_1.setFont(new Font("Eras Medium ITC", Font.PLAIN, 18));
		lblNewJgoodiesTitle_1.setForeground(Color.WHITE);
		lblNewJgoodiesTitle_1.setBounds(60, 68, 294, 30);
		contentPane.add(lblNewJgoodiesTitle_1);
		
		JSpinner sethour = new JSpinner();
		sethour.setModel(new SpinnerNumberModel(1, 1, 12, 1));
		sethour.setBounds(83, 190, 68, 46);
		contentPane.add(sethour);
		
		JSpinner set_min1 = new JSpinner();
		set_min1.setModel(new SpinnerNumberModel(0, 0, 5, 1));
		set_min1.setBounds(164, 190, 40, 46);
		contentPane.add(set_min1);
		
		JSpinner set_min2 = new JSpinner();
		set_min2.setModel(new SpinnerNumberModel(0, 0, 9, 1));
		set_min2.setBounds(212, 190, 40, 46);
		contentPane.add(set_min2);
		
		JLabel lblNewJgoodiesLabel = DefaultComponentFactory.getInstance().createLabel(":");
		lblNewJgoodiesLabel.setForeground(Color.WHITE);
		lblNewJgoodiesLabel.setBounds(154, 193, 16, 39);
		contentPane.add(lblNewJgoodiesLabel);
		
		String[] AP= {"AM", "PM"};
		JComboBox<String> AMPM = new JComboBox<String>(AP);
		AMPM.setToolTipText("AM/PM");
		AMPM.setForeground(Color.BLACK);
		AMPM.setMaximumRowCount(2);
		AMPM.setBounds(272, 190, 113, 45);
		contentPane.add(AMPM);
		
		JLabel lblNewJgoodiesTitle = DefaultComponentFactory.getInstance().createTitle("Welcome to FatBit:");
		lblNewJgoodiesTitle.setFont(new Font("Eras Medium ITC", Font.PLAIN, 32));
		lblNewJgoodiesTitle.setForeground(Color.WHITE);
		lblNewJgoodiesTitle.setBounds(67, 33, 265, 37);
		contentPane.add(lblNewJgoodiesTitle);
		confirm.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				Log.setHour((Integer)sethour.getValue());
				String currentMinute =  Integer.toString((Integer)set_min1.getValue()) + Integer.toString((Integer)set_min2.getValue()); 
				Log.setMinute(Integer.parseInt(currentMinute));
				StepLog.hour.setText(Integer.toString(Log.Hour));
				if(Log.Minute>9) {
					StepLog.minute.setText(Integer.toString(Log.Minute));
					}
				else {
					StepLog.minute.setText("0"+Integer.toString(Log.Minute));
				}
				UILayer.switchToStepScreen();
			}
		});
		confirm.setBounds(67, 340, 266, 40);
		contentPane.add(confirm);
	}
}
