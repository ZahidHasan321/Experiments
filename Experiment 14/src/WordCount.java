import Threads.Paragraph;
import Threads.Thread1;
import Threads.Thread2;
import Threads.Thread3;

public class WordCount {
    public static void main(String[] args) throws InterruptedException {
        int totalLength;

        Thread1 thread1 = new Thread1();
        Thread2 thread2 = new Thread2();
        Thread3 thread3 = new Thread3();
        Thread myThread1 = new Thread(thread1);
        Thread myThread2 = new Thread(thread2);
        Thread myThread3 = new Thread(thread3);

        myThread1.start();
        myThread1.join();

        myThread2.start();
        myThread2.join();

        myThread3.start();
        myThread3.join();

        System.out.println(thread1.getCounter());
        System.out.println(thread2.getCounter());
        System.out.println(thread3.getCounter());

        System.out.println("Total number of word: " + (thread1.getCounter() + thread2.getCounter() + thread3.getCounter()));
    }
}
