//4
public class AcademicCouncilMeeting extends Thread{
    @Override
    public void run() {
        System.out.println("Finalizes names of faculty");
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
