/**
 * 
 */
package com.wipro.java.oops;

/**
 * @author Nikunj
 */
//Parent class employee
public class Employee 
{
	private int empID;//employee Id
	private String name;//employee name
	private float salary;// employee salary
	
	
	//getter for empID
	public int getEmpID() {
		return empID;
	}


    //setter for empID 
	public void setEmpID(int empID) {
		this.empID = empID;
	}


    //getter for empName
	public String getName() {
		return name;
	}


    //setter for empName
	public void setName(String name) {
		this.name = name;
	}


    //getter for empSalary
	public float getSalary() {
		return salary;
	}


    //setter for empSalary
	public void setSalary(float salary) {
		this.salary = salary;
	}



	//toString method for easy printing
	@Override
	public String toString()
	{
		return "Employee [empID=" + empID + ", name=" + name + ", salary=" + salary + ", getEmpID()=" + getEmpID()
				+ ", getName()=" + getName() + ", getSalary()=" + getSalary() + "]";
	}
	
}
