package hospitalsystem;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
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

public class createTreatmentForm extends JFrame{
	private JTextField textField_date;
	private JTextField textField;
	private JTextField textField_1;
	public createTreatmentForm()  {
	
		getContentPane().setLayout(null);
		this.setSize(1920,1080);
		
		JLabel lblNewLabel_4 = new JLabel("ADD TREATMENT");
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setFont(new Font("Source Code Pro", Font.BOLD, 27));
		lblNewLabel_4.setBounds(125, 26, 244, 62);
		getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Choose Appointment");
		lblNewLabel_5.setFont(new Font("Castellar", Font.BOLD, 20));
		lblNewLabel_5.setBounds(22, 127, 282, 36);
		lblNewLabel_5.setForeground(Color.RED);
		getContentPane().add(lblNewLabel_5);
		
		JComboBox comboBox_doc = new JComboBox();
		comboBox_doc.setBounds(314, 133, 182, 30);
		getContentPane().add(comboBox_doc);
		
		
		for(int i=0; i<HospitalSystem.ml.getAppointmentSize(); i++) {
			comboBox_doc.addItem(HospitalSystem.ml.getAppointment(i).getDoc().getId()+":"+HospitalSystem.ml.getAppointment(i).getPatient().getId());
		}
	
		
		JButton btnNewButton = new JButton("ADD TREATMENT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				
				int index=-1;
				Medicine m=new Medicine(textField.getText(), textField_1.getText(), Double.parseDouble(textField_date.getText()));

				for(int i=0; i<HospitalSystem.ml.getTreatmentSize(); i++) {
					if(HospitalSystem.ml.getTreatment(i).getAppointmentHeld()==HospitalSystem.ml.getAppointment(comboBox_doc.getSelectedIndex())) {
					index=i;	
					}
				}
				
				if(index!=-1) {
					HospitalSystem.ml.getTreatment(index).addMedicine(m);
					JOptionPane.showMessageDialog(null, "MEDICINE ADDED TO TREATMENT");

				}
				else {
					Treatment t=new Treatment(HospitalSystem.ml.getAppointment(comboBox_doc.getSelectedIndex()), 100);
					t.addMedicine(m);
					JOptionPane.showMessageDialog(null, "TREATMENT ADDED");
					HospitalSystem.ml.addTreatment(t);

					
				}

				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setBounds(104, 397, 291, 43);
		getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 19));
		btnNewButton_1.setBounds(195, 450, 117, 36);
		getContentPane().add(btnNewButton_1);
		
	
		textField_date = new JTextField();
		textField_date.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_date.setColumns(10);
		textField_date.setBounds(178, 327, 298, 43);
		getContentPane().add(textField_date);
		

		JLabel lblNewLabel_1_1_1 = new JLabel("Enter Medicine ID");
		lblNewLabel_1_1_1.setForeground(Color.RED);
		lblNewLabel_1_1_1.setFont(new Font("Castellar", Font.BOLD, 20));
		lblNewLabel_1_1_1.setBounds(22, 181, 244, 43);
		getContentPane().add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Enter Medicine Name");
		lblNewLabel_1_1_2.setForeground(Color.RED);
		lblNewLabel_1_1_2.setFont(new Font("Castellar", Font.BOLD, 20));
		lblNewLabel_1_1_2.setBounds(22, 249, 282, 43);
		getContentPane().add(lblNewLabel_1_1_2);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField.setColumns(10);
		textField.setBounds(276, 181, 203, 43);
		getContentPane().add(textField);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_1.setColumns(10);
		textField_1.setBounds(304, 249, 176, 43);
		getContentPane().add(textField_1);
		
		
		JLabel lblNewLabel_1_1 = new JLabel("Enter Price");
		lblNewLabel_1_1.setFont(new Font("Castellar", Font.BOLD, 20));
		lblNewLabel_1_1.setBounds(22, 328, 158, 43);
		lblNewLabel_1_1.setForeground(Color.RED);
		getContentPane().add(lblNewLabel_1_1);
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
		icon.setBounds(0, 0, 511, 517);
		getContentPane().add(icon);
		
		
		
		
		
		
	}
}
