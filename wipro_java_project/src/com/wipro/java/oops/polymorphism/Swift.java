package com.wipro.java.oops.polymorphism;
/*
 * @author Nikunj
 */
//extending the superclass
public class Swift extends Car
{
	
 //print the details of car
  public void showDetails()
  {
	System.out.println("Details of the Swift car:   Brand:" +getBrand()+"   Model: "+getModel()+"    price:"+getPrice());
  }
   public static void main(String[] args) 
   {   
    	Car c1=new Swift();//create a object of swift constructor using superclass
    	c1.setBrand("Swift");//set brand of car
    	c1.setModel("dezire");//set model of car
    	c1.setPrice(1000f);//set price of car
    	c1.showDetails();//print all the details
    	
	}

}
