public class TestApp {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println(calculator.sum(6,7));
        System.out.println(calculator.sum(5.6, 6.5));
        System.out.println(calculator.sum("7", "8"));
        System.out.println(calculator.sum(5,6,7));
    }
}
