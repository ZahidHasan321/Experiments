package ERP;

import java.util.Scanner;

//2
public class CseOffice{
     public static final String ANSI_RESET = "\u001B[0m";
     public static final String ANSI_GREEN = "\u001B[32m";
     public static final String ANSI_RED = "\u001B[31m";
     Scanner sc = new Scanner(System.in);


     public void putAttendance(Form form) throws Exception {
          System.out.println("Enter student attendance percentage: " + ANSI_RESET);
          form.setAttendance(sc.nextInt());
          if(form.getAttendance() < 70){
               throw new Exception(ANSI_RED + "Insufficient Attendance" + ANSI_RESET);
          }
     }

     public static void getForm(Form form){
          System.out.println("Cse office has the form!");
          System.out.println(form);
     }
}
