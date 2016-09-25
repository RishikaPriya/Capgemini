package com.lab4;

import com.lab4.utility.Date;
import com.lab4.utility.Mediclaim;

public class TechnicalAssistant extends PermanentEmployee {

	Mediclaim coverage;
	
	public TechnicalAssistant(String firstName, String lastName, String grade, double salary, Date joiningDate) {
		super(firstName, lastName, grade, salary, joiningDate);
		coverage.setCoverage(2*salary);
	}

}
