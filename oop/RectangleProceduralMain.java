package oop;

public class RectangleProceduralMain {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5,8);

        int area = rectangle.calculateArea(rectangle);
        System.out.println("넓이 : " + area);

        int perimeter = rectangle.calculatePerimeter(rectangle);
        System.out.println("둘레 길이 : " + perimeter);

        boolean square = rectangle.isSquare(rectangle);
        System.out.println("정사각형 여부 : " + square);
    }
}
