package data;

import java.util.ArrayList;
import java.util.List;

import entity.Marksheet;

public class Marksheets {
	private static List<Marksheet> studentMarksheet = new ArrayList<Marksheet>();
	private static List<Marksheet> teacherMarksheet = new ArrayList<Marksheet>();
	private static List<Marksheet> officerMarksheet = new ArrayList<Marksheet>();
	private static List<Marksheet> staffMarksheet = new ArrayList<Marksheet>();
	
	public static Object[][] getStudentMarksheet() {
		Object[][] data = new Object[studentMarksheet.size()][5];
		int i = 0;
		for(Marksheet m: studentMarksheet) {
			Object column[] = {m.getName(), m.getDept(), m.getMark(), m.getContact(), m.getVerdict()};
			for(int j = 0; j < 5; j++) {
				try {
					data[i][j] = column[j];
				}
				catch(Exception e) {
					System.out.println("Something wrong with the list");
				}
			}
			i++;
		}
		return data;
	}

	public static Object[][] getTeacherMarksheet() {
		Object[][] data = new Object[teacherMarksheet.size()][5];
		int i = 0;
		for(Marksheet m: teacherMarksheet) {
			Object column[] = {m.getName(), m.getDept(), m.getMark(), m.getContact(), m.getVerdict()};
			for(int j = 0; j < 5; j++) {
				try {
					data[i][j] = column[j];
				}
				catch(Exception e) {
					System.out.println("Something wrong with the list");
				}
			}
			i++;
		}
		return data;
	}

	public static Object[][] getOfficerMarksheet() {
		Object[][] data = new Object[officerMarksheet.size()][5];
		int i = 0;
		for(Marksheet m: officerMarksheet) {
			Object column[] = {m.getName(), m.getDept(), m.getMark(), m.getContact(), m.getVerdict()};
			for(int j = 0; j < 5; j++) {
				try {
					data[i][j] = column[j];
				}
				catch(Exception e) {
					System.out.println("Something wrong with the list");
				}
			}
			i++;
		}
		return data;
	}

	public static Object[][] getStaffMarksheet() {
		Object[][] data = new Object[staffMarksheet.size()][5];
		int i = 0;
		for(Marksheet m: staffMarksheet) {
			Object column[] = {m.getName(), m.getDept(), m.getMark(), m.getContact(), m.getVerdict()};
			for(int j = 0; j < 5; j++) {
				try {
					data[i][j] = column[j];
				}
				catch(Exception e) {
					System.out.println("Something wrong with the list");
				}
			}
			i++;
		}
		return data;
	}
	
	public static void addToMarksheet(Marksheet ms) {
		String typeName = ms.getType().toString().toLowerCase();
		switch(typeName) {
		case "student" -> {
			studentMarksheet.add(ms);
		}
		case "teacher" -> {
			teacherMarksheet.add(ms);
		}
		case "officer" -> {
			officerMarksheet.add(ms);
		}
		case "staff" -> {
			staffMarksheet.add(ms);
		}
		default -> {System.err.println("Adding to Marksheet: No Type found");}
		}
	}
	
	public static void print(){
		
		for(Marksheet ms: studentMarksheet) {
			System.out.println(ms);
		}
		
		for(Marksheet ms: teacherMarksheet) {
			System.out.println(ms);
		}
		
		for(Marksheet ms: officerMarksheet) {
			System.out.println(ms);
		}
		
		for(Marksheet ms: staffMarksheet) {
			System.out.println(ms);
		}
	}
}
