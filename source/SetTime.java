import java.awt.EventQueue;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class SetTime extends Log{
	private JPanel contentPane;
	private final Button button = new Button("Confirm");

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
		
		JLabel lblNewJgoodiesTitle = DefaultComponentFactory.getInstance().createTitle("Welcome to FatBit:");
		lblNewJgoodiesTitle.setFont(new Font("Eras Medium ITC", Font.PLAIN, 32));
		lblNewJgoodiesTitle.setForeground(Color.WHITE);
		lblNewJgoodiesTitle.setBounds(67, 33, 265, 37);
		contentPane.add(lblNewJgoodiesTitle);
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				Log.stepLogFrame.setVisible(true);
				Log.setTimeFrame.setVisible(false);
			}
		});
		button.setBounds(67, 340, 266, 40);
		contentPane.add(button);
		
		JLabel lblNewJgoodiesTitle_1 = DefaultComponentFactory.getInstance().createTitle("Please Input time and press \r\nconfirm");
		lblNewJgoodiesTitle_1.setFont(new Font("Eras Medium ITC", Font.PLAIN, 18));
		lblNewJgoodiesTitle_1.setForeground(Color.WHITE);
		lblNewJgoodiesTitle_1.setBounds(60, 68, 294, 30);
		contentPane.add(lblNewJgoodiesTitle_1);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(83, 190, 68, 46);
		contentPane.add(spinner);
		
		JSpinner spinner_1 = new JSpinner();
		spinner_1.setBounds(164, 190, 40, 46);
		contentPane.add(spinner_1);
		
		JSpinner spinner_2 = new JSpinner();
		spinner_2.setBounds(212, 190, 40, 46);
		contentPane.add(spinner_2);
		
		JLabel lblNewJgoodiesLabel = DefaultComponentFactory.getInstance().createLabel(":");
		lblNewJgoodiesLabel.setForeground(Color.WHITE);
		lblNewJgoodiesLabel.setBounds(154, 193, 16, 39);
		contentPane.add(lblNewJgoodiesLabel);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setToolTipText("AM/PM");
		comboBox.setForeground(Color.BLACK);
		comboBox.setMaximumRowCount(3);
		comboBox.setBounds(272, 190, 113, 45);
		contentPane.add(comboBox);
	}
}
