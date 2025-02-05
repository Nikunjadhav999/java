package com.java.wipro.collections;
import java.util.LinkedList;
import java.util.List;


/**
 * @author Nikunj
 */
public class LinkedListEx 
{
	public static void main(String[] args) 
	{
     //Size of linkedlist
	int n=5;
	//declaring the list with initial size n
	List<Integer> l1=new LinkedList<Integer>();
	//appending the new elements
	//at the end of the list
	//1,2,3,4,5:1
	for(int i=1;i<=n;i++)
	{
		l1.add(i);
	}
	//printing elements
	System.out.println(l1);
	
	//remove element at index 3
	l1.remove(3);//index
	}

}
