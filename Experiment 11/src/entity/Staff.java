package entity;

import administration.RegisterOffice;
import ui.Recruit;

public class Staff extends RegisterOffice{
	@Override
	public void startExam(Marksheet ms) {
		Recruit frame = new Recruit(ms);
		conductViva();
		conductWritten();
		conductPractical();
		frame.setVisible(true);
	}
}
