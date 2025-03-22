package oop;

public class Rectangle {
    int width;
    int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int calculateArea(Rectangle rectangle) {
        return rectangle.width * rectangle.height;
    }

    public int calculatePerimeter(Rectangle rectangle) {
        return 2 * (rectangle.width + rectangle.height);
    }

    public boolean isSquare(Rectangle rectangle) {
        return rectangle.width == rectangle.height;
    }
}
