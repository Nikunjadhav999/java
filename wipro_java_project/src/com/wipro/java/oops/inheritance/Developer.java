package com.wipro.java.oops.inheritance;

/**
 * @author Nikunj
 * 
 * Parent class=Employee
 * Child class=Developer
 * Keyword extends is used to extend the properties of parent class
 */
public class Developer extends Employee//Developer extends the properties of employee class
{

	public Developer() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		
		/*Child object is instantiated from child constructor
		*parent class consume the properties &behaviors of child class
		*when we create the object left side should be superclass  
		*/
		
		Employee employee=new Developer();//create the object of Developer constructor using the superclass object Employee
		//set the values for Developer
		employee.setEmpID(2);
		employee.setName("JOhn");
		employee.setSalary(35000f);
		
		
		//print the Details of Developer
		System.out.println("Details of the Developer");
		System.out.println(employee.getEmpID());
		System.out.println(employee.getName());
		System.out.println(employee.getSalary());
	}

}
