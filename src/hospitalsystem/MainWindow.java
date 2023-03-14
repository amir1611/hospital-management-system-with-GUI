package hospitalsystem;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class MainWindow extends JFrame {
	public MainWindow() {
	getContentPane().setLayout(null);
	this.setSize(1920,1080);
	JLabel lblNewLabel = new JLabel("HOSPITAL SENTOSA SYSTEM");
	lblNewLabel.setBackground(Color.WHITE);
	lblNewLabel.setForeground(Color.PINK);
	lblNewLabel.setFont(new Font("Stencil", Font.BOLD, 32));
	lblNewLabel.setBounds(117, 13, 643, 86);
	getContentPane().add(lblNewLabel);
	
	JButton btnNewButton = new JButton("Add Doctor");
	btnNewButton.setBackground(Color.WHITE);
	btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
	btnNewButton.setBounds(151, 230, 226, 47);
	getContentPane().add(btnNewButton);
	btnNewButton.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
          DoctorForm d=new DoctorForm();
          d.setVisible(true);
          dispose();
			
		}
	});
	
	
	JButton btnNewButton_1 = new JButton("Book Appointment");
	btnNewButton_1.setBackground(Color.WHITE);
	btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
	btnNewButton_1.setBounds(151, 423, 226, 47);
	getContentPane().add(btnNewButton_1);
	btnNewButton_1.addActionListener(new  ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {

			CreateAppointmentForm f=null;
			try {
				f = new CreateAppointmentForm();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			f.setVisible(true);
			dispose();
		}
	});
	
	this.setResizable(false);
	
	JButton btnNewButton_2 = new JButton("Display Patients");
	btnNewButton_2.setBackground(Color.WHITE);
	btnNewButton_2.addActionListener(new ActionListener() {
	
		public void actionPerformed(ActionEvent e) {
			DisplayPatientsForm f=new DisplayPatientsForm();
			f.setVisible(true);
			dispose();
		}
	});
	btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
	btnNewButton_2.setBounds(438, 326, 226, 47);
	getContentPane().add(btnNewButton_2);
	
	JButton btnNewButton_3 = new JButton("Display Doctors");
	btnNewButton_3.setBackground(Color.WHITE);
	btnNewButton_3.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			DisplayDoctorsForm d=new DisplayDoctorsForm();
			d.setVisible(true);
			dispose();
		
			
		}
	});
	btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
	btnNewButton_3.setBounds(151, 325, 226, 47);
	getContentPane().add(btnNewButton_3);
	
	JButton btnNewButton_2_2 = new JButton("Display Appointments");
	btnNewButton_2_2.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			DisplayAppointmentsForm a;
				a = new DisplayAppointmentsForm();
				a.setVisible(true);
			    dispose();
		}
	});
	btnNewButton_2_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
	btnNewButton_2_2.setBackground(Color.WHITE);
	btnNewButton_2_2.setBounds(438, 423, 226, 47);
	getContentPane().add(btnNewButton_2_2);
	

	JButton btnAddPatient = new JButton("Add Patient");
	btnAddPatient.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		
		PatientForm p=new PatientForm();
		p.setVisible(true);
		dispose();
		}
	});
	
	JButton btnNewButton_1_1 = new JButton("Add Treatment");
	btnNewButton_1_1.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			createTreatmentForm t=new createTreatmentForm();
			t.setVisible(true);
			dispose();
		}
	});
	btnNewButton_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
	btnNewButton_1_1.setBackground(Color.WHITE);
	btnNewButton_1_1.setBounds(303, 492, 226, 47);
	getContentPane().add(btnNewButton_1_1);
	btnAddPatient.setFont(new Font("Tahoma", Font.PLAIN, 20));
	btnAddPatient.setBackground(Color.WHITE);
	btnAddPatient.setBounds(438, 230, 226, 47);
	getContentPane().add(btnAddPatient);
	
	JButton btnNewButton_2_2_1 = new JButton("Display Treatments");
	btnNewButton_2_2_1.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		DisplayTreatmentForm t=new DisplayTreatmentForm();
		t.setVisible(true);
		dispose();
		}
	});
	btnNewButton_2_2_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
	btnNewButton_2_2_1.setBackground(Color.WHITE);
	btnNewButton_2_2_1.setBounds(303, 561, 226, 47);
	getContentPane().add(btnNewButton_2_2_1);
	
	this.setResizable(false);

	
	ImageIcon i=new ImageIcon("bg.jpg");
	JLabel icon = new JLabel(i);
	icon.setBounds(0, 0, 840, 632);
	getContentPane().add(icon);
	
	
	}
}
