package resources;
//6
import management.RegisterOffice;

public class Teacher implements RegisterOffice {
    private String name;
    private int teacherID;

    public void takesRecruitmentExam() {
        System.out.println("Viva");
    }
}
