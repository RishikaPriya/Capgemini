package com.lab3;

import com.lab3.utility.Date;

public class PermanentEmployee extends Employee {
	
	private static int permanentEmpCounter = 0;
	
	{
		permanentEmpCounter++;
	}

	public PermanentEmployee(String firstName, String lastName, String grade, double salary, Date joiningDate) {
		super(firstName, lastName, grade, salary, joiningDate);
	}
	
	public int getTotalPermanentBasedEmployee(){
		return permanentEmpCounter;
	}
	
}
