package com.core.java.training.oops.encapsulation;

public final class EncapsulationExample
{
    public static void main(String args[])
    {
        Addition add = new Addition();
        add.add(2, 4, 6);
        //add.totalValue = 9;// defect
        System.out.println("Total added value:" + add.getAddedValues());
    }
}