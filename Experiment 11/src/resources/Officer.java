package resources;
//4
import management.RegisterOffice;

public class Officer implements RegisterOffice {
    private String name;
    private int officerID;

    @Override
    public void takesRecruitmentExam() {
        System.out.println("Written and Viva");
    }
}
