package ERP;


public class RegisterOffice extends CseOffice {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RED = "\u001B[31m";
    public void checkPrevSem(Form form) throws Exception {

        if (form.isHasFailed()) {
            throw new Exception(ANSI_RED + "Has failed previous semester" + ANSI_RESET);
        } else {
            System.out.println(ANSI_GREEN + "Passed all previous semester" + ANSI_RESET);
        }
    }
}
