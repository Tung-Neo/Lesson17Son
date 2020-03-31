package Lesson17.Lesson17Son;

import Lesson17.Point2D;

public class TestPoint2DPoint3D {
    public static void main(String[] args) {
        Point2D p2a = new Point2D();
        System.out.println(p2a);

        Point2D p2b = new Point2D(1, 2);
        System.out.println(p2b);

        Point3D p3a = new Point3D();
        System.out.println(p3a);

        Point3D p3b = new Point3D(3, 4, 5);
        System.out.println(p3b);
    }
}
