package ttt;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;

public class tictactoe {

	private JFrame frame;
	private JTextField Xsc;
	private JTextField Osc;
	private int xc1=0;
	private int oc1=0;
	private String startGame="X";
	private int bc1=10;
	private int bc2=10;
	private int bc3=10;
	private int bc4=10;
	private int bc5=10;
	private int bc6=10;
	private int bc7=10;
	private int bc8=10;
	private int bc9=10;
	private int i=0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tictactoe window = new tictactoe();
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
	public tictactoe() {
		initialize();
	}
	
	private void winningGame()
	//Player X
	{
		if(bc1==1 && bc2==1 && bc3==1)
		{
			JOptionPane.showMessageDialog(frame, "Player X Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
			xc1++;
			Xsc.setText(String.valueOf(xc1));
		}
		else if(bc1==1 && bc4==1 && bc7==1)
		{
			JOptionPane.showMessageDialog(frame, "Player X Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
			xc1++;
			Xsc.setText(String.valueOf(xc1));
		}
		else if(bc1==1 && bc5==1 && bc9==1)
		{
			JOptionPane.showMessageDialog(frame, "Player X Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
			xc1++;
			Xsc.setText(String.valueOf(xc1));
		}
		else if(bc2==1 && bc5==1 && bc8==1)
		{
			JOptionPane.showMessageDialog(frame, "Player X Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
			xc1++;
			Xsc.setText(String.valueOf(xc1));
		}
		else if(bc3==1 && bc6==1 && bc9==1)
		{
			JOptionPane.showMessageDialog(frame, "Player X Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
			xc1++;
			Xsc.setText(String.valueOf(xc1));
		}
		else if(bc3==1 && bc5==1 && bc7==1)
		{
			JOptionPane.showMessageDialog(frame, "Player X Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
			xc1++;
			Xsc.setText(String.valueOf(xc1));
		}
		else if(bc4==1 && bc5==1 && bc6==1)
		{
			JOptionPane.showMessageDialog(frame, "Player X Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
			xc1++;
			Xsc.setText(String.valueOf(xc1));
		}
		else if(bc7==1 && bc8==1 && bc9==1)
		{
			JOptionPane.showMessageDialog(frame, "Player X Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
			xc1++;
			Xsc.setText(String.valueOf(xc1));
		}
		else if(i==9)
		{
			JOptionPane.showMessageDialog(frame, "No One Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
		}
		//Player O
		else if(bc1==0 && bc2==0 && bc3==0)
		{
			JOptionPane.showMessageDialog(frame, "Player O Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
			oc1++;
			Osc.setText(String.valueOf(oc1));
		}
		else if(bc1==0 && bc4==0 && bc7==0)
		{
			JOptionPane.showMessageDialog(frame, "Player O Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
			oc1++;
			Osc.setText(String.valueOf(oc1));
		}
		else if(bc1==0 && bc5==0 && bc9==0)
		{
			JOptionPane.showMessageDialog(frame, "Player O Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
			oc1++;
			Osc.setText(String.valueOf(oc1));
		}
		else if(bc2==0 && bc5==0 && bc8==0)
		{
			JOptionPane.showMessageDialog(frame, "Player O Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
			oc1++;
			Osc.setText(String.valueOf(oc1));
		}
		else if(bc3==0 && bc6==0 && bc9==0)
		{
			JOptionPane.showMessageDialog(frame, "Player O Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
			oc1++;
			Osc.setText(String.valueOf(oc1));
		}
		else if(bc3==0 && bc5==0 && bc7==0)
		{
			JOptionPane.showMessageDialog(frame, "Player O Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
			oc1++;
			Osc.setText(String.valueOf(oc1));
		}
		else if(bc4==0 && bc5==0 && bc6==0)
		{
			JOptionPane.showMessageDialog(frame, "Player O Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
			oc1++;
			Osc.setText(String.valueOf(oc1));
		}
		else if(bc7==0 && bc8==0 && bc9==0)
		{
			JOptionPane.showMessageDialog(frame, "Player O Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
			oc1++;
			Osc.setText(String.valueOf(oc1));
		}
		else if(i==9)
		{
			JOptionPane.showMessageDialog(frame, "No One Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
		}
		
	}

	private void choosePlayer()
	{
		if(startGame.equalsIgnoreCase("X"))
		{
			startGame="O";
		}
		else
		{
			startGame="X";
		}
	}
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 689, 375);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new GridLayout(3, 5, 2, 2));
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		frame.getContentPane().add(panel);
		panel.setLayout(new BorderLayout(0, 0));
		
		JButton b1 = new JButton("");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				b1.setText(startGame);
				if(startGame.equalsIgnoreCase("X"))
				{
					b1.setForeground(Color.GREEN);
					bc1=1;
					i++;
				}
				else
				{
					b1.setForeground(Color.BLUE);
					bc1=0;
					i++;
				}
				choosePlayer();
				winningGame();
			}
		});
		b1.setBackground(Color.ORANGE);
		b1.setFont(new Font("Tahoma", Font.BOLD, 45));
		panel.add(b1, BorderLayout.CENTER);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JButton b2 = new JButton("");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				b2.setText(startGame);
				if(startGame.equalsIgnoreCase("X"))
				{
					b2.setForeground(Color.GREEN);
					bc2=1;
					i++;
				}
				else
				{
					b2.setForeground(Color.BLUE);
					bc2=0;
					i++;
				}
				choosePlayer();
				winningGame();
			}
		});
		b2.setBackground(Color.ORANGE);
		b2.setFont(new Font("Tahoma", Font.BOLD, 45));
		panel_1.add(b2, BorderLayout.CENTER);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		JButton b3 = new JButton("");
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				b3.setText(startGame);
				if(startGame.equalsIgnoreCase("X"))
				{
					b3.setForeground(Color.GREEN);
					bc3=1;
					i++;
				}
				else
				{
					b3.setForeground(Color.BLUE);
					bc3=0;
					i++;
				}
				choosePlayer();
				winningGame();
			}
		});
		b3.setBackground(Color.ORANGE);
		b3.setFont(new Font("Tahoma", Font.BOLD, 45));
		panel_2.add(b3, BorderLayout.CENTER);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("Player X:");
		lblNewLabel.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setBackground(Color.BLUE);
		panel_3.add(lblNewLabel, BorderLayout.CENTER);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		frame.getContentPane().add(panel_4);
		panel_4.setLayout(new BorderLayout(0, 0));
		
		Xsc = new JTextField();
		Xsc.setFont(new Font("Tahoma", Font.BOLD, 38));
		Xsc.setBackground(Color.RED);
		Xsc.setText("0");
		Xsc.setHorizontalAlignment(SwingConstants.CENTER);
		panel_4.add(Xsc, BorderLayout.CENTER);
		Xsc.setColumns(10);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		frame.getContentPane().add(panel_5);
		panel_5.setLayout(new BorderLayout(0, 0));
		
		JButton b4 = new JButton("");
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				b4.setText(startGame);
				if(startGame.equalsIgnoreCase("X"))
				{
					b4.setForeground(Color.GREEN);
					bc4=1;
					i++;
				}
				else
				{
					b4.setForeground(Color.BLUE);
					bc4=0;
					i++;
				}
				choosePlayer();
				winningGame();
			}
		});
		b4.setBackground(Color.ORANGE);
		b4.setFont(new Font("Tahoma", Font.BOLD, 45));
		panel_5.add(b4, BorderLayout.CENTER);
		
		JPanel panel_10 = new JPanel();
		panel_10.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		frame.getContentPane().add(panel_10);
		panel_10.setLayout(new BorderLayout(0, 0));
		
		JButton b5 = new JButton("");
		b5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				b5.setText(startGame);
				if(startGame.equalsIgnoreCase("X"))
				{
					b5.setForeground(Color.GREEN);
					bc5=1;
					i++;
				}
				else
				{
					b5.setForeground(Color.BLUE);
					bc5=0;
					i++;
				}
				choosePlayer();
				winningGame();
			}
		});
		b5.setBackground(Color.ORANGE);
		b5.setFont(new Font("Tahoma", Font.BOLD, 45));
		panel_10.add(b5, BorderLayout.CENTER);
		
		JPanel panel_11 = new JPanel();
		panel_11.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		frame.getContentPane().add(panel_11);
		panel_11.setLayout(new BorderLayout(0, 0));
		
		JButton b6 = new JButton("");
		b6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				b6.setText(startGame);
				if(startGame.equalsIgnoreCase("X"))
				{
					b6.setForeground(Color.GREEN);
					bc6=1;
					i++;
				}
				else
				{
					b6.setForeground(Color.BLUE);
					bc6=0;
					i++;
				}
				choosePlayer();
				winningGame();
			}
		});
		b6.setBackground(Color.ORANGE);
		b6.setFont(new Font("Tahoma", Font.BOLD, 45));
		panel_11.add(b6, BorderLayout.CENTER);
		
		JPanel panel_12 = new JPanel();
		panel_12.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		frame.getContentPane().add(panel_12);
		panel_12.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_1 = new JLabel("Player O:");
		lblNewLabel_1.setBackground(Color.BLUE);
		lblNewLabel_1.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		panel_12.add(lblNewLabel_1, BorderLayout.CENTER);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		frame.getContentPane().add(panel_6);
		panel_6.setLayout(new BorderLayout(0, 0));
		
		Osc = new JTextField();
		Osc.setFont(new Font("Tahoma", Font.BOLD, 38));
		Osc.setBackground(Color.RED);
		Osc.setText("0");
		Osc.setHorizontalAlignment(SwingConstants.CENTER);
		panel_6.add(Osc, BorderLayout.CENTER);
		Osc.setColumns(10);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		frame.getContentPane().add(panel_7);
		panel_7.setLayout(new BorderLayout(0, 0));
		
		JButton b7 = new JButton("");
		b7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				b7.setText(startGame);
				if(startGame.equalsIgnoreCase("X"))
				{
					b7.setForeground(Color.GREEN);
					bc7=1;
					i++;
				}
				else
				{
					b7.setForeground(Color.BLUE);
					bc7=0;
					i++;
				}
				choosePlayer();
				winningGame();
			}
		});
		b7.setBackground(Color.ORANGE);
		b7.setFont(new Font("Tahoma", Font.BOLD, 45));
		panel_7.add(b7, BorderLayout.CENTER);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		frame.getContentPane().add(panel_8);
		panel_8.setLayout(new BorderLayout(0, 0));
		
		JButton b8 = new JButton("");
		b8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				b8.setText(startGame);
				if(startGame.equalsIgnoreCase("X"))
				{
					b8.setForeground(Color.GREEN);
					bc8=1;
					i++;
				}
				else
				{
					b8.setForeground(Color.BLUE);
					bc8=0;
					i++;
				}
				choosePlayer();
				winningGame();
			}
		});
		b8.setBackground(Color.ORANGE);
		b8.setFont(new Font("Tahoma", Font.BOLD, 45));
		panel_8.add(b8, BorderLayout.CENTER);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		frame.getContentPane().add(panel_9);
		panel_9.setLayout(new BorderLayout(0, 0));
		
		JButton b9 = new JButton("");
		b9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				b9.setText(startGame);
				if(startGame.equalsIgnoreCase("X"))
				{
					b9.setForeground(Color.GREEN);
					bc9=1;
					i++;
				}
				else
				{
					b9.setForeground(Color.BLUE);
					bc9=0;
					i++;
				}
				choosePlayer();
				winningGame();
			}
		});
		b9.setBackground(Color.ORANGE);
		b9.setFont(new Font("Tahoma", Font.BOLD, 45));
		panel_9.add(b9, BorderLayout.CENTER);
		
		JPanel panel_13 = new JPanel();
		panel_13.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		frame.getContentPane().add(panel_13);
		panel_13.setLayout(new BorderLayout(0, 0));
		
		JButton re = new JButton("Reset:");
		re.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				b1.setText(null);
				b2.setText(null);
				b3.setText(null);
				b4.setText(null);
				b5.setText(null);
				b6.setText(null);
				b7.setText(null);
				b8.setText(null);
				b9.setText(null);
				bc1=10;
				bc2=10;
				bc3=10;
				bc4=10;
				bc5=10;
				bc6=10;
				bc7=10;
				bc8=10;
				bc9=10;
				i=0;
				
			}
		});
		re.setBackground(Color.BLUE);
		re.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		re.setForeground(Color.BLACK);
		panel_13.add(re, BorderLayout.CENTER);
		
		JPanel panel_14 = new JPanel();
		panel_14.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		frame.getContentPane().add(panel_14);
		panel_14.setLayout(new BorderLayout(0, 0));
		
		JButton ex = new JButton("Exit:");
		ex.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame = new JFrame("EXIT");
				if(JOptionPane.showConfirmDialog(frame, "Confirm If You Want To Exit","Tic Tac Toe",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION)
				{
					System.exit(0);
				}
					
			}
		});
		ex.setBackground(Color.BLUE);
		ex.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		panel_14.add(ex, BorderLayout.CENTER);
	}
}
