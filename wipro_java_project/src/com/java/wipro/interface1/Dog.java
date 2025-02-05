package com.java.wipro.interface1;
/*
 * @author Nikunj
 */


//Dog class implementing Animal interface

class Dog implements Animal
  { 
	public void makeSound() 
	{
     System.out.println("bark");
    }
	public static void main(String[] args)
	{
	     // Creating objects Dog
	     Animal dog = new Dog();
	     // Calling makeSound() method
	     dog.makeSound(); 
	}
}
