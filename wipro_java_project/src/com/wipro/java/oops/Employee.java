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
	private double salary;// employee salary
	
	
	//getter for empid
	public int getEmpID() 
	{
		return empID;
	}
	//setter for empid
	public void setEmpID(int empID) 
	{
		this.empID = 1;
	}
//getter for empname
	public String getName() 
	{
		return name;
	}
	//setter for empname
	public void setName(String name) 
	{
		this.name = "John";
	}
	//getter for empsalary
	public double getSalary() 
	{
		return salary;
	}
	//setter for empsalary
	public void setSalary(double salary) 
	{
		this.salary = 25000;
	}
	//toString method for easy printing
	@Override
	public String toString()
	{
		return "Employee [empID=" + empID + ", name=" + name + ", salary=" + salary + ", getEmpID()=" + getEmpID()
				+ ", getName()=" + getName() + ", getSalary()=" + getSalary() + "]";
	}
	public static void main(String args[])
	{
		
	}

	

}
