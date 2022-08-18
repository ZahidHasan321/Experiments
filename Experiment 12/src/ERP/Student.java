package ERP;

import java.util.Scanner;
public class Student{
    Scanner sc = new Scanner(System.in);

    public void fillUpForm(Form form) {
        System.out.println("Enter student name: ");
        form.setName(sc.nextLine());
        System.out.println("Enter student ID: ");
        form.setStudentID(sc.nextInt());
        sc.nextLine();
        System.out.println("Enter has failed before(Yes/No): ");
        String str = sc.nextLine().toLowerCase();

        form.setHasFailed(str.equals("yes"));
        System.out.println(form.isHasFailed());
        System.out.println("Enter amount to be paid by student(Need to pay 1500): ");
        form.setPaidFees(sc.nextFloat());
        System.out.println("Enter student due: ");
        form.setDue(sc.nextFloat());
    }
}
