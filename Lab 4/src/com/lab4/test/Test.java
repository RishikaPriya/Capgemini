package com.lab4.test;

import com.lab4.Contractor;
import com.lab4.Contractor.ContractBasedEmployee;
import com.lab4.PermanentEmployee;
import com.lab4.utility.Date;

public class Test {
	public static void main(String[] args) {
		
		PermanentEmployee emp1 = new PermanentEmployee("Vivek", "Sharma", "BA3", 57526.50, new Date(28, 12, 2012));
		emp1.displayEmployee();
		System.out.println(emp1.getTotalPermanentBasedEmployee());
		
		Contractor contrator1 = new Contractor("Mr. Smith");
		
		ContractBasedEmployee emp2 = contrator1.new ContractBasedEmployee("Rohan", "Anand", "BA3", 57526.50, new Date(28, 12, 2012));
		emp2.displayEmployee();
		System.out.println(emp2.getTotalContractBasedEmployee() + "\n" + emp2.getContratorName());
	}
}
