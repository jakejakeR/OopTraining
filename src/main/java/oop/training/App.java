package oop.training;

import oop.training.model.Calculator;
import oop.training.model.ScientificCalculator;

public class App
{
    public static void main( String[] args )
    {
        System.out.println(Calculator.add(1,2));
        System.out.println(Calculator.subtract(5,2));

        System.out.println(ScientificCalculator.add(1,2));
        System.out.println(ScientificCalculator.subtract(5,2));
        System.out.println(ScientificCalculator.power(2,3));
    }
}
