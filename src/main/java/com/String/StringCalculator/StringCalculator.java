package com.String.StringCalculator;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class StringCalculator {
    public int add(String numbers) {
        if (numbers.isEmpty()) {
            return 0;
        }

        String delimiter = getDelimiter(numbers);
        numbers = sanitizeInput(numbers);

        return calculateSum(numbers.split(delimiter));
    }

    private String getDelimiter(String numbers) {
        if (numbers.startsWith("//")) {
            int delimiterIndex = numbers.indexOf("\n");
            return Pattern.quote(numbers.substring(2, delimiterIndex));
        }
        return ",|\n";
    }

    private String sanitizeInput(String numbers) {
        if (numbers.startsWith("//")) {
            int delimiterIndex = numbers.indexOf("\n");
            return numbers.substring(delimiterIndex + 1);
        }
        return numbers;
    }

    private int calculateSum(String[] numbersArray) {
        int sum = 0;
        List<String> negatives = new ArrayList<>();

        for (String num : numbersArray) {
            int number = Integer.parseInt(num);
            if (number < 0) {
                negatives.add(num);
            }
            sum += number;
        }

        if (!negatives.isEmpty()) {
            throw new IllegalArgumentException("Negative numbers not allowed: " + String.join(", ", negatives));
        }

        return sum;
    }
}
