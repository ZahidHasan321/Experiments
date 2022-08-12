import java.util.Scanner;

public class TestApp {
    public static void main(String[] args) {
        App app = new App();
        Scanner sc = new Scanner(System.in);
        int menu = sc.nextInt();
        while(menu > 0 && menu < 5) {
            switch (menu) {
                case 1:
                    app.checkAnswer();
                    break;
                case 2:
                    app.extractString();
                    break;
                case 3:
                    app.countOccurrences();
                    break;
                case 4:
                    app.sortString();
                    break;
                default:
                    System.out.println("ERROR!!Input a number between 1 and 4");
            }
            menu = sc.nextInt();
        }
    }
}
