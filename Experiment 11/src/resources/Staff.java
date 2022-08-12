package resources;
//5
import management.RegisterOffice;

public class Staff implements RegisterOffice {
    private String name;
    private int staffID;

    public void takesRecruitmentExam() {
        System.out.println("Written,Viva & practical exam");
    }
}
