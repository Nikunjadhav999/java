package com.java.wipro.interface1;
/*
 * @author Nikunj
 */

//Cow implementing Animal interface
class Cow implements Animal 
   {
      public void makeSound() 
      {
    	  System.out.println("Humba!");
      }
      public static void main(String[] args) {
    	     // Creating objects of Cow 
    	     Animal myCow = new Cow();
    	     // Calling makeSound() method
    	     myCow.makeSound(); 
    	    
    	
    	}
}
