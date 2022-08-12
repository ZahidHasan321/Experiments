//3
public class DeanOffice extends Thread{
    @Override
    public void run() {
        System.out.println("Performs meeting with faculty member");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
