package ui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import constants.ExamineeType;
import data.Marksheets;
import entity.Marksheet;

import javax.swing.JButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.SwingConstants;

@SuppressWarnings("serial")
public class MainFrame extends JFrame {

	private JPanel contentPane;
	String [] options = {"None", "Teacher", "Officer", "Staff"};
	/**
	 * Create the frame.
	 */
	public MainFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 720, 480);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JButton btnRecruit = new JButton("Recruit");
		btnRecruit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			
			Object option = JOptionPane.showInputDialog(getContentPane(), "Select who to recruit?", getTitle(),JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
			if(option == null) {
				//do Nothing
			}
			else if(!option.equals("None")) {
					Marksheet ms = new Marksheet();
					switch(option.toString()) {
					case "Teacher" -> ms.setType(ExamineeType.TEACHER);
					
					case "Officer" -> ms.setType(ExamineeType.OFFICER);
					
					case "Staff" -> ms.setType(ExamineeType.STAFF);
					
					default -> {}					
					}
					ExamineeInfo frame = new ExamineeInfo(ms);
					frame.setVisible(true);
				}
			}
		});
		
		JButton btnEnroll = new JButton("Enroll student");
		btnEnroll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Marksheet ms = new Marksheet();
				ms.setType(ExamineeType.STUDENT);
				ExamineeInfo frame = new ExamineeInfo(ms);
				frame.setVisible(true);
			}
		});
		
		JButton btnResult = new JButton("Publish result");
		btnResult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new ResultPublish().setVisible(true);
			}
		});
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		JPanel panel = new JPanel();
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(585)
					.addComponent(btnExit, GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
					.addContainerGap())
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(44)
					.addComponent(btnRecruit, GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
					.addGap(86)
					.addComponent(btnEnroll, GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
					.addGap(73)
					.addComponent(btnResult, GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
					.addGap(41))
				.addComponent(panel, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 694, Short.MAX_VALUE)
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 156, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnResult)
						.addComponent(btnEnroll)
						.addComponent(btnRecruit))
					.addGap(165)
					.addComponent(btnExit)
					.addContainerGap())
		);
		
		JLabel lblTitle = new JLabel("CU ERP");
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setFont(new Font("Times New Roman", Font.PLAIN, 32));
		panel.add(lblTitle);
		contentPane.setLayout(gl_contentPane);
	}
}
