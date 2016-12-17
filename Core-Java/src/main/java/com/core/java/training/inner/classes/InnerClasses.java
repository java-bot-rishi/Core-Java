package com.core.java.training.inner.classes;

public class InnerClasses
{
	public void myMethod()
	{
		// Anonymous inner class
		Runnable r = new Runnable()
		{
			public void run()
			{
			}
		};

		// Local inner class
		class LocalClass implements Runnable
		{
			public void run()
			{
			}
		}
	}

	// ... //

	// Inner class
	class InnerClass implements Runnable
	{
		public void run()
		{
		}
	}
}