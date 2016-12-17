package com.core.java.training.oops.inheritance;

public class InheritanceExample
{
    public static void main(String[] args)
    {
        Animal animal = new Animal();
        Bird bird = new Bird();
        Dog dog = new Dog();

        System.out.println();

        animal.sleep();
        animal.eat();

        bird.sleep();// method overriding.
        bird.eat();
        bird.flies();

        dog.sleep();
        dog.eat();
        dog.barks();
        
//        Animal a = new Dog();
//        a.sleep();
    }
}

// Work:
/**
 * Go ahead and add one more class of animal called "Fish"
 * Add attributes that you think Fish has.
 * In the InheritanceExample, go ahead and modify the program to create a fish object and print its attributes.
 */
