package Lesson17.Lesson17Son;

import Lesson17.Shape;

public class TestShape {
    public static void main(String[] args) {
        Shape s1 = new Shape("red", true);
        System.out.println(s1);

        Shape s2 = new Circle(3.0);
        System.out.println(s2);

        Shape s3 = new Rectangle(2, 4);
        System.out.println(s3);

        Shape s4 = new Square(4);
        System.out.println(s4);
    }
}
