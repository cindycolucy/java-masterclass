package com.colucy;

public class Main {

    public static void main(String[] args) {
	    Point point1 = new Point(6, 5);
	    Point point2 = new Point(3, 1);

        System.out.println("Distance (0, 0) = " + point1.distance());
        System.out.println("Distance (point2) = " + point1.distance(point2));
        System.out.println("Distance (2, 2) = " + point1.distance(2, 2));

        Point point  = new Point();
        System.out.println("Distance () = " + point.distance());
    }
}
