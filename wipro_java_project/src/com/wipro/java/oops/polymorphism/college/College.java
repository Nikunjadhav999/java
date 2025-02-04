package com.wipro.java.oops.polymorphism.college;
/*
 * @author Nikunj
 */
public class College {
	//private properties
	private String department;
	private String hod;
	private int Student;
	
	//getter for department
	public String getDepartment() {
		return department;
	}
	
	//setter for department
	public void setDepartment(String department) {
		this.department = department;
	}
	
	//getter for hod
	public String getHod() {
		return hod;
	}
	
	//setter for hod
	public void setHod(String hod) {
		this.hod = hod;
	}
	
	//getter for student
	public int getStudent() {
		return Student;
	}
	
	//setter for student
	public void setStudent(int student) {
		Student = student;
	}

//toString method for easy printing
	@Override
	public String toString() {
		return "College [department=" + department + ", hod=" + hod + ", Student=" + Student + "]";
	}
	//show all the details
	public void showDetails()
	{
		System.out.println("Details of department");
	}
	
}
