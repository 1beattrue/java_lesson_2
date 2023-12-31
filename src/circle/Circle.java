package circle;

import java.util.Objects;

public class Circle {
    private Point center;
    private double radius;

    public Circle(Point center, int radius) {
        this.radius = radius;
        this.center = center;
    }

    public double square() {
        return Circle.PI * radius * radius;
    }

    public double circumference() {
        return Circle.PI * 2 * radius;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Double.compare(radius, circle.radius) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(radius);
    }

    private static final double PI = Math.atan(1) * 4;
}
