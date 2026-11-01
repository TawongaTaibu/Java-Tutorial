package com.ttaibu.intro;

import java.math.BigDecimal;

public class Employee extends Person {
	
	private String taxpayerIdNumber;
	private String employeeNumber;
	private BigDecimal salary;
	
	public Employee() {
		super();
	}
	
	public Employee(String firstName, String lastName, int age, int height, int weight, String eyeColor, String gender) {
		super(firstName, lastName, age , height, weight, eyeColor, gender);
	}
	
	public Employee(String firstName, String lastName, int age, int height, int weight, String eyeColor,
			String gender, String taxpayerIdNumber, String employeeNumber, BigDecimal salary) {
		super(firstName, lastName, age, height, weight, eyeColor, gender);
		this.taxpayerIdNumber = taxpayerIdNumber;
		this.employeeNumber = employeeNumber;
		this.salary = salary;
	}
	
	public String getTaxpayerIdNumber() {
		return taxpayerIdNumber;
	}

	public void setTaxpayerIdNumber(String taxpayerIdNumber) {
		this.taxpayerIdNumber = taxpayerIdNumber;
	}

	public String getEmployeeNumber() {
		return employeeNumber;
	}

	public void setEmployeeNumber(String employeeNumber) {
		this.employeeNumber = employeeNumber;
	}

	public BigDecimal getSalary() {
		return salary;
	}

	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}
	/*The call to super.printAudit() doesn't need to be first, it just seemed like a good idea,
- to print those attributes first. In fact, you don't need to call super.printAudit() at all. If you don't call
- the super.printAudit(), you must format the attributes from Person yourself in the Employee.printAudit() method, or they
- wont be included in the audit output.*/
	
	/*I recommend always implementing toString() in your classes, if only for support purposes.It's virtually inevitable that
- at some point, you'll want to see what an object's state is while your application is running and toString() is a great hook for doing that
	 */
	@Override
	public void printAudit(StringBuilder buffer) {
		// 1. First, call super to print all the Person attributes
		super.printAudit(buffer);
		
		// 2. Then, append a comma and the Employee-specific attributes
		buffer.append(",");
		buffer.append("Employee Number = ");
		buffer.append(getEmployeeNumber());
		buffer.append(",");
		buffer.append("Taxpayer ID = ");
		buffer.append(getTaxpayerIdNumber());
		buffer.append(",");
		buffer.append("Salary = ");
		buffer.append(getSalary());
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((employeeNumber == null) ? 0 : employeeNumber.hashCode());
		result = prime * result + ((salary == null) ? 0 : salary.hashCode());
		result = prime * result + ((taxpayerIdNumber == null) ? 0 : taxpayerIdNumber.hashCode());
		return result;
	}

	
	//Generating an Equals for Employee
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (employeeNumber == null) {
			if (other.employeeNumber != null)
				return false;
		} else if (!employeeNumber.equals(other.employeeNumber))
			return false;
		if (salary == null) {
			if (other.salary != null)
				return false;
		} else if (!salary.equals(other.salary))
			return false;
		if (taxpayerIdNumber == null) {
			if (other.taxpayerIdNumber != null)
				return false;
		} else if (!taxpayerIdNumber.equals(other.taxpayerIdNumber))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return super.toString() + "Employee [taxpayerIdNumber=" + taxpayerIdNumber + ", employeeNumber=" + employeeNumber + ", salary=" + salary + "]";
	}
	
}

