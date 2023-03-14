package hospitalsystem;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class DisplayAppointmentsForm extends JFrame {

	private JTable table;
	public DisplayAppointmentsForm()  {
		this.setResizable(false);
		getContentPane().setBackground(Color.WHITE);
	getContentPane().setLayout(null);
	this.setSize(1920,1080);
	JLabel lblNewLabel_4 = new JLabel("APPOINTMENT HISTORY");
	lblNewLabel_4.setForeground(Color.WHITE);
	lblNewLabel_4.setFont(new Font("Source Code Pro", Font.BOLD, 27));
	lblNewLabel_4.setBounds(335, 13, 350, 62);
	getContentPane().add(lblNewLabel_4);

String column[]={"PATIENT ID","DOCTOR NAME","DATE","TIME"};         
   
DefaultTableModel tableModel = new DefaultTableModel(column, 0);

for (int i = 0; i < HospitalSystem.ml.getAppointmentSize(); i++){
        Appointment a=(Appointment)HospitalSystem.ml.getAppointment(i);
	   String doc=a.getDoc().getName();
	   
	   String pid=a.getPatient().getId()+"";
	   
	   String date=a.getDate().toString();
	   String time=a.getTime().toString();
	   
	   Object[] dataAppointment = {pid,doc,date,time};

	   tableModel.addRow(dataAppointment);

	}

table = new JTable(tableModel);
table.setFont(new Font("Tahoma", Font.PLAIN, 15));
table.setBounds(0, 148, 986, 386);
getContentPane().add(table);
JLabel lblNewLabel = new JLabel("DOC NAME");
lblNewLabel.setForeground(Color.RED);
lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
lblNewLabel.setBounds(243, 110, 101, 25);
getContentPane().add(lblNewLabel);
JLabel lblAddress = new JLabel("DATE");
lblAddress.setForeground(Color.RED);
lblAddress.setFont(new Font("Tahoma", Font.PLAIN, 20));
lblAddress.setBounds(486, 110, 101, 25);
getContentPane().add(lblAddress);
JLabel lblPhoneNo = 
new JLabel("TIME");
lblPhoneNo.setForeground(Color.RED);
lblPhoneNo.setFont(new Font("Tahoma", Font.PLAIN, 20));
lblPhoneNo.setBounds(720, 110, 70, 25);
getContentPane().add(lblPhoneNo);
JButton btnNewButton = new JButton("Back");
btnNewButton.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		MainWindow m=new MainWindow();
		m.setVisible(true);
		dispose();
	}
});
btnNewButton.setBackground(Color.WHITE);
btnNewButton.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
btnNewButton.setBounds(841, 588, 99, 25);
getContentPane().add(btnNewButton);

JLabel lblId = new JLabel("PATIENT ID");
lblId.setForeground(Color.RED);
lblId.setFont(new Font("Tahoma", Font.PLAIN, 20));
lblId.setBounds(21, 110, 115, 25);
getContentPane().add(lblId);

JButton btnDelete = new JButton("DELETE");
btnDelete.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		
		int index=table.getSelectedRow();
		tableModel.removeRow(index);
		HospitalSystem.ml.removeAppointment(index);
		JOptionPane.showMessageDialog(null, "Appointment Deleted Successfully");
		
	}
});
btnDelete.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
btnDelete.setBackground(Color.WHITE);
btnDelete.setBounds(445, 588, 99, 25);
getContentPane().add(btnDelete);

this.setResizable(false);


JLabel lblNewLabel_1 = new JLabel(new ImageIcon("bg2.jpg"));
lblNewLabel_1.setBounds(0, 0, 986, 631);
getContentPane().add(lblNewLabel_1);
	
	
	}
}
