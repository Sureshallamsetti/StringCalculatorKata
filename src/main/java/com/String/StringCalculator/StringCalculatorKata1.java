package com.String.StringCalculator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Pattern;
import java.util.List;

public class StringCalculatorKata1 {
    public int add(String numbers) {
        if (numbers.isEmpty()) return 0;

        String delimiter = "[,\n" +
                "]";
        if (numbers.startsWith("//")) {
            int delimiterIndex = numbers.indexOf("\n");
            String delimiters = numbers.substring(2, delimiterIndex);
            delimiters = delimiters.replace("[", "").replace("]", "|");
            delimiter = Pattern.quote(delimiters);
            numbers = numbers.substring(delimiterIndex + 1);
        }

        String[] numArray = numbers.split(delimiter);
        int sum = 0;
        List<String> negatives = new ArrayList<>();

        for (String num : numArray) {
            int number = Integer.parseInt(num);
            if (number < 0) {
                negatives.add(num);
            } else if (number <= 1000) {
                sum += number;
            }
        }

        if (!negatives.isEmpty()) {
            throw new IllegalArgumentException("Negatives not allowed: " + String.join((CharSequence) ", ", (CharSequence) Collections.singleton(negatives)));
        }

        return sum;
    }
}
