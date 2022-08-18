package ERP;

public class ExamController{
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public void generateAdmitCard(Form form){
        System.out.println(ANSI_GREEN + "Admit card generated" + ANSI_RESET);
        CseOffice.getForm(form);
    }
}
