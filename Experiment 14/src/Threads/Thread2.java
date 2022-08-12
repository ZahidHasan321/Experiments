package Threads;

import static Threads.Paragraph.*;

public class Thread2 implements Runnable{
    int counter = 0;
    boolean flag = false;

    @Override
    public void run() {
        for(int i = 0; i < para2.length(); i++){

            if(Character.isLetter(para2.toLowerCase().charAt(i)))
            {
                flag = true;
                continue;
            }
            if((!(Character.isLetter(para2.toLowerCase().charAt(i))) && flag) || (i == para2.length()-1 && Character.isLetter(para2.toLowerCase().charAt(i)))){
                counter++;
                flag = false;
            }
        }
    }

    public int getCounter() {
        return counter;
    }
}
