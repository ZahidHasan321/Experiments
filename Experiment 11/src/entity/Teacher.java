package entity;

import administration.RegisterOffice;
import ui.Recruit;

public class Teacher extends RegisterOffice{

	public void startExam(Marksheet ms) {
		Recruit frame = new Recruit(ms);
		conductViva();
		
		frame.setVisible(true);
	}
	
}
