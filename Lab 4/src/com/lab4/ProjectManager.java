package com.lab4;

import com.lab4.utility.Date;
import com.lab4.utility.Mediclaim;

public class ProjectManager extends PermanentEmployee {
	
	Mediclaim coverage;

	public ProjectManager(String firstName, String lastName, String grade, double salary, Date joiningDate) {
		super(firstName, lastName, grade, salary, joiningDate);
		coverage.setCoverage(salary);
	}

}
