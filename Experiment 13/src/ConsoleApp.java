import java.util.Arrays;
//5
public class ConsoleApp {
    public static void main(String[] args) throws InterruptedException {
        VcOffice vcOffice = new VcOffice();
        DeanOffice deanOffice = new DeanOffice();
        AcademicCouncilMeeting academicCouncilMeeting = new AcademicCouncilMeeting();

        vcOffice.start();
        vcOffice.join();
        deanOffice.start();
        deanOffice.join();
        academicCouncilMeeting.start();
        academicCouncilMeeting.join();

        System.out.println("Faculty names: " + Arrays.toString((FacultyNames.getFacultyNames())));
    }
}
