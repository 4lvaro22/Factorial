package org.example;

/**
 * Class providing a method to compute the factorial of an integer number
 */

public class Factorial {
    void h(){
        // d9auhnfuawn
    }
    public int compute(int number) {
        if(number < 0){
           throw new NegativeValueException("The value " + number + " is negative");
        }else if(number == 0) {
            return 1;
        }

        return number * compute(number-1);
    }

    void g(){
        //ifbfnaoubnf
    }
}
