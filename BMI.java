import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class BMI extends JFrame {

	private JPanel contentPane;
	private JTextField name;
	private JTextField age;
	private JTextField high;
	private JTextField weigh;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BMI frame = new BMI();
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
	public BMI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		name = new JTextField();
		name.setBounds(101, 36, 96, 21);
		contentPane.add(name);
		name.setColumns(10);
		
		age = new JTextField();
		age.setBounds(101, 67, 96, 21);
		contentPane.add(age);
		age.setColumns(10);
		
		high = new JTextField();
		high.setBounds(101, 98, 96, 21);
		contentPane.add(high);
		high.setColumns(10);
		
		weigh = new JTextField();
		weigh.setBounds(101, 130, 96, 21);
		contentPane.add(weigh);
		weigh.setColumns(10);
		
		JLabel lblName = new JLabel("NAME");
		lblName.setBounds(34, 39, 46, 15);
		contentPane.add(lblName);
		
		JLabel lblAge = new JLabel("AGE");
		lblAge.setBounds(34, 70, 46, 15);
		contentPane.add(lblAge);
		
		JLabel lblHigh = new JLabel("HIGH");
		lblHigh.setBounds(34, 101, 46, 15);
		contentPane.add(lblHigh);
		
		JLabel lblWeigh = new JLabel("WEIGH");
		lblWeigh.setBounds(34, 133, 46, 15);
		contentPane.add(lblWeigh);
		
		JButton btnOk = new JButton("OK~~");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		btnOk.setBounds(281, 81, 87, 23);
		contentPane.add(btnOk);
		
		JTextArea BMI = new JTextArea();
		BMI.setBounds(97, 161, 257, 91);
		contentPane.add(BMI);
	}
}
