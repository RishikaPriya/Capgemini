package com.lab3;

import com.lab3.utility.Date;

public class Contractor {
	private String contratorName;
	private static int contractEmpCounter = 0;

	{
		contractEmpCounter++;
	}

	public Contractor(String contratorName) {
		this.contratorName = contratorName;
	}

	public class ContractBasedEmployee extends Employee {

		public ContractBasedEmployee(String firstName, String lastName, String grade, double salary, Date joiningDate) {
			super(firstName, lastName, grade, salary, joiningDate);
		}

		public String getContratorName() {
			return Contractor.this.contratorName;
		}

		public int getTotalContractBasedEmployee() {
			return contractEmpCounter;
		}

	}
}
