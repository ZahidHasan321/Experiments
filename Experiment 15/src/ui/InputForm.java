package ui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import entity.Employee;
import util.WriteToFile;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JFormattedTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

@SuppressWarnings("serial")
public class InputForm extends JFrame {

	private JPanel contentPane;
	private JTextField tfName;
	private JTextField tfDesignation;
	/**
	 * Create the frame.
	 */
	public InputForm() {
		setResizable(false);
		setTitle("Form");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblTitle = new JLabel("Employee Form");
		lblTitle.setHorizontalAlignment(SwingConstants.TRAILING);
		
		JLabel lblName = new JLabel("Name");
		
		tfName = new JTextField();
		tfName.setColumns(10);
		
		JLabel lblDesgination = new JLabel("Designation");
		
		tfDesignation = new JTextField();
		tfDesignation.setColumns(10);
		
		JLabel lblsalary = new JLabel("Salary");
		
		JFormattedTextField ftfSalary = new JFormattedTextField();
		ftfSalary.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				char c = e.getKeyChar();
				
				if(Character.isLetter(c)) {
					ftfSalary.setEditable(false);
				}
				else {
					ftfSalary.setEditable(true);
				}
			}
		});
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Employee employee = new Employee(tfName.getText(), tfDesignation.getText(), Double.parseDouble(ftfSalary.getText()));
				
				
				WriteToFile toFile = new WriteToFile();
				try {
					toFile.writing(employee);
					JOptionPane.showMessageDialog(getContentPane(), "Submitted", "Success",JOptionPane.INFORMATION_MESSAGE);
					
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
				tfName.setText("");
				tfDesignation.setText("");
				ftfSalary.setText("");
			}

		});
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				WriteToFile file = new WriteToFile();
				try {
					file.emptyFile();
					JOptionPane.showMessageDialog(getContentPane(), "Emptied file", "Success",JOptionPane.INFORMATION_MESSAGE);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(172)
					.addComponent(lblTitle, GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
					.addGap(206))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblName, GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
								.addComponent(lblDesgination, GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE))
							.addPreferredGap(ComponentPlacement.UNRELATED))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblsalary)
							.addGap(24)))
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
						.addComponent(ftfSalary)
						.addComponent(tfDesignation)
						.addComponent(tfName, GroupLayout.DEFAULT_SIZE, 337, Short.MAX_VALUE))
					.addContainerGap(43, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(115)
					.addComponent(btnSubmit, GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
					.addGap(51)
					.addComponent(btnReset, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)
					.addGap(74))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblTitle)
					.addGap(27)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblName)
						.addComponent(tfName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(26)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(tfDesignation, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblDesgination))
					.addGap(30)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblsalary)
						.addComponent(ftfSalary, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(38)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnSubmit, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(btnReset))
					.addGap(22))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
