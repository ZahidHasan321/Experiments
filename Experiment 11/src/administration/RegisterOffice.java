package administration;

import entity.Marksheet;

public abstract class RegisterOffice {
	public abstract void  startExam(Marksheet ms);
	public void conductViva() {
		System.out.println("Viva conducted");
	}
	public void conductWritten() {
		System.out.println("Written conducted");
	}
	public void conductPractical() {
		System.out.println("Practical conducted");
	}
	
	public void conductAdmissionTest() {
		System.out.println("Admission test conducted");
	}
	
}
