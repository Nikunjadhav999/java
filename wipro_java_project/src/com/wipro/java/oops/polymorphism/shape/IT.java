package com.wipro.java.oops.polymorphism.shape;



public class IT extends College{
	

	
	 public void showDetails()
	  {
		System.out.println("Details of the Student: department: "+ getDepartment()+"  Hod "+ getHod()+"  No Of Students: "+getStudent());
	  }
	   public static void main(String[] args) 
	   {   
	    	College c1=new IT();//create a object of IT constructor using superclass
	    	c1.setDepartment("IT");//
	    	c1.setHod("Prof Sushil");
	    	c1.setStudent(100);
	    	c1.showDetails();//print all the details
	    	
		}
}
