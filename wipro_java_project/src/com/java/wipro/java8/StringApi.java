package com.java.wipro.java8;

/**
 * @author Nikunj
 */
public class StringApi 
{
	
	public static void main(String[] args)
	{
		String str="Name abc";//take a string
		System.out.println(str.length());//get the length of string
		System.out.println(str.charAt(2));//checking the chracter is present at given index
		System.out.println(str.substring(1,3));//it shows the substring from index1 to 3
		System.out.println(str.contains("a"));//it returns true if that character is present in string otherwise false
		String[] a=str.split(" ");//split the string whenn space is yet
		for(String str1:a)//for each loop
		{
			System.out.println(str1);//
		}
	
	}

}
