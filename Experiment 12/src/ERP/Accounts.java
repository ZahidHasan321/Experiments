package ERP;

public class Accounts{
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RED = "\u001B[31m";
    public void checkDue(Form form) throws Exception {
        if(form.getDue() > 0){
            throw new Exception(ANSI_RED + "Has due" + ANSI_RESET);
        }
        else{
            System.out.println(ANSI_GREEN + "Doesn't have any due" + ANSI_RESET);
        }

    }
}
