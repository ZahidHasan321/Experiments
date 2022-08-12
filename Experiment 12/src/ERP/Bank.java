package ERP;

import java.util.Scanner;

public class Bank{
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RED = "\u001B[31m";
    Scanner sc = new Scanner(System.in);
    private float examFees;
    public void setExamFees(float examFees) {
        this.examFees = examFees;
    }

    public void checkFees(Form form) throws Exception {
        System.out.printf("Enter the amount of Exam Fees: ");
        setExamFees(sc.nextFloat());

        if(form.getPaidFees() < examFees){
            throw new Exception(ANSI_RED + "Has not paid fees" + ANSI_RESET);
        }
        else {
            System.out.println(ANSI_GREEN + "Has paid fees" + ANSI_RESET);
        }
    }
}
