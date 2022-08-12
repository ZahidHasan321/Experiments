package ui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import administration.ExamController;
import entity.Marksheet;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

@SuppressWarnings("serial")
public class Recruit extends JFrame {

	private JPanel contentPane;
	private JTextField tfViva;
	private JTextField tfWritten;
	private JTextField tfPractical;
	
	
	public Float getViva() {
		return Float.parseFloat(tfViva.getText());
	}


	public float getWritten() {
		return Float.parseFloat(tfWritten.getText());
	}


	public float getPractical() {
		return Float.parseFloat(tfPractical.getText());
	}


	/**
	 * Create the frame.
	 */
	public Recruit(Marksheet ms) {
		String title = ms.getType().toString().toLowerCase();
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(500, 300, 720, 480);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		
		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JLabel lblViva = new JLabel("Viva mark");
		lblViva.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		tfViva = new JTextField();
		tfViva.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				char c = e.getKeyChar();
				if(Character.isLetter(c)) {
					tfViva.setEditable(false);
				}
				else
					tfViva.setEditable(true);
			}
		});
		tfViva.setColumns(10);
		
		JLabel lblWrittenMark = new JLabel("Written mark");
		lblWrittenMark.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		tfWritten = new JTextField();
		tfWritten.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				char c = e.getKeyChar();
				if(Character.isLetter(c)) {
					tfWritten.setEditable(false);
				}
				else
					tfWritten.setEditable(true);
			}
		});
		tfWritten.setColumns(10);
		
		JLabel lblPracticalMark = new JLabel("Practical mark");
		lblPracticalMark.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		tfPractical = new JTextField();
		tfPractical.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				char c = e.getKeyChar();
				if(Character.isLetter(c)) {
					tfPractical.setEditable(false);
				}
				else
					tfPractical.setEditable(true);
			}
		});
		tfPractical.setColumns(10);
		
		JButton btnNSubmit = new JButton("Submit");
		btnNSubmit.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switch(title) {
				case "teacher" -> ms.setMark(getViva());
				
				case "officer" -> ms.setMark(getViva() * 0.5F + getWritten() * 0.5F);
				
				case "staff" -> ms.setMark(getViva() * 0.25F + getWritten() * 0.5F + getPractical() * 0.25F);
				
				default -> {ms.setMark(0.0F);}					
				}
				new ExamController().ProcessResult(ms);
				JOptionPane.showMessageDialog(getContentPane(), "Submitted", "Success" ,JOptionPane.INFORMATION_MESSAGE, null);
				dispose();
			}
		});
		
		JLabel lblsetName = new JLabel(ms.getName());
		lblsetName.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JButton btnNSubmit_1 = new JButton("Cancel");
		btnNSubmit_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNSubmit_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(panel, GroupLayout.DEFAULT_SIZE, 694, Short.MAX_VALUE)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblWrittenMark, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGap(603))
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblViva, GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
							.addGap(11))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblName, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addGap(50))
						.addComponent(lblPracticalMark, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addGap(23)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
							.addComponent(btnNSubmit, GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
							.addGap(207)
							.addComponent(btnNSubmit_1, GroupLayout.PREFERRED_SIZE, 104, GroupLayout.PREFERRED_SIZE)
							.addGap(161))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addComponent(tfPractical, GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
								.addComponent(tfViva, GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
								.addComponent(tfWritten, GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE))
							.addGap(375))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblsetName, GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
							.addGap(504))))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
					.addGap(63)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblName)
						.addComponent(lblsetName))
					.addGap(34)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblViva, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
						.addComponent(tfViva, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(26)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblWrittenMark, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
						.addComponent(tfWritten, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblPracticalMark, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
						.addComponent(tfPractical, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNSubmit)
						.addComponent(btnNSubmit_1, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
					.addGap(62))
		);
		
		JLabel lblTitle = new JLabel("Recruit");
		panel.add(lblTitle);
		lblTitle.setFont(new Font("Times New Roman", Font.BOLD, 20));
		
		
		
		
		JLabel lblTitle2 = new JLabel(title.substring(0, 1).toUpperCase() + title.substring(1));
		
		panel.add(lblTitle2);
		lblTitle2.setFont(new Font("Times New Roman", Font.BOLD, 20));
		contentPane.setLayout(gl_contentPane);
		
		switch(title) {
		case "teacher"-> {
						tfWritten.setVisible(false);
						lblWrittenMark.setVisible(false);	
		
						tfPractical.setVisible(false);
						lblPracticalMark.setVisible(false);
		}
		case "officer" -> {
			tfPractical.setVisible(false);
			lblPracticalMark.setVisible(false);
		}
		default -> {}
		}
	}
}
