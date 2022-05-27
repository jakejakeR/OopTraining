package oop.training.model;

public class Calculator {

    Calculator() {
        throw new IllegalStateException("Utility class");
    }

    public static int add(int numberOne, int numberOTwo) {
        return numberOne + numberOTwo;
    }

    public static int subtract(int numberOne, int numberTwo) {
        return numberOne - numberTwo;
    }

}
