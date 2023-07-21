package entities;

public class Rectangle implements Shape {
    private double height;
    private double width;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return height * width;
    }
}
