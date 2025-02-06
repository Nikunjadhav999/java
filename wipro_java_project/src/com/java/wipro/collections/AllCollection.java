package com.java.wipro.collections;

/**
 * 
 */
import java.util.*;

public class AllCollection 
{
    public static void main(String[] args) 
    {
    	System.out.println("*************** ARRAY ***************");
        // *************** ARRAY ***************
    	        //declares an array of integers.
    			int[] arr;
    			//allocating memory for 5 integers
    			arr=new int[5];// 0,1,2,3,4 index format
    			
    			//initialize the first element of the array
    			arr[0]=10;
    			//0:address,10 value
    			
    			//initialize the second element of the array
    			arr[1]=20;
    			
    			//so on......
    			arr[2]=30;
    			arr[3]=40;
    			arr[4]=50;
    			
    			//accessing the elements of the specified array
    			//0 to n-1th index,n=size of the array
    			for(int i=0;i<arr.length;i++)
    			{
    				System.out.println("Element at index "+ i +" : "+arr[i]);
    			}

    			System.out.println("*************** LISTS ***************");
        // *************** LISTS ***************
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
    			
    			System.out.println(" *************** LinkedList ***************");
    	// *************** LinkedList ***************	
    			
    			 //Size of linkedlist
    			int n=5;
    			//declaring the list with initial size n
    			List<Integer> l2=new LinkedList<Integer>();
    			//appending the new elements
    			//at the end of the list
    			//1,2,3,4,5:1
    			for(int i=1;i<=n;i++)
    			{
    				l2.add(i);
    			}
    			//printing elements
    			System.out.println(l2);
    			
    			System.out.println("***************Map ***************");
    	//***************Map ***************	
    			//create a hashmap where integer is the key and string is the value
    			Map<Integer, String> map =new HashMap<>();
    			
    			//Adding key-value pairs to the map
    			map.put(1, "Apple");
    			map.put(2, "Banana");
    			map.put(3, "Cherry");
    			
    			//Accessing values by key
    			System.out.println("Key 1: "+map.get(1));
    			System.out.println("Key 2: "+map.get(2));
    			System.out.println("Key 3: "+map.get(3));
    }
}

