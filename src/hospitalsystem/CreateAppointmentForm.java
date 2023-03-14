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

public class CreateAppointmentForm extends JFrame{
	private JTextField textField_date;
	public CreateAppointmentForm() throws SQLException {
	
		getContentPane().setLayout(null);
		this.setSize(1920,1080);
		
		JLabel lblNewLabel_4 = new JLabel("APPOINTMENT SCHEDULER");
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setFont(new Font("Source Code Pro", Font.BOLD, 27));
		lblNewLabel_4.setBounds(57, 24, 406, 62);
		getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Choose Doctor");
		lblNewLabel_5.setFont(new Font("Castellar", Font.BOLD, 20));
		lblNewLabel_5.setBounds(22, 127, 212, 36);
		lblNewLabel_5.setForeground(Color.RED);
		getContentPane().add(lblNewLabel_5);
		
		JComboBox comboBox_doc = new JComboBox();
		comboBox_doc.setBounds(244, 133, 182, 30);
		getContentPane().add(comboBox_doc);
		
		JComboBox comboBox_time = new JComboBox();
		comboBox_time.setBounds(246, 259, 182, 36);
		getContentPane().add(comboBox_time);
		
		comboBox_time.addItem("09:00:00");
		comboBox_time.addItem("10:00:00");
		comboBox_time.addItem("11:00:00");
		
		JComboBox comboBox_pt = new JComboBox();
		comboBox_pt.setBounds(244, 194, 187, 30);
		getContentPane().add(comboBox_pt);
		
		
		for(int i=0; i<HospitalSystem.ml.getDoctorSize(); i++) {
			comboBox_doc.addItem(HospitalSystem.ml.getDoctor(i).getName());
		}
		
		for(int i=0; i<HospitalSystem.ml.getPatientSize(); i++) {
			comboBox_pt.addItem(HospitalSystem.ml.getPatient(i).getName());
		}
		
		JButton btnNewButton = new JButton("Generate Appointment");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				Appointment a=new Appointment();
				a.setPatient(HospitalSystem.ml.getPatient(comboBox_pt.getSelectedIndex()));
			    a.setDoc(HospitalSystem.ml.getDoctor(comboBox_doc.getSelectedIndex()));

				a.setDate(textField_date.getText());
				a.setTime(comboBox_time.getSelectedItem()+"");
				
				HospitalSystem.ml.addAppointment(a);
				
				JOptionPane.showMessageDialog(null, "APPOINTMENT BOOKED");
				
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
		
		JLabel lblNewLabel_5_1 = new JLabel("Choose Time");
		lblNewLabel_5_1.setFont(new Font("Castellar", Font.BOLD, 20));
		lblNewLabel_5_1.setBounds(22, 259, 176, 36);
		lblNewLabel_5_1.setForeground(Color.RED);
		getContentPane().add(lblNewLabel_5_1);
		
	
		textField_date = new JTextField();
		textField_date.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_date.setColumns(10);
		textField_date.setBounds(244, 327, 232, 43);
		getContentPane().add(textField_date);
		
		JLabel lblNewLabel_1_1 = new JLabel("Enter Date");
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
		
		JLabel lblNewLabel_5_2 = new JLabel("Choose Patient");
		lblNewLabel_5_2.setForeground(Color.RED);
		lblNewLabel_5_2.setFont(new Font("Castellar", Font.BOLD, 20));
		lblNewLabel_5_2.setBounds(22, 188, 212, 36);
		getContentPane().add(lblNewLabel_5_2);
	
	
	ImageIcon i=new ImageIcon("bg2.jpg");
		
	this.setResizable(false);
		JLabel icon = new JLabel(i);
		icon.setBounds(0, 0, 511, 517);
		getContentPane().add(icon);
		
	}
}
