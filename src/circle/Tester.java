package circle;

public class Tester {
    // Задания 3, 6
    public static void main(String[] args) {
        Circle circle = new Circle(new Point(0, 0), 1);
        System.out.println(circle.square());
        Circle circle1 = new Circle(new Point(1, 4), 1);
        System.out.println(circle.equals(circle1));
    }
}
