package com.java.wipro.interface1;
/*
 * @author Nikunj
 */

//document class implements interface showable &printable
public class Document implements Showable, Printable 
   {    
	//print method
    public void print() 
    {
        System.out.println("print");
    }
    //show method
    public void show() 
    {
        System.out.println("show");
    }
    public static void main(String[] args) 
    {
        Document doc1 = new Document();//creating a object
        doc1.show();//calling show method
        doc1.print();//calling print method
    }
}
