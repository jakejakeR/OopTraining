package oop.training.abstracts;

public abstract class Shape {

    private String name;
    public double field;

    protected Shape(String name) {
        this.name = name;
    }

    public abstract double calculateArea();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
