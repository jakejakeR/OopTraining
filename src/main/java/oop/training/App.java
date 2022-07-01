package oop.training;

import oop.training.converter.ConvertNumberToWords;

public class App {
    public static void main(String[] args) {

        int numberToConvert = 998;
        String convertedNumber = ConvertNumberToWords.convertUpToThreeDigits(numberToConvert);
        System.out.println(numberToConvert + ": " + convertedNumber);
    }
}
