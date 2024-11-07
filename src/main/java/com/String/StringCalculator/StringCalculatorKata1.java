package com.String.StringCalculator;

import java.util.regex.Pattern;

public class StringCalculatorKata1 {
    public int add(String numbers) {
        if (numbers.isEmpty()) return 0;

        String delimiter = "[,\n" +
                "]";
        if (numbers.startsWith("//")) {
            int delimiterIndex = numbers.indexOf("\n");
            delimiter = Pattern.quote(numbers.substring(2, delimiterIndex));
            numbers = numbers.substring(delimiterIndex + 1);
        }

        String[] numArray = numbers.split(delimiter);
        int sum = 0;

        for (String num : numArray) {
            sum += Integer.parseInt(num);
        }
        return sum;
    }
}
