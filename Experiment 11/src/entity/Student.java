package entity;

import administration.RegisterOffice;
import ui.EnrollStudent;

public class Student extends RegisterOffice{

	@Override
	public void startExam(Marksheet ms) {
		EnrollStudent frame = new EnrollStudent(ms);
		conductAdmissionTest();
		frame.setVisible(true);
	}

}
