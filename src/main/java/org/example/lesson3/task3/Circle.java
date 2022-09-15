package org.example.lesson3.task3;

public class Circle {
    private Point point;
    private double radius;

    @Override
    public String toString() {
        return "Circle{" +
                "point=" + point +
                ", radius=" + radius +
                '}';
    }

    public Point getPoint() {
        return point;
    }

    public void setPoint(Point point) {
        this.point = point;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle(Point point, double radius) {
        this.point = point;
        this.radius = radius;
    }
}
