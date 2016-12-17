package com.core.java.training.oops.encapsulation;

public final class Addition
{
    private int totalValue = 0;
    
    public void add(int ... numbers)
    {
        int addedValue = 0;
        for(int number :  numbers)
        {
            addedValue = number + addedValue;
        }
        
        this.totalValue = addedValue;
    }
    
    public int getAddedValues()
    {
        return totalValue;
    }    
}