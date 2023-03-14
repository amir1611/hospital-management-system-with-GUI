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

public class DisplayTreatmentForm extends JFrame {

	private JTable table;
	public DisplayTreatmentForm()  {
		this.setResizable(false);
		getContentPane().setBackground(Color.WHITE);
	getContentPane().setLayout(null);
	this.setSize(1920,1080);
	JLabel lblNewLabel_4 = new JLabel("APPOINTMENT HISTORY");
	lblNewLabel_4.setForeground(Color.WHITE);
	lblNewLabel_4.setFont(new Font("Source Code Pro", Font.BOLD, 27));
	lblNewLabel_4.setBounds(335, 13, 350, 62);
	getContentPane().add(lblNewLabel_4);

String column[]={"PATIENT ID","DOCTOR NAME","MEDICINES"};         
   
DefaultTableModel tableModel = new DefaultTableModel(column, 0);

for (int i = 0; i < HospitalSystem.ml.getTreatmentSize(); i++){
  	Treatment t=HospitalSystem.ml.getTreatment(i);
	   String doc=t.getAppointmentHeld().getDoc().getName();
	   String patient=t.getAppointmentHeld().getPatient().getName();
	   Medicine[] m=t.getMedicineSuggested();
	   String med="";
	   for(int j=0; j<t.size(); j++) {
		   med=med+","+m[j].getMedID();
	   }
	   Object[] dataAppointment = {doc,patient,med};
	   tableModel.addRow(dataAppointment);	  
	   }
	   
	   
	 

	

table = new JTable(tableModel);
table.setFont(new Font("Tahoma", Font.PLAIN, 15));
table.setBounds(0, 148, 986, 386);
getContentPane().add(table);
JLabel lblNewLabel = new JLabel("DOC NAME");
lblNewLabel.setForeground(Color.RED);
lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
lblNewLabel.setBounds(361, 113, 101, 25);
getContentPane().add(lblNewLabel);
JLabel lblPhoneNo = 
new JLabel("MEDICINES");
lblPhoneNo.setForeground(Color.RED);
lblPhoneNo.setFont(new Font("Tahoma", Font.PLAIN, 20));
lblPhoneNo.setBounds(664, 113, 115, 25);
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
		HospitalSystem.ml.removeTreatment(index);
		
		JOptionPane.showMessageDialog(null, "Treatment Deleted Successfully");
		
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
