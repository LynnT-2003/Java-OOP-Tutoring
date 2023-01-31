package Quiz2_q3_2022;

public abstract class Circle {

    // 1. Data members
    private double radius = 1.0;
    private String color = "blue";

    // 2. Constructors
    public Circle() {

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }


    // 3. Methods

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return Math.PI * radius* radius;
    }

    public abstract double getVolume();
}
