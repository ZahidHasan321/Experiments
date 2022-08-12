package Threads;

import java.io.EOFException;

import static Threads.Paragraph.*;

public class Thread1 implements Runnable{
    int counter = 0;
    boolean flag = false;
    @Override
    public void run() {
        for(int i = 0; i < para1.length(); i++){

            if(Character.isLetter(para1.toLowerCase().charAt(i)))
            {
                flag = true;
                continue;
            }
            if((!(Character.isLetter(para1.toLowerCase().charAt(i))) && flag) || (i == para1.length()-1 && Character.isLetter(para1.toLowerCase().charAt(i)))){
                counter++;
                flag = false;
            }
        }
    }

    public int getCounter() {
        return counter;
    }
}
