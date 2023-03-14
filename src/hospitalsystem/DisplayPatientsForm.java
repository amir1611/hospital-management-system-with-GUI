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
	import java.awt.event.ActionEvent;
	
public class DisplayPatientsForm extends JFrame{


		private JTable table;
		public DisplayPatientsForm() {
			this.setResizable(false);
			getContentPane().setBackground(Color.WHITE);
		getContentPane().setLayout(null);
		this.setSize(1920,1080);
		JLabel lblNewLabel_4 = new JLabel("PATIENTS DATA");
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setFont(new Font("Source Code Pro", Font.BOLD, 27));
		lblNewLabel_4.setBounds(372, 13, 248, 62);
		getContentPane().add(lblNewLabel_4);

	String column[]={"ID","NAME","ADDRESS","PHONENO","ISSUE"};         
	   
	DefaultTableModel tableModel = new DefaultTableModel(column, 0);

	for (int i = 0; i < HospitalSystem.ml.getPatientSize(); i++){
		Patient p=  HospitalSystem.ml.getPatient(i); 
		String name=p.getName();
		   String address=p.getAddress();
		   
		   String pno=p.getMobile();
		   String issue=p.getDisease();
		   String pid=p.getId();

		   Object[] dataDoctor = {pid,name,address,pno,issue};

		   tableModel.addRow(dataDoctor);

		}

	table = new JTable(tableModel);
	table.setFont(new Font("Tahoma", Font.PLAIN, 15));
	table.setBounds(0, 148, 1083, 386);
	getContentPane().add(table);
	JLabel lblNewLabel = new JLabel("FULL NAME");
	lblNewLabel.setForeground(Color.RED);
	lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblNewLabel.setBounds(210, 113, 101, 25);
	getContentPane().add(lblNewLabel);
	JLabel lblAddress = new JLabel("PHONE NO");
	lblAddress.setForeground(Color.RED);
	lblAddress.setFont(new Font("Tahoma", Font.PLAIN, 20));
	lblAddress.setBounds(430, 110, 101, 25);
	getContentPane().add(lblAddress);
	JLabel lblPhoneNo = new JLabel("ADDRESS");
	lblPhoneNo.setForeground(Color.RED);
	lblPhoneNo.setFont(new Font("Tahoma", Font.PLAIN, 20));
	lblPhoneNo.setBounds(650, 113, 101, 25);
	getContentPane().add(lblPhoneNo);
	JLabel lblExpertise = new JLabel("DISEASE");
	lblExpertise.setForeground(Color.RED);
	lblExpertise.setFont(new Font("Tahoma", Font.PLAIN, 20));
	lblExpertise.setBounds(870, 110, 101, 25);
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
	btnNewButton.setBounds(972, 587, 99, 25);
	getContentPane().add(btnNewButton);
	
	JLabel lblId = new JLabel("ID");
	lblId.setForeground(Color.RED);
	lblId.setFont(new Font("Tahoma", Font.PLAIN, 20));
	lblId.setBounds(12, 110, 49, 25);
	getContentPane().add(lblId);
		
	JButton btnDelete = new JButton("DELETE");
	btnDelete.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			int index=table.getSelectedRow();
			tableModel.removeRow(index);
			HospitalSystem.ml.removePatient(index);
		
			JOptionPane.showMessageDialog(null, "Patient Deleted Successfully");
			
			
	
		}
	});
	btnDelete.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
	btnDelete.setBackground(Color.WHITE);
	btnDelete.setBounds(453, 588, 99, 25);
	getContentPane().add(btnDelete);
	
	JButton btnNewButton_1_1 = new JButton("UPDATE");
	btnNewButton_1_1.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			int index=table.getSelectedRow();
			if(index!=-1) {
				
			 patientForm2 f=new patientForm2(index);
			f.setVisible(true);
			dispose();
			}
		}
	});
	btnNewButton_1_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
	btnNewButton_1_1.setBackground(Color.WHITE);
	btnNewButton_1_1.setBounds(573, 587, 99, 25);
	getContentPane().add(btnNewButton_1_1);

	this.setResizable(false);

	
	JLabel lblNewLabel_1 = new JLabel(new ImageIcon("bg2.jpg"));
	lblNewLabel_1.setBounds(0, 0, 1083, 631);
	getContentPane().add(lblNewLabel_1);
	

		}
	}


