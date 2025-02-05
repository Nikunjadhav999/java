package com.java.wipro.collections;
import java.util.ArrayList;
import java.util.List;

/**
 @author Nikunj 
 */
public class ListOperations 
{
	public static void main(String[] args) 
	{
		//creating an object of list interface
		//implemented by the arraylist class
		List<Integer> l1=new ArrayList<Integer>();
		
		//Adding elements to objects of list interface
		//custom inputs
		//addition is different fromreplacement
		l1.add(0,1);
		l1.add(1,2);
		l1.add(2,3);
		
		//print the element inside the object
		System.out.println(l1);
		
		//Now creating another object of the list
		//interface implemented Arraylist class
		//declaring object of integer type
		List<Integer> l2= new ArrayList<Integer>();
		
		//Again adding element to object of the list interface
		//custom knputs
		
		l2.add(1);
		l2.add(2);
		l2.add(3);
		
		//will add list l2 from 1 index
		l1.addAll(1,l2);//size or memory is not fixed
		
		System.out.println(l1);
		
		//removes element from index1
		l1.remove(1);
		
		//printing the updated list 1
		System.out.println(l1);
		
		// Sets index 0 value to 5
		l1.set(0,5);
		System.out.println(l1);
	}

}
