package oop.training.maps;

import java.util.HashMap;
import java.util.Map;

public class Maps {
    private static final Map<Integer, String> NUMBERS = new HashMap<>();
    private static final String[] NUMBERS_AS_WORDS = {" one", " two", " three", " four", " five", " six", " seven", " eight", " nine", " ten", " eleven", " twelve", " thirteen", " fourteen", " fifteen", " sixteen", " seventeen", " eighteen", " nineteen", " twenty", " thirty", " forty", " fifty", " sixty", " seventy", " eighty", " ninety"};
    private static final Integer[] NUMBERS_ARRAY = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 30, 40, 50, 60, 70, 80, 90};

    private Maps() {
        throw new IllegalStateException("Utility class");
    }

    public static Map<Integer, String> mapNumbers() {
        for (int i = 0; i < NUMBERS_ARRAY.length; i++) {
            NUMBERS.put(NUMBERS_ARRAY[i], NUMBERS_AS_WORDS[i]);
        }
        return NUMBERS;
    }
}
