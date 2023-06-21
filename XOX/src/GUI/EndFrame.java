package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import SysAndMain.XOXSys;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EndFrame extends JFrame {

	private JPanel contentPane;
	BoardFrame fr = null;
	JLabel lblWon;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public EndFrame(JFrame fr) {
		setTitle("END");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 704, 487);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblWon = new JLabel("");
		lblWon.setHorizontalAlignment(SwingConstants.CENTER);
		lblWon.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblWon.setBounds(152, 80, 371, 101);
		contentPane.add(lblWon);
		
		
		
		JButton btnReplay = new JButton("<- Go Back");
		btnReplay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fr.setVisible(true);
				dispose();
			}
		});
		btnReplay.setFont(new Font("Tahoma", Font.PLAIN, 40));
		btnReplay.setBounds(74, 206, 253, 101);
		contentPane.add(btnReplay);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.PLAIN, 40));
		btnExit.setBounds(350, 206, 253, 101);
		contentPane.add(btnExit);
		
		
	}

}
