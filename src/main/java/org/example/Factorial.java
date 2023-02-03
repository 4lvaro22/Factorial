package org.example;

public class Factorial {
    public int compute(int number) {
        if((number == 0)){
            return 1;
        }

        return number * compute(number-1);
    }
}
