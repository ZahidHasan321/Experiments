package ui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import data.Marksheets;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.BorderLayout;

@SuppressWarnings("serial")
public class ResultPublish extends JFrame {

	private JPanel contentPane;
	String[] columnNames = {"Name", "Deptartment", "Marks", "Contact", "Verdict"};
	
	
	private JTable tableStudent;
	private JTable tableTeacher;
	private JTable tableOfficer;
	private JTable tableStaff;
	/**
	 * Create the frame.
	 */
	public ResultPublish() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(500, 300, 720, 480);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(tabbedPane, GroupLayout.DEFAULT_SIZE, 694, Short.MAX_VALUE)
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(tabbedPane, GroupLayout.DEFAULT_SIZE, 431, Short.MAX_VALUE)
		);
		
		JPanel panelStudent = new JPanel();
		tabbedPane.addTab("Student", null, panelStudent, null);
		
		JPanel panelTeacher = new JPanel();
		tabbedPane.addTab("Teacher", null, panelTeacher, null);
		panelTeacher.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPaneTeacher = new JScrollPane();
		panelTeacher.add(scrollPaneTeacher, BorderLayout.CENTER);
		
		tableTeacher = new JTable(Marksheets.getTeacherMarksheet(), columnNames);
		scrollPaneTeacher.setViewportView(tableTeacher);
		
		
		JPanel panelOfficer = new JPanel();
		tabbedPane.addTab("Officer", null, panelOfficer, null);
		panelOfficer.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPaneOfficer = new JScrollPane();
		panelOfficer.add(scrollPaneOfficer, BorderLayout.CENTER);
		
		tableOfficer = new JTable(Marksheets.getOfficerMarksheet(), columnNames);
		scrollPaneOfficer.setViewportView(tableOfficer);
		
		JPanel panelStaff = new JPanel();
		tabbedPane.addTab("Staff", null, panelStaff, null);
		panelStaff.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPaneStaff = new JScrollPane();
		panelStaff.add(scrollPaneStaff, BorderLayout.CENTER);
		
		tableStaff = new JTable(Marksheets.getStaffMarksheet(), columnNames);
		scrollPaneStaff.setViewportView(tableStaff);
		panelStudent.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPaneStudent = new JScrollPane();
		
		tableStudent = new JTable(Marksheets.getStudentMarksheet(), columnNames);

		scrollPaneStudent.setViewportView(tableStudent);
		panelStudent.add(scrollPaneStudent);
		contentPane.setLayout(gl_contentPane);
	}
}
