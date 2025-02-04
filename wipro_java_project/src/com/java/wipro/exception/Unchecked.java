package com.java.wipro.exception;
/*
 * @author Nikunj
 */

//Checked at runtime
public class Unchecked 
{
    public static void main(String[] args)
    {
        try 
        {
            String str = null;
            System.out.println(str.length());
        } 
        catch (NullPointerException e)
        {
            System.out.println(" NullPointerException!");
        }

        try 
        {
            int[] arr = new int[2];
            System.out.println(arr[3]);
        }
        catch (ArrayIndexOutOfBoundsException e) 
        {
            System.out.println("ArrayIndexOutOfBoundsException!");
        }

        try
        {
            int result = 10 / 0;
        } 
        catch (ArithmeticException e)
        {
            System.out.println("ArithmeticException!");
        }
    }
}

