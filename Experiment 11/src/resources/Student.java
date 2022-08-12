package resources;
//7
import management.Accounts;
import management.ExamController;
import management.RegisterOffice;

public class Student implements Accounts, ExamController, RegisterOffice {
    Student() {}

    public Student(String name, int studentID, boolean hasPaid) {
        this.name = name;
        this.studentID = studentID;
        this.hasPaid = hasPaid;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public boolean isHasPaid() {
        return hasPaid;
    }

    public void setHasPaid(boolean hasPaid) {
        this.hasPaid = hasPaid;
    }

    public boolean isValid() {
        if(!Integer.toString(studentID).isEmpty())
            return true;
        else{
            System.out.println("Student is invalid");
            return false;
        }
    }

    public boolean hasPaidFees() {
        if(isValid()){
            if(hasPaid){
                return true;
            }
            else{
                System.out.println("Student has not paid fees");
            }
        }
        return false;
    }

    public void publishResult() {
        if(hasPaidFees())
            System.out.println("Publish Result");
        else{
            System.out.println("Result not found");
        }
    }

    public void takesRecruitmentExam() {
        System.out.println("Takes admission test");
    }

    private String name;
    private int studentID;

    private boolean hasPaid = true;
}
