package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/*
    Test cases
    1. Factorial de 0 -> 1
    2. Factorial de 1 -> 1
    3. Factorial de 2 -> 2
    4. Factorial de 3 -> 6
    5. Factorial de 4 -> 24
    6. Factorial de 5 -> 120

*/
class FactorialTest {
    @Test
    void factorialOfZeroIsOne(){
        var factorial = new Factorial();
        int obtainedValue = factorial.compute(0);
        int expectedValue = 1;

        assertEquals(expectedValue, obtainedValue);
    }

    @Test
    void factorialOfOneIsOne(){
        var factorial = new Factorial();
        int obtainedValue = factorial.compute(1);
        int expectedValue = 1;

        assertEquals(expectedValue, obtainedValue);
    }

    @Test
    void factorialOfTwoIsTwo(){
        var factorial = new Factorial();
        int obtainedValue = factorial.compute(2);
        int expectedValue = 2;

        assertEquals(expectedValue, obtainedValue);
    }

    @Test
    void factorialOfThreeIsSix(){
        var factorial = new Factorial();
        int obtainedValue = factorial.compute(3);
        int expectedValue = 6;

        assertEquals(expectedValue, obtainedValue);
    }

    @Test
    void factorialOfFiveIs120(){
        var factorial = new Factorial();
        int obtainedValue = factorial.compute(5);
        int expectedValue = 120;

        assertEquals(expectedValue, obtainedValue);
    }
}