package com.java.wipro.java8;

//@author Nikunj

@FunctionalInterface
interface Shape1 {
    // Abstract method
    double getArea();

    // Default method1
    default String getDescription() {
        return "This is a shape.";
    }
  //Default method2
    default void display() {
        System.out.println("Displaying the shape.");
    }

    // Static method1
    static String getAuthor() {
        return "Nikunj";
    }
    //static method2
    static void printVersion() {
        System.out.println("Shape Version 1.0");
    }
}

class Shape implements Shape1 
{
	//private properties
    private double length;//length 
    private double width;//width

    //constructor
    public Shape(double length, double width) 
    {
        this.length = length;
        this.width = width;
    }

    //getter for Area
    public double getArea() {
        return length * width;
    }

    //getter for description
    public String getDescription() {
        return "This is a rectangle.";
    }
   
    //main method
    public static void main(String[] args) 
    {
        Shape rectangle = new Shape(10, 5);//give values of length and width
        System.out.println("Area: " + rectangle.getArea());//get area
        System.out.println("Description: " + rectangle.getDescription());//get description
        rectangle.display();//display the shape
        System.out.println("Author: " + Shape1.getAuthor());//display the author
        Shape1.printVersion();//display version of rectangle
    }
}

