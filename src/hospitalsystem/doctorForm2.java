package hospitalsystem;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;

public class doctorForm2 extends JFrame {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_4;
	public doctorForm2(int index) {
		Doctor d=HospitalSystem.ml.getDoctor(index);   
		
		getContentPane().setLayout(null);
	
	JLabel lblNewLabel = new JLabel("Enter Doctor Name");
	lblNewLabel.setForeground(Color.RED);
	lblNewLabel.setFont(new Font("Castellar", Font.BOLD, 20));
	lblNewLabel.setBounds(24, 152, 296, 43);
	getContentPane().add(lblNewLabel);
	
	textField = new JTextField(d.getName());
	textField.setFont(new Font("Tahoma", Font.PLAIN, 20));
	textField.setBounds(374, 154, 232, 43);
	getContentPane().add(textField);
	textField.setColumns(10);
	
	JLabel lblNewLabel_1 = new JLabel("Enter Doctor schedule");
	lblNewLabel_1.setForeground(Color.RED);
	lblNewLabel_1.setFont(new Font("Castellar", Font.BOLD, 20));
	lblNewLabel_1.setBounds(24, 382, 340, 43);
	getContentPane().add(lblNewLabel_1);
	
	
	textField_1 = new JTextField(d.getAddress());
	textField_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
	textField_1.setBounds(374, 229, 232, 43);
	getContentPane().add(textField_1);
	textField_1.setColumns(10);
	
	JLabel lblNewLabel_2 = new JLabel("Enter Doctor Address");
	lblNewLabel_2.setForeground(Color.RED);
	lblNewLabel_2.setFont(new Font("Castellar", Font.BOLD, 20));
	lblNewLabel_2.setBounds(24, 230, 294, 36);
	getContentPane().add(lblNewLabel_2);
	
	textField_2 = new JTextField(d.getMobile()+"");
	textField_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
	textField_2.setBounds(374, 306, 232, 41);
	getContentPane().add(textField_2);
	textField_2.setColumns(10);
	
	JLabel lblNewLabel_3 = new JLabel("Enter Doctor Phone No");
	lblNewLabel_3.setForeground(Color.RED);
	lblNewLabel_3.setFont(new Font("Castellar", Font.BOLD, 20));
	lblNewLabel_3.setBounds(24, 306, 338, 36);
	getContentPane().add(lblNewLabel_3);
	
	textField_4 = new JTextField(d.getschedule());
	textField_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
	textField_4.setColumns(10);
	textField_4.setBounds(374, 381, 232, 43);
	getContentPane().add(textField_4);
	this.setSize(1920,1080);

	
	JButton btnNewButton = new JButton("UPDATE");
	btnNewButton.setFont(new Font("Castellar", Font.BOLD, 20));
	btnNewButton.setBackground(Color.WHITE);
	btnNewButton.setBounds(200, 479, 232, 43);
	getContentPane().add(btnNewButton);
	
	btnNewButton.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {


d.setName(textField.getText());
d.setAddress(textField_1.getText());
d.setMobile(textField_2.getText());
d.setschedule(textField_4.getText());

JOptionPane.showMessageDialog(null, "Doctor Updated Successfully with ID "+d.getId());

		}
	});
	
	
	JButton btnNewButton_1 = new JButton("Back");
	btnNewButton_1.setBackground(Color.WHITE);
	btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 19));
	btnNewButton_1.setBounds(260, 532, 117, 36);
	getContentPane().add(btnNewButton_1);
	btnNewButton_1.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
MainWindow w=new MainWindow();
w.setVisible(true);
dispose();

			
		}
	});
	
	
	
	JLabel lblNewLabel_4 = new JLabel("Update Doctor To System");
	lblNewLabel_4.setForeground(Color.WHITE);
	lblNewLabel_4.setFont(new Font("Trebuchet MS", Font.BOLD, 27));
	lblNewLabel_4.setBounds(154, 24, 346, 62);
	getContentPane().add(lblNewLabel_4);
	
	this.setResizable(false);

	JLabel lblNewLabel_5 = new JLabel(new ImageIcon("bg2.jpg"));
	lblNewLabel_5.setBounds(0, 0, 640, 589);
	getContentPane().add(lblNewLabel_5);
	
	

	
	
	}
}
