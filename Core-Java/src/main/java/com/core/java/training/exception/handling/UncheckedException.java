package com.core.java.training.exception.handling;


public class UncheckedException {

    public static void main(String[] args)  {
        // ArithmeticException does not to be handled
        // because it is a unchecked exception
        throw new ArithmeticException();        
    }

}
