package com.java.wipro.collections;

/**
 *@author Nikunj 
 */
public class Array 
{
	public static void main(String[] args) 
	{
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
	}
}
