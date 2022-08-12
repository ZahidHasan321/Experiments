package grade;

public class Courses extends Student {
    private String[] courseName = new String[3];
    private float[] courseMark = new float[3];
    private float[] courseCredit = new float[3];

    public String[] getCourseName() {
        return courseName;
    }

    public void setCourseName(String[] courseName) {
        this.courseName = courseName;
    }

    public float[] getCourseMark() {
        return courseMark;
    }

    public void setCourseMark(float[] courseMark) {
        this.courseMark = courseMark;
    }

    public float[] getCourseCredit() {
        return courseCredit;
    }

    public void setCourseCredit(float[] courseCredit) {
        this.courseCredit = courseCredit;
    }
}