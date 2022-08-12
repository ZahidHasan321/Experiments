package ERP;

public class Form {
    private String name = "";
    private int StudentID = 0;
    private int attendance = 0;
    private float paidFees = 0;
    private float due = 0;
    private boolean hasFailed = false;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudentID() {
        return StudentID;
    }

    public void setStudentID(int studentID) {
        StudentID = studentID;
    }

    public int getAttendance() {
        return attendance;
    }

    public void setAttendance(int attendance) {
        this.attendance = attendance;
    }

    public float getPaidFees() {
        return paidFees;
    }

    public void setPaidFees(float paidFees) {
        this.paidFees = paidFees;
    }

    public float getDue() {
        return due;
    }

    public void setDue(float due) {
        this.due = due;
    }

    public boolean isHasFailed() {
        return hasFailed;
    }

    public void setHasFailed(boolean hasFailed) {
        this.hasFailed = hasFailed;
    }

    @Override
    public String toString() {
        return "\t\tForm\n" +
                "name =" + name + '\n' +
                "StudentID = " + StudentID +
                "\nattendance = " + attendance +'\n' + hasFailed;
    }
}
