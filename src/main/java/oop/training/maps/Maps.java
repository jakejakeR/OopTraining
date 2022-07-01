package oop.training.maps;

import java.util.HashMap;
import java.util.Map;

public class Maps {

    private static final Map<Integer, String> NUMBERS = new HashMap<>();
    private static final Map<Integer, String> TENS = new HashMap<>();
    private static final Integer[] arrayOfNumbers = new Integer[20];
    private static final Integer[] arrayOfTens = new Integer[10];
    private static final String[] wordsOfNumbers = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
    private static final String[] wordsOfTens = {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};

    private Maps() {
        throw new IllegalStateException("Utility class");
    }

    public static Map<Integer, String> numbers() {
        fillArrayWithNumbers();
        for (int i = 0; i < arrayOfNumbers.length; i++) {
            NUMBERS.put(arrayOfNumbers[i], wordsOfNumbers[i]);
        }
        return NUMBERS;
    }

    public static Map<Integer, String> tens() {
        filArrayWithTens();
        for (int i = 0; i < arrayOfTens.length; i++) {
            TENS.put(arrayOfTens[i], wordsOfTens[i]);
        }
        return TENS;
    }

    private static void fillArrayWithNumbers() {
        for (int i = 0; i < arrayOfNumbers.length; i++) {
            arrayOfNumbers[i] = i;
        }
    }

    private static void filArrayWithTens() {
        for (int i = 0; i < arrayOfTens.length; i++) {
            arrayOfTens[i] = i * 10;
        }
    }


}
