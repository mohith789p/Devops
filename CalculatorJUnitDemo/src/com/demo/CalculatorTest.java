package com.demo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class CalculatorTest {

    Calculator calc = new Calculator();

    @Test
    public void testAddPositiveNumbers() {
        assertEquals(10, calc.add(5, 5));
    }

    @Test
    public void testAddWithZero() {
        assertEquals(7, calc.add(7, 0));
    }

    @Test
    public void testAddNegativeNumbers() {
        assertEquals(-8, calc.add(-3, -5));
    }

    @Test
    public void testSubtractToZero() {
        assertEquals(0, calc.subtract(5, 5));
    }

    @Test
    public void testSubtractNegativeNumbers() {
        assertEquals(2, calc.subtract(-3, -5));
    }

    @Test
    public void testMultiplyByZero() {
        assertEquals(0, calc.multiply(10, 0));
    }

    @Test
    public void testMultiplyNegativeAndPositive() {
        assertEquals(-20, calc.multiply(-4, 5));
    }

    @Test
    public void testDividePositiveNumbers() {
        assertEquals(2, calc.divide(10, 5));
    }

    @Test
    public void testDivideResultZero() {
        assertEquals(0, calc.divide(0, 5));
    }

    @Test
    void testDivideByZero() {
        assertThrows(ArithmeticException.class, () -> calc.divide(10, 0));
    }
}
