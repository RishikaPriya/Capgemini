package com.lab4;

import com.lab4.utility.Date;

public class Employee {
	private String firstName, lastName, grade;
	private double salary;
	private int empId;
	private static int empIdCounter = 1000;
	private static int empCounter = 0;
	private Date joiningDate;

	{
		Employee.empCounter++;
	}

	public Employee(String firstName, String lastName, String grade, double salary, Date joiningDate) {
		this.empId = ++empIdCounter;
		this.firstName = firstName;
		this.lastName = lastName;
		this.grade = grade;
		this.salary = salary;
		this.joiningDate = joiningDate;
	}

	public static int getCounter() {
		return empCounter;
	}

	public void displayEmployee() {
		System.out.println("Number of Employee: " + empCounter);
		System.out.println(
				empId + "\t" + firstName + "\t" + lastName + "\t" + grade + "\t" + salary + "\t" + joiningDate.getDd() + "\\" + joiningDate.getMm() + "\\" + joiningDate.getYy());
	}
}