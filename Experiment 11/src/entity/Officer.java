package entity;

import administration.RegisterOffice;
import ui.Recruit;

public class Officer extends RegisterOffice {

	@Override
	public void startExam(Marksheet ms) {
		Recruit frame = new Recruit(ms);
		conductViva();
		conductWritten();
		frame.setVisible(true);
		
	}

}
