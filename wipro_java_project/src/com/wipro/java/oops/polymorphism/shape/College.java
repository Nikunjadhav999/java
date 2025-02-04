package com.wipro.java.oops.polymorphism.shape;
/*
 * @author Nikunj
 */
public class College {
	//private properties
	private String department;
	private String hod;
	private int Student;
	
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getHod() {
		return hod;
	}
	public void setHod(String hod) {
		this.hod = hod;
	}
	public int getStudent() {
		return Student;
	}
	public void setStudent(int student) {
		Student = student;
	}


	@Override
	public String toString() {
		return "College [department=" + department + ", hod=" + hod + ", Student=" + Student + "]";
	}
	
	public void showDetails()
	{
		System.out.println("Details of department");
	}
	
}
