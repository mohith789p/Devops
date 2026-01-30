package com.demo;

/**
 * Provides basic mathematical operations for integers.
 * @author Mohith
 * @version 1.0
 */
public class Calculator {

    /**
     * Adds two integers.
     * @param a first operand
     * @param b second operand
     * @return the sum of a and b
     */
    public int add(int a, int b) {
        return a + b;
    }

    /**
     * Subtracts the second integer from the first.
     * @param a the value to subtract from
     * @param b the value to subtract
     * @return the difference
     */
    public int subtract(int a, int b) {
        return a - b;
    }

    /**
     * Multiplies two integers.
     * @param a first factor
     * @param b second factor
     * @return the product
     */
    public int multiply(int a, int b) {
        return a * b;
    }

    /**
     * Divides the first integer by the second.
     * @param a the dividend
     * @param b the divisor
     * @return the quotient
     * @throws ArithmeticException if the divisor is zero
     */
    public int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }
}