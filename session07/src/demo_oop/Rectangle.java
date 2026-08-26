package demo_oop;

public class Rectangle {
    // Thuộc tính
    double width;
    double height;

    // Constructor
    public Rectangle() {
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Phương thức
    public double getArea() {
        // Diện tích
        return width * height;
    }

    public double getPerimeter() {
        // Chu vi
        return (width + height) * 2;
    }
}
