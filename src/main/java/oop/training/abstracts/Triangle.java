package oop.training.abstracts;

public class Triangle extends Shape {

    // Fields
    private double base;
    private double height;

    // Constructor
    public Triangle(String name) {
        super(name);
    }

    @Override
    public double calculateArea() {
        field = (base * height)/2;
        return field;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
