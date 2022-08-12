//2
public class VcOffice extends Thread{
    @Override
    public void run() {
        System.out.println("VC office asks for the faculty names");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
