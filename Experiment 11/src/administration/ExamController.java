package administration;

import constants.ExamVerdict;
import constants.PassingMarks;
import data.Marksheets;
import entity.Marksheet;

public class ExamController {
	public void ProcessResult(Marksheet ms) {
		
		if(ms.getName() == "" || ms.getMark() == 0.0) {
			ms.setVerdict(ExamVerdict.INVALID);
		}
		
		switch(ms.getType().toString().toLowerCase()) {
			case "student" -> {
				if(!Accounts.isValid(ms)) {
					ms.setVerdict(ExamVerdict.INCOMPLETE);
				}
				else {
					if(ms.getMark() >= PassingMarks.STUDENT_PASS.getPassingMark())
						ms.setVerdict(ExamVerdict.PASS);
					else
						ms.setVerdict(ExamVerdict.FAIL);
					
				}
			}
			
			case "teacher" -> {
				if(ms.getMark() >- PassingMarks.TEACHER_PASS.getPassingMark())
					ms.setVerdict(ExamVerdict.PASS);
				else
					ms.setVerdict(ExamVerdict.FAIL);
			}
			
			case "staff" -> {
				if(ms.getMark() >- PassingMarks.STAFF_PASS.getPassingMark())
					ms.setVerdict(ExamVerdict.PASS);
				else
					ms.setVerdict(ExamVerdict.FAIL);
			}

			
			case "officer" -> {
				if(ms.getMark() >- PassingMarks.OFFICER_PASS.getPassingMark())
					ms.setVerdict(ExamVerdict.PASS);
				else
					ms.setVerdict(ExamVerdict.FAIL);
			}
			
			default -> {}
		}
		Marksheets.addToMarksheet(ms);
	}
}
