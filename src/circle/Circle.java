package circle;

public class Circle {
    private static final double PI = Math.atan(1);
    private Point center;
    private double radius;

    public Circle(Point center, int radius) {
        this.radius = radius;
        this.center = center;
    }

    public double square() {
        return Circle.PI * radius * radius;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
