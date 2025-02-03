package com.wipro.java.oops.Abstraction;
/*
 * @author Nikunj
 */

//Extending the abstract class

public class DieselCar extends Car
{
	//Implementation of abstract method start
	void start()
	{
		System.out.println("Diesel car is start by key");
	}
	//Implementation of abstract method stop
	void stop()
	{
		System.out.println("Diesel car is stopped by kay");
	}
	public static void main(String[] args) 
	{
		//create the object of ElectricCar
	   	Car dieselcar=new DieselCar();
	      dieselcar.start();//start method
	      dieselcar.stop();//stop method
	}
}
