package com.lab2.test;

import com.lab2.Employee;
import com.lab2.utility.Date;

public class Test {
	public static void main(String[] args) {
		Employee emp = new Employee("Vivek", "Sharma", "BA3", 57526.50,new Date(28,12,2012));
		emp.displayEmployee();
	}
}
