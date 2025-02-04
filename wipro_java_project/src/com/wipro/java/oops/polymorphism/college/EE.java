package com.wipro.java.oops.polymorphism.college;
/*
 * @authoe Nikunj
 */
//extending the superclass
public class EE extends College 
{
	//show all the details of department
	 public void showDetails()
	  {
		System.out.println("Details of the Department in college: department:  "+ getDepartment()+"  Hod: "+ getHod()+" No Of Students:"+getStudent());
	  }
	   public static void main(String[] args) 
	   {   
	    	College c1=new EE();//create a object of EE constructor using superclass
	    	c1.setDepartment("EE");// set department 
	    	c1.setHod("Prof Dharmik");//set hod name
	    	c1.setStudent(130);//set no of students
	    	c1.showDetails();//print all the details
	    	
		}

	

}
