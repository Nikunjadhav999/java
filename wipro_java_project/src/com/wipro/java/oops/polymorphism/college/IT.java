package com.wipro.java.oops.polymorphism.college;
/*
 * author Nikunj
 */

//extending the base class
public class IT extends College{
	
	//show the details of department
	 public void showDetails()
	  {
		System.out.println("Details of the Student: department: "+ getDepartment()+"  Hod "+ getHod()+"  No Of Students: "+getStudent());
	  }
	   public static void main(String[] args) 
	   {   
	    	College c1=new IT();//create a object of IT constructor using superclass
	    	c1.setDepartment("IT");//set department 
	    	c1.setHod("Prof Sushil");//set Hod name
	    	c1.setStudent(100);//set No Of students
	    	c1.showDetails();//print all the details
	    	
		}
}
