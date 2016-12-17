package com.core.java.training.oops.inheritance;

public final class PolymorphismExample
{
    public static void main(String args[])
    {
       
        Animal animal1 = new Dog();
        animal1.sleep();
        //((Dog)animal1).barks();
        
        Animal animal2 = new Bird();
        animal2.sleep();
        
        printAnimalInformation((Dog)animal1);
        printAnimalInformation((Bird)animal2);
    }
    
    private static void printAnimalInformation(final Dog dog)
    {
        dog.eat();
        dog.barks();
    }
    
    private static void printAnimalInformation(final Bird bird)
    {
        bird.eat();
        bird.flies();
    }
}