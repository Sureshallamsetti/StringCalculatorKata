package com.String.StringCalculator;

// StringCalculatorTest.java
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class StringCalculatorKataTest {

    @Test
    public void testEmptyStringReturnsZero() {
        assertEquals(0, new StringCalculatorKata1().add(""));
    }

    @Test
    public void testSingleNumberReturnsValue() {
        assertEquals(1, new StringCalculator().add("1"));
    }

    @Test
    public void testTwoNumbersReturnSum() {
        assertEquals(3, new StringCalculator().add("1,2"));
    }

    @Test
    public void testMultipleNumbersReturnSum() {
        assertEquals(10, new StringCalculator().add("1,2,3,4"));
    }

    @Test
    public void testNewlineDelimiter() {
        assertEquals(6, new StringCalculator().add("1\n2,3"));
    }

    @Test
    public void testCustomDelimiter() {
        assertEquals(3, new StringCalculator().add("//;\n1;2"));
    }

    @Test
    public void testNegativeNumberThrowsException() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> new StringCalculator().add("1,-2,3"));
        assertEquals("Negatives not allowed: -2", exception.getMessage());
    }
    @Test
    public void testIgnoreNumbersGreaterThan1000() {
        assertEquals(2, new StringCalculator().add("2,1001"));
    }

    @Test
    public void testMultipleDelimiters() {
        assertEquals(6, new StringCalculator().add("//[*][%]\n1*2%3"));
    }

    @Test
    public void testMultipleDelimitersWithDifferentLengths() {
        assertEquals(6, new StringCalculator().add("//[**][%%]\n1**2%%3"));
    }


}
