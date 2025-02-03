package com.wipro.java.oops.Abstraction;
/*
 * @author Nikunj
 */

//Extending the abstract class
public class ElectricCar extends Car
{
	//Implementation of abstract method start
	void start()
	{
		System.out.println("electric car is start by Application");
	}
	
	//Implementation of abstract method stop
	void stop()
	{
		System.out.println("electric car is stopped by Application");
	}

	public static void main(String[] args) 
	{
		//create the object of ElectricCar
      Car electriccar=new ElectricCar();
      electriccar.start();//start method 
      electriccar.stop();//stop method
	}

}
