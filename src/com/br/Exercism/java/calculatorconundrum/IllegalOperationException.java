package com.br.Exercism.java.calculatorconundrum;

public class IllegalOperationException extends RuntimeException {
    public IllegalOperationException(String message) {
        super(message);
    }

    public IllegalOperationException(String message, ArithmeticException e) {
        super(message);
    }
}
