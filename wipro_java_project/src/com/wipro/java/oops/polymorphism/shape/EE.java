package com.wipro.java.oops.polymorphism.shape;

public class EE extends College 
{
	 public void showDetails()
	  {
		System.out.println("Details of the Department in college: department:  "+ getDepartment()+"  Hod: "+ getHod()+" No Of Students:"+getStudent());
	  }
	   public static void main(String[] args) 
	   {   
	    	College c1=new EE();//create a object of EE constructor using superclass
	    	c1.setDepartment("EE");//
	    	c1.setHod("Prof Dharmik");
	    	c1.setStudent(130);
	    	c1.showDetails();//print all the details
	    	
		}

	

}
