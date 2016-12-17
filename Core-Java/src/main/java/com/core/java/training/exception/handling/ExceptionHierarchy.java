package com.core.java.training.exception.handling;


class MyParentException extends Exception {
}

class MyChildException extends MyParentException {
}

class MenuItemNotFoundException extends Exception
{
    
}

class PriceInvalidException extends Exception
{
    
}

public class ExceptionHierarchy {
    
    public static void main(String[] args) {
        try {
            throw new MyChildException();
        } catch (MyChildException s) {
            System.err.println("Caught MyChildException");
        } catch (MyParentException a) {
            System.err.println("Caught MyParentException");
        }
    }
} 