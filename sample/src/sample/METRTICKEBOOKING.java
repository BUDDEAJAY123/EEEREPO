package sample;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.Font;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class METRTICKEBOOKING {

	private JFrame frame;
	private JTextField tb1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					METRTICKEBOOKING window = new METRTICKEBOOKING();
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
	public METRTICKEBOOKING() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 670, 330);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("NAME");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBounds(58, 88, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("SOURCE");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(58, 124, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("DESTINATION");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setBounds(58, 155, 75, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("NUMBER TICKES");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_3.setBounds(58, 185, 105, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		tb1 = new JTextField();
		tb1.setBounds(173, 85, 86, 20);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("METRO TICKET BOOKING");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_4.setBounds(74, 30, 324, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JComboBox cb1 = new JComboBox();
		cb1.setToolTipText("PLEASE SELECT SOURCE STATION");
		cb1.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "KPHB", "DILSHUKHNAGAR", "LB NAGAR", "HABSIGUDA", "UPPAL", "NAGOLE", "SECUNDRABAD EAST", "SECUNDRABAD WEST", "BALNAGAR"}));
		cb1.setBounds(173, 120, 86, 22);
		frame.getContentPane().add(cb1);
		
		JComboBox cb2 = new JComboBox();
		cb2.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "KPHB", "DILSHUKHNAGAR", "LB NAGAR", "HABSIGUDA", "UPPAL", "NAGOLE", "SECUNDRABAD EAST", "SECUNDRABAD WEST", "BALNAGAR"}));
		cb2.setBounds(173, 151, 86, 22);
		frame.getContentPane().add(cb2);
		
		JComboBox cb3 = new JComboBox();
		cb3.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		cb3.setBounds(173, 185, 86, 22);
		frame.getContentPane().add(cb3);
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name=tb1.getText();
				String source=(String) cb1.getSelectedItem();
			    String destination=(String) cb2.getSelectedItem();
			    String tickets=(String) cb3.getSelectedItem();
			    int nt=Integer.parseInt(tickets);
			    int bill=0;
			    if(source.equals(destination)) {
			    	JOptionPane.showMessageDialog(btnNewButton, "please check stationas");
			    }
			    else     
			    {
		 bill+= nt*45;
			
			JOptionPane.showMessageDialog(btnNewButton,"NAME ;"+name+"\n SOURCE :"+source+"\n DESTINATION :"+destination+"\n NUMBER TICKETS :"+tickets+"n AMOUNT :"+bill);
			    }
			}
		}
		);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setBounds(170, 239, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\admim\\Desktop\\metro.jpg"));
		lblNewLabel_5.setBounds(0, 0, 654, 291);
		frame.getContentPane().add(lblNewLabel_5);
	}
		}
