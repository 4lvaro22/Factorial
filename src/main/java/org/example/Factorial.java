package org.example;

public class Factorial {
    public int compute(int number) {
        if((number == 0) || (number == 1)){
            return 1;
        }

        return number * compute(number-1);
    }
}
