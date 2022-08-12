import javax.swing.*;

public class Form {
    private JPanel panelMain;

    public static void main(String[] args) {
        JFrame frame = new JFrame("App");
        frame.setContentPane(new Form().panelMain);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
