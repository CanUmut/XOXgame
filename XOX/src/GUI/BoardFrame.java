package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JLayeredPane;
import javax.swing.JSeparator;
import javax.swing.border.LineBorder;

import SysAndMain.XOXSys;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BoardFrame extends JFrame {

	private JPanel contentPane;

	EndFrame ef = new EndFrame(this);
	


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BoardFrame frame = new BoardFrame();
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
	public BoardFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 984, 683);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitle = new JLabel("XOX");
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblTitle.setBounds(398, 11, 132, 84);
		contentPane.add(lblTitle);
		
		JPanel panel = new JPanel();
		panel.setBounds(219, 141, 507, 455);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 0, 0));
		panel_1.setBounds(160, 0, 10, 455);
		panel.add(panel_1);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBackground(Color.BLACK);
		panel_1_1.setBounds(333, 0, 10, 455);
		panel.add(panel_1_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(0, 0, 0));
		panel_2.setBounds(0, 148, 507, 10);
		panel.add(panel_2);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setBackground(Color.BLACK);
		panel_2_1.setBounds(0, 297, 507, 10);
		panel.add(panel_2_1);
		
		JLabel lblPlayer = new JLabel("Player ");
		lblPlayer.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblPlayer.setBounds(418, 95, 105, 27);
		contentPane.add(lblPlayer);
		
		lblPlayer.setText("Player: " + XOXSys.getTurn());
		
		JButton btn00 = new JButton("");
		btn00.setFont(new Font("Tahoma", Font.PLAIN, 40));
		btn00.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				XOXSys.mark(XOXSys.getTurn(), 0, 0);
				if(XOXSys.getTurn() == "x") {
					XOXSys.setTurn("o");
				}else {
					XOXSys.setTurn("x");
				}
				lblPlayer.setText("Player: " + XOXSys.getTurn());
				
				String[][] array = XOXSys.getArr();
				btn00.setText(array[0][0]);
				
				btn00.setEnabled(false);
				
				boolean check = XOXSys.finish();
				if(check) {
					if(XOXSys.getTurn() == "x") {
						ef.lblWon.setText("Player O Wins");
					}else {
						ef.lblWon.setText("Player X Wins");
					}
					if(XOXSys.getDraw() == 1) {
						ef.lblWon.setText("Draw!");
						
					}
					
					ef.setVisible(true);
					dispose();
				}
				
				
			}
		});
		btn00.setBounds(27, 333, 104, 98);
		panel.add(btn00);
		
		JButton btn10 = new JButton("");
		btn10.setFont(new Font("Tahoma", Font.PLAIN, 40));
		btn10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				XOXSys.mark(XOXSys.getTurn(), 1, 0);
				if(XOXSys.getTurn() == "x") {
					XOXSys.setTurn("o");
				}else {
					XOXSys.setTurn("x");
				}
				lblPlayer.setText("Player: " + XOXSys.getTurn());
				
				String[][] array = XOXSys.getArr();
				btn10.setText(array[1][0]);
				
				btn10.setEnabled(false);
				
				boolean check = XOXSys.finish();
				if(check) {
					if(XOXSys.getTurn() == "x") {
						ef.lblWon.setText("Player O Wins");
					}else {
						ef.lblWon.setText("Player X Wins");
					}
					if(XOXSys.getDraw() == 1) {
						ef.lblWon.setText("Draw!");
						
					}
					
					ef.setVisible(true);
					dispose();
				}
			}
		});
		btn10.setBounds(201, 333, 104, 98);
		panel.add(btn10);
		
		JButton btn20 = new JButton("");
		btn20.setFont(new Font("Tahoma", Font.PLAIN, 40));
		btn20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				XOXSys.mark(XOXSys.getTurn(), 2, 0);
				if(XOXSys.getTurn() == "x") {
					XOXSys.setTurn("o");
				}else {
					XOXSys.setTurn("x");
				}
				lblPlayer.setText("Player: " + XOXSys.getTurn());
				
				String[][] array = XOXSys.getArr();
				btn20.setText(array[2][0]);
				
				btn20.setEnabled(false);
				
				boolean check = XOXSys.finish();
				if(check) {
					if(XOXSys.getTurn() == "x") {
						ef.lblWon.setText("Player O Wins");
					}else {
						ef.lblWon.setText("Player X Wins");
					}
					if(XOXSys.getDraw() == 1) {
						ef.lblWon.setText("Draw!");
						
					}
					
					ef.setVisible(true);
					dispose();
				}
			}
		});
		btn20.setBounds(371, 333, 104, 98);
		panel.add(btn20);
		
		JButton btn21 = new JButton("");
		btn21.setFont(new Font("Tahoma", Font.PLAIN, 40));
		btn21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				XOXSys.mark(XOXSys.getTurn(), 2, 1);
				if(XOXSys.getTurn() == "x") {
					XOXSys.setTurn("o");
				}else {
					XOXSys.setTurn("x");
				}
				lblPlayer.setText("Player: " + XOXSys.getTurn());
				
				String[][] array = XOXSys.getArr();
				btn21.setText(array[2][1]);
				
				btn21.setEnabled(false);
				
				boolean check = XOXSys.finish();
				if(check) {
					if(XOXSys.getTurn() == "x") {
						ef.lblWon.setText("Player O Wins");
					}else {
						ef.lblWon.setText("Player X Wins");
					}
					if(XOXSys.getDraw() == 1) {
						ef.lblWon.setText("Draw!");
						
					}
					
					ef.setVisible(true);
					dispose();
				}
			}
		});
		btn21.setBounds(371, 179, 104, 98);
		panel.add(btn21);
		
		JButton btn11 = new JButton("");
		btn11.setFont(new Font("Tahoma", Font.PLAIN, 40));
		btn11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				XOXSys.mark(XOXSys.getTurn(), 1, 1);
				if(XOXSys.getTurn() == "x") {
					XOXSys.setTurn("o");
				}else {
					XOXSys.setTurn("x");
				}
				lblPlayer.setText("Player: " + XOXSys.getTurn());
				
				String[][] array = XOXSys.getArr();
				btn11.setText(array[1][1]);
				
				btn11.setEnabled(false);
				
				boolean check = XOXSys.finish();
				if(check) {
					if(XOXSys.getTurn() == "x") {
						ef.lblWon.setText("Player O Wins");
					}else {
						ef.lblWon.setText("Player X Wins");
					}
					if(XOXSys.getDraw() == 1) {
						ef.lblWon.setText("Draw!");
						
					}
					
					ef.setVisible(true);
					dispose();
				}
			}
		});
		btn11.setBounds(201, 179, 104, 98);
		panel.add(btn11);
		
		JButton btn02 = new JButton("");
		btn02.setFont(new Font("Tahoma", Font.PLAIN, 40));
		btn02.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				XOXSys.mark(XOXSys.getTurn(), 0, 2);
				if(XOXSys.getTurn() == "x") {
					XOXSys.setTurn("o");
				}else {
					XOXSys.setTurn("x");
				}
				lblPlayer.setText("Player: " + XOXSys.getTurn());
				
				String[][] array = XOXSys.getArr();
				btn02.setText(array[0][2]);
				
				btn02.setEnabled(false);
				
				boolean check = XOXSys.finish();
				if(check) {
					if(XOXSys.getTurn() == "x") {
						ef.lblWon.setText("Player O Wins");
					}else {
						ef.lblWon.setText("Player X Wins");
					}
					if(XOXSys.getDraw() == 1) {
						ef.lblWon.setText("Draw!");
						
					}
					
					ef.setVisible(true);
					dispose();
				}
			}
		});
		btn02.setBounds(27, 26, 104, 98);
		panel.add(btn02);
		
		JButton btn12 = new JButton("");
		btn12.setFont(new Font("Tahoma", Font.PLAIN, 40));
		btn12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				XOXSys.mark(XOXSys.getTurn(), 1, 2);
				if(XOXSys.getTurn() == "x") {
					XOXSys.setTurn("o");
				}else {
					XOXSys.setTurn("x");
				}
				lblPlayer.setText("Player: " + XOXSys.getTurn());
				
				String[][] array = XOXSys.getArr();
				btn12.setText(array[1][2]);
				
				btn12.setEnabled(false);
				
				boolean check = XOXSys.finish();
				if(check) {
					if(XOXSys.getTurn() == "x") {
						ef.lblWon.setText("Player O Wins");
					}else {
						ef.lblWon.setText("Player X Wins");
					}
					if(XOXSys.getDraw() == 1) {
						ef.lblWon.setText("Draw!");
						
					}
					
					ef.setVisible(true);
					dispose();
				}
			}
		});
		btn12.setBounds(201, 26, 104, 98);
		panel.add(btn12);
		
		JButton btn22 = new JButton("");
		btn22.setFont(new Font("Tahoma", Font.PLAIN, 40));
		btn22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				XOXSys.mark(XOXSys.getTurn(), 2, 2);
				if(XOXSys.getTurn() == "x") {
					XOXSys.setTurn("o");
				}else {
					XOXSys.setTurn("x");
				}
				lblPlayer.setText("Player: " + XOXSys.getTurn());
				
				String[][] array = XOXSys.getArr();
				btn22.setText(array[2][2]);
				
				btn22.setEnabled(false);
				
				boolean check = XOXSys.finish();
				if(check) {
					if(XOXSys.getTurn() == "x") {
						ef.lblWon.setText("Player O Wins");
					}else {
						ef.lblWon.setText("Player X Wins");
					}
					if(XOXSys.getDraw() == 1) {
						ef.lblWon.setText("Draw!");
						
					}
					
					ef.setVisible(true);
					dispose();
				}
			}
		});
		btn22.setBounds(371, 26, 104, 98);
		panel.add(btn22);
		
		JButton btn01 = new JButton("");
		btn01.setFont(new Font("Tahoma", Font.PLAIN, 40));
		btn01.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				XOXSys.mark(XOXSys.getTurn(), 0, 1);
				if(XOXSys.getTurn() == "x") {
					XOXSys.setTurn("o");
				}else {
					XOXSys.setTurn("x");
				}
				lblPlayer.setText("Player: " + XOXSys.getTurn());
				
				String[][] array = XOXSys.getArr();
				btn01.setText(array[0][1]);
				
				btn01.setEnabled(false);
				
				boolean check = XOXSys.finish();
				if(check) {
					if(XOXSys.getTurn() == "x") {
						ef.lblWon.setText("Player O Wins");
					}else {
						ef.lblWon.setText("Player X Wins");
					}
					if(XOXSys.getDraw() == 1) {
						ef.lblWon.setText("Draw!");
						
					}
					
					ef.setVisible(true);
					dispose();
				}
			}
		});
		btn01.setBounds(27, 179, 104, 98);
		panel.add(btn01);
		
		
		
		JButton btnNewButton = new JButton("Reset");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String[][] arr = new String[3][3];
				
				XOXSys.setArr(arr);
				XOXSys.setTurn("x");
				XOXSys.setDraw(0);
				lblPlayer.setText("Player: " + XOXSys.getTurn());
				
				btn00.setText("");
				btn00.setEnabled(true);
				btn01.setText("");
				btn01.setEnabled(true);
				btn02.setText("");
				btn02.setEnabled(true);
				btn10.setText("");
				btn10.setEnabled(true);
				btn11.setText("");
				btn11.setEnabled(true);
				btn12.setText("");
				btn12.setEnabled(true);
				btn20.setText("");
				btn20.setEnabled(true);
				btn21.setText("");
				btn21.setEnabled(true);
				btn22.setText("");
				btn22.setEnabled(true);
				
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.setBounds(621, 54, 105, 41);
		contentPane.add(btnNewButton);
		
		
		
		
		
		
	}
}
