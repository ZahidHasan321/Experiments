package entity;

import constants.ExamVerdict;
import constants.ExamineeType;

public class Marksheet {
	private String name = "";
	private float mark = 0.0F;
	private Enum<ExamVerdict> verdict = ExamVerdict.UNPROCESSED;
	private boolean hasPaid = false;
	private Enum<ExamineeType> Type = ExamineeType.NONE;
	private String dept = "";
	private String contact = "";
	
	
	@Override
	public String toString() {
		return "Marksheet [name=" + name + ", mark=" + mark + ", verdict=" + verdict + ", dept=" + dept + ", contact="
				+ contact + ", hasPaid=" + hasPaid + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getMark() {
		return mark;
	}
	public void setMark(float mark) {
		this.mark = mark;
	}
	public Enum<ExamVerdict> getVerdict() {
		return verdict;
	}
	public void setVerdict(Enum<ExamVerdict> verdict) {
		this.verdict = verdict;
	}
	public boolean isHasPaid() {
		return hasPaid;
	}
	public void setHasPaid(boolean hasPaid) {
		this.hasPaid = hasPaid;
	}
	public Enum<ExamineeType> getType() {
		return Type;
	}
	public void setType(Enum<ExamineeType> type) {
		Type = type;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
}
