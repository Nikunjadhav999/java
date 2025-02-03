package com.wipro.java.oops.polymorphism;
/*
 * @author Nikunj
 */
//extending the superclass
public class BMW extends Car
{
	//print the details of car
	public void showDetails()
	  {
		System.out.println("Details of the BMW car:   Brand:" +getBrand()+"   Model: "+getModel()+"    price:"+getPrice());
	  }
      public static void main(String[] args) 
      {
    	Car c1=new BMW();//create a object of BMW constructor using superclass 
    	c1.setBrand("BMW");//set barnd for car
    	c1.setModel("14V");//set model for car
    	c1.setPrice(230000f);//set price for car
    	c1.showDetails();//print the all details
	}
}
