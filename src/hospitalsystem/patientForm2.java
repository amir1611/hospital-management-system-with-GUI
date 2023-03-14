package hospitalsystem;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;

public class patientForm2 extends JFrame{
	private JTextField textField_name;
	private JTextField textField_phoneno;
	private JTextField textField_address;
	private JTextField textField_issue;
	public patientForm2(int index) {
	
		Patient p=HospitalSystem.ml.getPatient(index);		
		getContentPane().setLayout(null);
		this.setSize(1920,1080);
	
	
		JLabel lblNewLabel = new JLabel("Enter Patient Name");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("Castellar", Font.BOLD, 20));
		lblNewLabel.setBounds(53, 160, 279, 43);
		getContentPane().add(lblNewLabel);
		
		textField_name = new JTextField(p.getName());
		textField_name.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_name.setBounds(342, 159, 232, 43);
		getContentPane().add(textField_name);
		textField_name.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("PATIENT UPDATE");
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setFont(new Font("Source Code Pro", Font.BOLD, 27));
		lblNewLabel_4.setBounds(212, 21, 254, 62);
		getContentPane().add(lblNewLabel_4);
		
		textField_phoneno = new JTextField(p.getMobile());
		textField_phoneno.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_phoneno.setBounds(330, 313, 244, 43);
		getContentPane().add(textField_phoneno);
		textField_phoneno.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Enter Patient Address");
		lblNewLabel_2.setFont(new Font("Castellar", Font.BOLD, 20));
		lblNewLabel_2.setBounds(33, 317, 296, 36);
		lblNewLabel_2.setForeground(Color.RED);
		getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Enter Patient Phone No");
		lblNewLabel_3.setFont(new Font("Castellar", Font.BOLD, 20));
		lblNewLabel_3.setBounds(21, 230, 314, 36);
		lblNewLabel_3.setForeground(Color.RED);
		getContentPane().add(lblNewLabel_3);
		
		textField_address = new JTextField(p.getAddress());
		textField_address.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_address.setBounds(342, 226, 232, 43);
		getContentPane().add(textField_address);
		textField_address.setColumns(10);
		
		
		JButton btnNewButton = new JButton("UPDATE PATIENT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name=textField_name.getText();
				String address=textField_address.getText();
				String phoneno=textField_phoneno.getText();
				String issue=textField_issue.getText();
						     	
		     	p.setName(name);
		     	p.setAddress(address);
		     	p.setMobile(phoneno);
		     	p.setDisease(issue);
			
				JOptionPane.showMessageDialog(null, "PATIENT UPDATED: WITH PATIENT ID: "+p.getId());
		
					
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setBounds(199, 469, 291, 43);
		getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 19));
		btnNewButton_1.setBounds(297, 522, 117, 36);
		getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel_3_1 = new JLabel("Enter Patient issue");
		lblNewLabel_3_1.setFont(new Font("Castellar", Font.BOLD, 20));
		lblNewLabel_3_1.setBounds(53, 383, 248, 36);
		lblNewLabel_3_1.setForeground(Color.RED);
		getContentPane().add(lblNewLabel_3_1);
		
		textField_issue = new JTextField(p.getDisease());
		textField_issue.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_issue.setColumns(10);
		textField_issue.setBounds(330, 383, 244, 43);
		getContentPane().add(textField_issue);
		btnNewButton_1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
	MainWindow w=new MainWindow();
	w.setVisible(true);
	dispose();

				
			}
		});
		
		this.setResizable(false);

		ImageIcon i=new ImageIcon("bg2.jpg");
		
		JLabel icon = new JLabel(i);
		icon.setBounds(0, 0, 697, 594);
		getContentPane().add(icon);
	
	}
}
