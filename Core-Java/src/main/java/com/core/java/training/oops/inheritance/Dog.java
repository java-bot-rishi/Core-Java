package com.core.java.training.oops.inheritance;

public class Dog extends Animal
{
    public Dog()
    {
        //super();
        System.out.println("A new dog has been created!");
    }

    @Override
    public void sleep()
    {
        System.out.println("A dog sleeps...");
    }

    @Override
    public void eat()
    {
        System.out.println("A dog eats...");
    }
    
    public void barks()
    {
        System.out.println("The dog barks...");
    }
}