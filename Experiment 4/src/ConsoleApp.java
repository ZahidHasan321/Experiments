public class ConsoleApp {
    public static void main(String[] args) {
        Area findArea = new Area();

        System.out.println("Area of Triangle: " + findArea.area(3,4,5));

        System.out.println("Area of Rectangle: " + findArea.area(3,4,3, 4));

        System.out.println("Area of Square: " + findArea.area(5,5,5,5));

        System.out.println("Area of Circle: " + findArea.area(5));
    }
}
