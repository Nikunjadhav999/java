/**
 * 
 */
package com.java.wipro;

/**
 * @author Nikunj
 */
public class Flower {

	/**
	 * 
	 */
	String name;
	String color;
	
	
   Flower(String fname,String fcolor) {
		// TODO Auto-generated constructor stub
	   this.name=fname;
	   this.color=fcolor;
	}
   void display()
   {
	   System.out.println("Flower Name= "+name+" Flower Colour:"+color);
   }

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Flower flowerobj1=new Flower("Rose","Red");
		Flower flowerobj2=new Flower("Lotus","Pink");
		flowerobj1.display();
		flowerobj2.display();
	}

}
