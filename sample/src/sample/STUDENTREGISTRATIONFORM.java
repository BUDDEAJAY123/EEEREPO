package sample;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import java.awt.Font;
import java.awt.Color;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class STUDENTREGISTRATIONFORM {

	private JFrame frame;
	private JTextField tb1;
	private JTextField tb2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					STUDENTREGISTRATIONFORM window = new STUDENTREGISTRATIONFORM();
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
	public STUDENTREGISTRATIONFORM() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 0, 0));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("STUDENT REGISTRATION FORM");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(81, 11, 294, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ROLLNO");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(81, 61, 62, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("NAME");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setBounds(81, 107, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		tb1 = new JTextField();
		tb1.setBounds(187, 58, 86, 20);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		tb2 = new JTextField();
		tb2.setBounds(187, 104, 86, 20);
		frame.getContentPane().add(tb2);
		tb2.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("BRANCH");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_3.setBounds(81, 148, 46, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("GENDER");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_4.setBounds(81, 186, 46, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JRadioButton r1 = new JRadioButton("MALE");
		r1.setBounds(164, 182, 109, 23);
		frame.getContentPane().add(r1);
		
		JRadioButton r2 = new JRadioButton("FEMALE");
		r2.setBounds(291, 182, 109, 23);
		frame.getContentPane().add(r2);
		
		JLabel lblNewLabel_5 = new JLabel("PROG LANG");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_5.setBounds(49, 220, 78, 14);
		frame.getContentPane().add(lblNewLabel_5);
		
		JCheckBox c1 = new JCheckBox("C");
		c1.setBounds(159, 216, 78, 23);
		frame.getContentPane().add(c1);
		
		JCheckBox c2 = new JCheckBox("PYTHON");
		c2.setBounds(255, 216, 78, 23);
		frame.getContentPane().add(c2);
		
		JComboBox cb1 = new JComboBox();
		cb1.setModel(new DefaultComboBoxModel(new String[] {"SELECT"}));
		cb1.setBounds(187, 144, 86, 22);
		frame.getContentPane().add(cb1);
		
		JCheckBox c3 = new JCheckBox("JAVA");
		c3.setBounds(352, 216, 76, 23);
		frame.getContentPane().add(c3);
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String roll=tb1.getText();
				String name=tb2.getText();
				String branch=(String) cb1.getSelectedItem();
				String gender=" ";
				String langs=" ";
				if(r1.isSelected())
				{
					gender="male";
				}
				if(r2.isSelected())
				{
					gender="female";
				}
				if(c1.isSelected())
				{
					langs=langs+"c";
				}
				if(c2.isSelected())
				{
					langs=langs+"java";
				}
				if(c3.isselected())
				{
					langs=langs+"python";
				JoptionPane.showMessageDiolog(btnbutton,"ROLL:"+roll+\n "NAME:"+name+\n "BRANCH:"+branch+\n "GENDER:"+gender+\n "PROG LANG:"+prog lang)			
			}
		});
		btnNewButton.setBounds(184, 246, 89, 23);
		frame.getContentPane().add(btnNewButton);
	
		}
