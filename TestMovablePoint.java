package Lesson17.Lesson17Son;

import Lesson17.Point;

public class TestMovablePoint {
    public static void main(String[] args) {
        Point p1 = new Point(1, 2);
        System.out.println(p1);

        MovablePoint m1 = new MovablePoint(3, 4);
        System.out.println(m1);
        System.out.println(m1.move());
    }
}
