package oop.training;

import oop.training.abstracts.Circle;
import oop.training.abstracts.Triangle;

public class App
{
    public static void main( String[] args ) {

        Triangle triangle = new Triangle("Triangle");

        triangle.setBase(10);
        triangle.setHeight(10);

        System.out.println(triangle.calculateArea());

        Circle circle = new Circle("Circle");

        circle.setDiameter(2 * (1 / Math.sqrt(Math.PI)));

        System.out.println(circle.calculateArea());

    }
}
