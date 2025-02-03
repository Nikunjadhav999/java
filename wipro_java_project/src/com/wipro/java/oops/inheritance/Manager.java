package com.wipro.java.oops.inheritance;

/**
 * @author Nikunj
 * 
 * Parent class=Employee
 * Child class= Manager
 * Keyword extends is used to extend the properties of parent class
 */
public class Manager extends Employee //Manager extends the properties of employee class
{

	public Manager() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String a[])
	{
	
	/*Child object is instantiated from child constructor
	*parent class consume the properties &behaviors of child class
	*when we create the object left side should be superclass  
	*/
		
	Employee employee=new Manager();//create the object of manager constructor using the superclass object Employee
	//set the values for Manager
	employee.setEmpID(1);
	employee.setName("Nikunj");
	employee.setSalary(25000f);
	
	//print the Details of Manager
	System.out.println("Details of the Manager");
	System.out.println(employee.getEmpID());
	System.out.println(employee.getName());
	System.out.println(employee.getSalary());
	}

}
