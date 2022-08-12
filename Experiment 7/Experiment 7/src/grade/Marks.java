package grade;

public class Marks extends Courses{
    private float[] marks = new float[3];
    public float[] getMark() {
        return marks;
    }
    public void setMarks(float[] marks) {
        this.marks = marks;
    }
}
