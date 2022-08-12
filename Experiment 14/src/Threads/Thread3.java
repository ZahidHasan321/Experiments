package Threads;
import static Threads.Paragraph.para2;
import static Threads.Paragraph.para3;

public class Thread3 implements Runnable{
    int counter = 0;
    boolean flag = false;

    @Override
    public void run() {
        for(int i = 0; i < para3.length(); i++){

            if(Character.isLetter(para3.toLowerCase().charAt(i)))
            {
                flag = true;
                continue;
            }
            if((!(Character.isLetter(para3.toLowerCase().charAt(i))) && flag) || (i == para3.length()-1 && Character.isLetter(para3.toLowerCase().charAt(i)))){
                counter++;
                flag = false;
            }
        }
    }

    public int getCounter() {
        return counter;
    }
}
