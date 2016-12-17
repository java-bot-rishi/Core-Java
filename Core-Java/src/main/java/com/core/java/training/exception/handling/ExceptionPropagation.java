package com.core.java.training.exception.handling;

import java.io.IOException;

class ExceptionPropagation
{
	void m() throws IOException
	{
		throw new java.io.IOException("device error");// checked exception
	}

	void n() throws IOException
	{
		m();
	}

	void p()
	{
		try
		{
			n();
		} catch (Exception e)
		{
			System.out.println("exception handled");
		}
	}

	public static void main(String args[])
	{
		ExceptionPropagation obj = new ExceptionPropagation();
		obj.p();
		System.out.println("normal flow");
	}
}