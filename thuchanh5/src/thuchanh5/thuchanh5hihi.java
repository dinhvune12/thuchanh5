package thuchanh5;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;



import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class thuchanh5hihi {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					thuchanh5hihi window = new thuchanh5hihi();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public thuchanh5hihi() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1062, 637);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("chucnang1");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				chucnang1 x = new chucnang1();
		        x.setVisible(true); 
			}
		});
		btnNewButton.setBounds(107, 465, 85, 21);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("chuc nang 2");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 chucnang2 x = new chucnang2();
			        x.setVisible(true); 
			}
		});
		btnNewButton_1.setBounds(280, 465, 114, 21);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("chuc nang 3");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 chucnang3 x = new chucnang3();
			        x.setVisible(true); 
			}
		});
		btnNewButton_2.setBounds(428, 465, 120, 21);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("chuc nang 4");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				chucnang4 x = new chucnang4();
		        x.setVisible(true); 
			}
		});
		btnNewButton_3.setBounds(592, 465, 114, 21);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("chuc nang 5");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 chucnang5 x = new chucnang5();
			        x.setVisible(true); 
			}
		});
		btnNewButton_4.setBounds(107, 524, 114, 21);
		frame.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("chuc nang 6");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				chucnang6 x = new chucnang6();
		        x.setVisible(true); 
			}
		});
		btnNewButton_5.setBounds(280, 524, 114, 21);
		frame.getContentPane().add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("chuc nang 7");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				chucnang7 x = new chucnang7();
		        x.setVisible(true); 
			}
		});
		btnNewButton_6.setBounds(428, 524, 120, 21);
		frame.getContentPane().add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("chuc nang 8");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				chucnang8 x = new chucnang8();
		        x.setVisible(true); 
			}
		});
		btnNewButton_7.setBounds(592, 524, 114, 21);
		frame.getContentPane().add(btnNewButton_7);
		
		JLabel lblNewLabel = new JLabel("cac chuc nang cua frorm");
		lblNewLabel.setBounds(240, 113, 260, 13);
		frame.getContentPane().add(lblNewLabel);
	}
}
