package com.wipro.java.oops;
/**
 * Parent class=Employee
 * Child class=ProjectLead
 * Keyword extends is used to extend the properties of parent class
 */

public class ProjectLead extends Employee //ProjectLead extends the properties of employee class
{

	public ProjectLead() {
		// TODO Auto-generated constructor stub
	}
    public static void main(String[] args) {
		
		/*Child object is instantiated from child constructor
		*parent class consume the properties &behaviors of child class
		*when we create the object left side should be superclass  
		*/
		
		Employee employee=new ProjectLead();//create the object of ProjectLead constructor using the superclass object Employee
		//set the values for ProjectLead
		employee.setEmpID(3);
		employee.setName("Vicky");
		employee.setSalary(50000f);
		
		//print the Details of ProjectLead
		System.out.println("Details of the ProjectLead");
		System.out.println(employee.getEmpID());
		System.out.println(employee.getName());
		System.out.println(employee.getSalary());
	}

}
