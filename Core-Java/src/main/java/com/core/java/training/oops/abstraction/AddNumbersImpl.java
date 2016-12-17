package com.core.java.training.oops.abstraction;

public final class AddNumbersImpl implements AddNumbers
{

	@Override
	public int addNumbers(int... numbers)
	{		
		if(numbers.length == 2)
		{
			return Math.addExact(numbers[0], numbers[1]);
		}
		
		if(numbers.length > 2)
		{
			for(Integer number : numbers)
			{
				return number += number;
			}
		}
		
		return 0;		
	}
	
}