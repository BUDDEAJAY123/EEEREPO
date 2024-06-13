package sample;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class movie {

	private static final int YES_OPTION = 0;
	private JFrame frame;
	private JTextField tb1;
	private Component btNewbutton;
	private Component btNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					movie window = new movie();
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
	public movie() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 700, 348);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(264, 34, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(80, 102, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Movie");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setBounds(80, 153, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Number Tickets");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_3.setBounds(65, 196, 95, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JComboBox cb1 = new JComboBox();
		cb1.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "salaar", "kalki", "sahoo", "radheyshyamm", "bahubali", "bahubali 2"}));
		cb1.setBounds(186, 139, 86, 22);
		frame.getContentPane().add(cb1);
		
		JComboBox cb2 = new JComboBox();
		cb2.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		cb2.setBounds(186, 192, 88, 22);
		frame.getContentPane().add(cb2);
		
		tb1 = new JTextField();
		tb1.setBounds(186, 96, 86, 20);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("movie  TIckets booking");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_4.setBounds(132, 34, 242, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name=tb1.getText();
				String movie=(String) cb1.getSelectedItem();
				String tickets=(String) cb2.getSelectedItem();
				int nt=Integer.parseInt(tickets);
				int bill=0;
				if(movie.equals("KGF"))
				{
					bill=bill+nt*150;
				}
				if(movie.equals("salaar"))
				{
					bill=bill+nt*250;
				}
				if(movie.equals("kalki"))
				{
					bill=bill+nt*220;
				}
				int res=0;
				res=JOptionPane.showConfirmDialog(btnNewButton, "NAME :"+name+"\n MOvie :"+movie+"\n TICKETS :"+tickets+"\n AMOUNT:"+bill);
				if(res==YES_OPTION)
				{
					JOptionPane.showMessageDialog(btNewButton, "TICKETS CONFIRMED");
				}
				else
				{
					JOptionPane.showMessageDialog(btNewbutton  , "BOOKING CANCLLED");
				}
			}
		});
		btnNewButton.setBounds(183, 251, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\admim\\Downloads\\5129-183300007_tiny.jpg"));
		lblNewLabel_5.setBounds(0, 0, 684, 309);
		frame.getContentPane().add(lblNewLabel_5);

	}
}
