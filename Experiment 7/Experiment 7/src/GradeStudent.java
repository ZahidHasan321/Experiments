import grade.*;

public class GradeStudent {
    public static void main(String[] args) {
        CalculateCGPA student = new CalculateCGPA();

        student.setStudent("Zahid",37, "CSE");
        student.setCourseName(new String[]{"CSE 321", "CSE 323", "EEE 321"});
        student.setCourseCredit(new float[]{2, 3, 2});
        student.setCourseMark(new float[]{100, 100, 100});
        student.setMarks(new float[]{30, 50, 85});

        System.out.println(student+"CGPA: " + student.getCGPA());

    }
}
