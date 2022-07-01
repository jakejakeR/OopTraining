package oop.training.converter;

import oop.training.maps.Maps;

import java.util.Map;

public class ConvertNumberToWords {

    private static final Map<Integer, String> numbers = Maps.mapNumbers();

    private ConvertNumberToWords() {
        throw new IllegalStateException("Utility class");
    }

    public static String convertUpToThreeDigits(int number) { // 376
        String convertedThreeDigits = "";
        int modNumber = number % 100; // 376 % 100 = 76

        if (modNumber < 10) { // if 16 < 10: false
            convertedThreeDigits += numbers.get(modNumber);
        } else if (modNumber < 20) { // if 16 < 20: false
            convertedThreeDigits += numbers.get(modNumber % 100);
        } else {
            convertedThreeDigits += numbers.get((modNumber / 10) * 10) + numbers.get(modNumber % 10);
        }

        if (number > 99) {
            convertedThreeDigits = numbers.get(number/100) + " hundred" + convertedThreeDigits;
        }

        return convertedThreeDigits;
    }
}
