package com.demo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class CalculatorTest {

	Calculator calc = new Calculator();

    // 1. Add two positive numbers
    @Test
    public void testAddPositiveNumbers() {
        assertEquals(10, calc.add(5, 5));
    }

    // 2. Add with zero
    @Test
    public void testAddWithZero() {
        assertEquals(7, calc.add(7, 0));
    }

    // 3. Add two negative numbers
    @Test
    public void testAddNegativeNumbers() {
        assertEquals(-8, calc.add(-3, -5));
    }

    // 4. Subtract resulting in zero
    @Test
    public void testSubtractToZero() {
        assertEquals(0, calc.subtract(5, 5));
    }

    // 5. Subtract negative numbers
    @Test
    public void testSubtractNegativeNumbers() {
        assertEquals(2, calc.subtract(-3, -5));
    }

    // 6. Multiply by zero
    @Test
    public void testMultiplyByZero() {
        assertEquals(0, calc.multiply(10, 0));
    }

    // 7. Multiply negative and positive
    @Test
    public void testMultiplyNegativeAndPositive() {
        assertEquals(-20, calc.multiply(-4, 5));
    }

    // 8. Divide positive numbers
    @Test
    public void testDividePositiveNumbers() {
        assertEquals(2, calc.divide(10, 5));
    }

    // 9. Divide resulting in zero
    @Test
    public void testDivideResultZero() {
        assertEquals(0, calc.divide(0, 5));
    }

    // 10. Divide by zero (exception case)    
    @Test
    void testDivideByZero() {
        assertThrows(ArithmeticException.class, () -> {
            calc.divide(10, 0);
        });
    }
}
