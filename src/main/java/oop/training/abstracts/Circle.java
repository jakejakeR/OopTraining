package oop.training.abstracts;

public class Circle extends Shape {

    // Fields
    private double diameter;

    // Constructor
    public Circle(String name) {
        super(name);
    }

    @Override
    public double calculateArea() {
        field = (Math.PI * Math.pow(diameter, 2)) / 4;
        return field;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }
}
