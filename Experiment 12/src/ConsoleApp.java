import ERP.*;

//7
public class ConsoleApp {
    public static void main(String[] args){
        Form form = new Form();
        CseOffice cseOffice = new CseOffice();
        Student student = new Student();
        RegisterOffice registerOffice = new RegisterOffice();
        Accounts accounts = new Accounts();
        Bank bank = new Bank();
        ExamController examController = new ExamController();

        try {
            student.fillUpForm(form);
            cseOffice.putAttendance(form);
            registerOffice.checkPrevSem(form);
            accounts.checkDue(form);
            bank.checkFees(form);
            examController.generateAdmitCard(form);
        }
        catch (Exception e){
            System.err.println(e.getMessage());
        }
    }

}
