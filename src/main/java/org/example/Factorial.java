package org.example;

/**
 * Class providing a method to compute the factorial of an integer number
 * @author Alvaro Portales Luna
 * */

public class Factorial {
    public int compute(int number) {
        if(number < 0){
           throw new NegativeValueException("The value " + number + " is negative");
        }else if(number == 0) {
            return 1;
        }

        return number * compute(number-1);
    }
}
