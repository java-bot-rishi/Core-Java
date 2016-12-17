package com.java.training.keywords;

class EmployeeStaticExample
{
	int empId;
	String empName;
	static String compName = "Leonis Global Ltd.";

	EmployeeStaticExample(int empId, String empName)
	{
		this.empId = empId;
		this.empName = empName;
	}

	void display()
	{
		System.out.println(empId + " " + empName + " " + compName);
	}

	public static void main(String args[])
	{
		Employee employee1 = new Employee(111, "Kiran");
		Employee employee2 = new Employee(222, "Rahul");

		employee1.display();
		employee2.display();
	}
}