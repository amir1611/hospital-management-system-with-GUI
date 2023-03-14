package hospitalsystem;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class DisplayDoctorsForm extends JFrame {
	private JTable table;
	public DisplayDoctorsForm() {
		this.setResizable(false);
		getContentPane().setBackground(Color.WHITE);
	getContentPane().setLayout(null);
	this.setSize(1920,1080);
	JLabel lblNewLabel_4 = new JLabel("DOCTORS DATA");
	lblNewLabel_4.setForeground(Color.WHITE);
	lblNewLabel_4.setFont(new Font("Source Code Pro", Font.BOLD, 27));
	lblNewLabel_4.setBounds(390, 13, 248, 62);
	getContentPane().add(lblNewLabel_4);
	
String column[]={"ID","NAME","ADDRESS","PHONENO","SCHEDULE"};         
   
DefaultTableModel tableModel = new DefaultTableModel(column, 0);
tableModel.setColumnIdentifiers(column);
for (int i = 0; i < HospitalSystem.ml.getDoctorSize(); i++){
	
	Doctor d=HospitalSystem.ml.getDoctor(i);
	
	   String id=d.getId();
	   String name=d.getName();
	   String address=d.getAddress();
	   String pno=d.getMobile();
	   String schedule=d.getschedule();

	   

	   Object[] dataDoctor = {id,name,address,pno,schedule};

	   tableModel.addRow(dataDoctor);

	}

table = new JTable(tableModel);
table.setFont(new Font("Tahoma", Font.PLAIN, 15));
table.setBounds(0, 148, 1083, 386);
getContentPane().add(table);
JLabel lblNewLabel = new JLabel("FULL NAME");
lblNewLabel.setForeground(Color.RED);
lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
lblNewLabel.setBounds(190, 113, 101, 25);
getContentPane().add(lblNewLabel);
JLabel lblAddress = new JLabel("PHONE NO");
lblAddress.setForeground(Color.RED);
lblAddress.setFont(new Font("Tahoma", Font.PLAIN, 20));
lblAddress.setBounds(400, 110, 101, 25);
getContentPane().add(lblAddress);
JLabel lblPhoneNo = new JLabel("ADDRESS");
lblPhoneNo.setForeground(Color.RED);
lblPhoneNo.setFont(new Font("Tahoma", Font.PLAIN, 20));
lblPhoneNo.setBounds(620, 113, 101, 25);
getContentPane().add(lblPhoneNo);
JLabel lblExpertise = new JLabel("SCHEDULE");
lblExpertise.setForeground(Color.RED);
lblExpertise.setFont(new Font("Tahoma", Font.PLAIN, 20));
lblExpertise.setBounds(860, 110, 101, 25);
getContentPane().add(lblExpertise);
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
btnNewButton.setBounds(863, 585, 99, 25);
getContentPane().add(btnNewButton);
	
JLabel lblId = new JLabel("ID");
lblId.setForeground(Color.RED);
lblId.setFont(new Font("Tahoma", Font.PLAIN, 20));
lblId.setBounds(10, 113, 30, 25);
getContentPane().add(lblId);

JButton btnNewButton_1 = new JButton("DELETE");
btnNewButton_1.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		
		
		int index=table.getSelectedRow();
	if(index!=-1) {
		tableModel.removeRow(index);
		HospitalSystem.ml.removeDoctor(index);
		JOptionPane.showMessageDialog(null, "Doctor Deleted Successfully");
	
		
		
	}}
});
btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
btnNewButton_1.setBackground(Color.WHITE);
btnNewButton_1.setBounds(417, 586, 99, 25);
getContentPane().add(btnNewButton_1);

JButton btnNewButton_1_1 = new JButton("UPDATE");
btnNewButton_1_1.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		int index=table.getSelectedRow();
		if(index!=-1) {
			
		doctorForm2 d=new doctorForm2(index);
		d.setVisible(true);
		dispose();
			}
	}
});
btnNewButton_1_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
btnNewButton_1_1.setBackground(Color.WHITE);
btnNewButton_1_1.setBounds(528, 586, 99, 25);
getContentPane().add(btnNewButton_1_1);

this.setResizable(false);

JLabel lblNewLabel_5 = new JLabel(new ImageIcon("bg2.jpg"));
lblNewLabel_5.setBounds(0, 0, 986, 630);
getContentPane().add(lblNewLabel_5);



	}
}
