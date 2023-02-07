package org.example;

public class NegativeValueException extends RuntimeException {

    public NegativeValueException(String error) {
        super(error);
    }
}
