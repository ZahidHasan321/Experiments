package constants;

public enum PassingMarks {
	STUDENT_PASS(40.0F),
	TEACHER_PASS(50.0F),
	STAFF_PASS(30.0F),
	OFFICER_PASS(35.0F),
	FAIL(0);
	
	
	float mark;

	PassingMarks(float mark) {
		this.mark = mark;
	}

	public float getPassingMark() {
		return mark;
	}
			
}
