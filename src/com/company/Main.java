package com.company;

public class Main {

    public static void main(String[] args) {
	    Point point = new Point();
        System.out.println(point);
        System.out.println(point.getX());

        point = new Point(2.4f,3.6f);
        System.out.println(point);

        point = new Point(4f,9f);
        System.out.println(point);

        MovablePoint movablePoint = new MovablePoint(2f,3,6,8f);
        System.out.println(movablePoint);

        System.out.println(movablePoint.move());
    }

}
