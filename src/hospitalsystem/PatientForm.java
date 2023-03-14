package hospitalsystem;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;

public class PatientForm extends JFrame {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	public PatientForm() {
	getContentPane().setLayout(null);
	
	JLabel lblNewLabel = new JLabel("Enter Patient Name");
	lblNewLabel.setForeground(Color.RED);
	lblNewLabel.setFont(new Font("Castellar", Font.BOLD, 20));
	lblNewLabel.setBounds(24, 152, 296, 43);
	getContentPane().add(lblNewLabel);
	
	textField = new JTextField();
	textField.setFont(new Font("Tahoma", Font.PLAIN, 20));
	textField.setBounds(374, 154, 232, 43);
	getContentPane().add(textField);
	textField.setColumns(10);
	
	textField_1 = new JTextField();
	textField_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
	textField_1.setBounds(374, 229, 232, 43);
	getContentPane().add(textField_1);
	textField_1.setColumns(10);
	
	JLabel lblNewLabel_2 = new JLabel("Enter Patient phoneno");
	lblNewLabel_2.setForeground(Color.RED);
	lblNewLabel_2.setFont(new Font("Castellar", Font.BOLD, 20));
	lblNewLabel_2.setBounds(24, 230, 320, 36);
	getContentPane().add(lblNewLabel_2);
	
	textField_2 = new JTextField();
	textField_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
	textField_2.setBounds(374, 306, 232, 41);
	getContentPane().add(textField_2);
	textField_2.setColumns(10);
	
	JLabel lblNewLabel_3 = new JLabel("Enter Patient address");
	lblNewLabel_3.setForeground(Color.RED);
	lblNewLabel_3.setFont(new Font("Castellar", Font.BOLD, 20));
	lblNewLabel_3.setBounds(24, 306, 338, 36);
	getContentPane().add(lblNewLabel_3);
	
	textField_3 = new JTextField();
	textField_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
	textField_3.setBounds(374, 383, 232, 43);
	getContentPane().add(textField_3);
	textField_3.setColumns(10);
	this.setSize(1920,1080);

	
	JButton btnNewButton = new JButton("Add Patient");
	btnNewButton.setFont(new Font("Castellar", Font.BOLD, 20));
	btnNewButton.setBackground(Color.WHITE);
	btnNewButton.setBounds(206, 487, 232, 43);
	getContentPane().add(btnNewButton);
	
	btnNewButton.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {


Patient d=new Patient();
d.setName(textField.getText());
d.setAddress(textField_1.getText());
d.setMobile(textField_2.getText());
d.setDisease(textField_3.getText());

Random rand=new Random();

PersonIDFactory ids=new PersonIDFactory();  //using Factory pattern
String id=ids.getPersonID("Patient");
d.setId(rand.nextInt(100)+id);

HospitalSystem.ml.addPatient(d);
JOptionPane.showMessageDialog(null, "Patient Added Successfully with ID "+d.getId());


		}
	});
	
	
	JButton btnNewButton_1 = new JButton("Back");
	btnNewButton_1.setBackground(Color.WHITE);
	btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 19));
	btnNewButton_1.setBounds(269, 540, 117, 36);
	getContentPane().add(btnNewButton_1);
	btnNewButton_1.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
MainWindow w=new MainWindow();
w.setVisible(true);
dispose();

			
		}
	});
	
	
	
	JLabel lblNewLabel_4 = new JLabel("Add Patient To System");
	lblNewLabel_4.setForeground(Color.WHITE);
	lblNewLabel_4.setFont(new Font("Trebuchet MS", Font.BOLD, 27));
	lblNewLabel_4.setBounds(181, 26, 296, 62);
	getContentPane().add(lblNewLabel_4);
	
	JLabel lblNewLabel_3_1 = new JLabel("Enter Patient Disease");
	lblNewLabel_3_1.setForeground(Color.RED);
	lblNewLabel_3_1.setFont(new Font("Castellar", Font.BOLD, 20));
	lblNewLabel_3_1.setBounds(24, 384, 329, 36);
	getContentPane().add(lblNewLabel_3_1);
	
	this.setResizable(false);

	
	JLabel lblNewLabel_5 = new JLabel(new ImageIcon("bg2.jpg"));
	lblNewLabel_5.setBounds(0, 0, 640, 602);
	getContentPane().add(lblNewLabel_5);
	
	

	
	
	}
}
