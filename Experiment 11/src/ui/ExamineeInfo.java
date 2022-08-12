package ui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import entity.Marksheet;
import entity.Officer;
import entity.Staff;
import entity.Student;
import entity.Teacher;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

@SuppressWarnings("serial")
public class ExamineeInfo extends JFrame {

	private JPanel contentPane;
	private JTextField tfName;
	private JTextField tfDept;
	private JTextField tfContact;

	/**
	 * Create the frame.
	 */
	public ExamineeInfo(Marksheet ms) {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(500, 300, 720, 480);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		tfName = new JTextField();
		tfName.setFont(new Font("Tahoma", Font.PLAIN, 14));
		tfName.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Department");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		tfDept = new JTextField();
		tfDept.setFont(new Font("Tahoma", Font.PLAIN, 14));
		tfDept.setColumns(10);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Contact no.");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		tfContact = new JTextField();
		tfContact.setFont(new Font("Tahoma", Font.PLAIN, 14));
		tfContact.setColumns(10);
		
		JLabel lblError = new JLabel("Error: Form can't be emtpy");
		
		JButton btnConduct = new JButton("Conduct Exam");
		btnConduct.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(tfName.getText().isEmpty() || tfDept.getText().isEmpty() || tfContact.getText().isEmpty()) {
					lblError.setVisible(true);
				}
				else {
					ms.setName(tfName.getText());
					ms.setDept(tfDept.getText());
					ms.setContact(tfContact.getText());
					
					switch(ms.getType().toString().toLowerCase()) {
					case "student" ->  new Student().startExam(ms);
					
					case "teacher" -> new Teacher().startExam(ms);
					
					case "officer" -> new Officer().startExam(ms);
					
					case "staff" -> new Staff().startExam(ms);
					
					default -> {}					
					}
					dispose();
				}
			}
		});
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		
		JPanel panel = new JPanel();
		
		
		lblError.setForeground(Color.RED);
		lblError.setFont(new Font("Tahoma", Font.ITALIC, 11));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addComponent(panel, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 694, Short.MAX_VALUE)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblNewLabel_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addGap(49))
						.addComponent(lblNewLabel_1_1, GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
						.addComponent(lblNewLabel_1_1_1, GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE))
					.addGap(21)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblError)
							.addContainerGap())
						.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(tfContact, GroupLayout.DEFAULT_SIZE, 527, Short.MAX_VALUE)
								.addComponent(tfDept, GroupLayout.DEFAULT_SIZE, 527, Short.MAX_VALUE)
								.addComponent(tfName, GroupLayout.DEFAULT_SIZE, 527, Short.MAX_VALUE)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(btnConduct, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
									.addGap(307)
									.addComponent(btnCancel, GroupLayout.PREFERRED_SIZE, 101, Short.MAX_VALUE)))
							.addGap(52))))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_1)
						.addComponent(tfName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(49)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_1_1, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
						.addComponent(tfDept, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
					.addGap(56)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_1_1_1, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
						.addComponent(tfContact, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addComponent(lblError)
					.addPreferredGap(ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnConduct)
						.addComponent(btnCancel))
					.addGap(53))
		);
		
		JLabel lblNewLabel = new JLabel("Participator Form");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel.add(lblNewLabel);
		contentPane.setLayout(gl_contentPane);
		
		lblError.setVisible(false);
	}
}
