package com.java.training.keywords;

/**
 * Demonstrates this keyword.
 */
class Employee
{
	int id;
	String name;
	String city;

	Employee(int id, String name)
	{
		this.id = id;
		this.name = name;
	}

	Employee(int id, String name, String city)
	{
		this(id, name);// now no need to initialize id and name
		this.city = city;
	}

	void display()
	{
		System.out.println(id + " " + name + " " + city);
	}

	public static void main(String args[])
	{
		Employee e1 = new Employee(222, "Dinesh");
		Employee e2 = new Employee(555, "Anamika", "Noida");
		e1.display();
		e2.display();
	}
}