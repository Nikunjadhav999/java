/**
 * 
 */
package com.java.wipro.exception;

/**
 * @author Nikunj
 */
import java.util.Scanner;

public class ExceptionEx
{
	//It is accessible by all the instance of a class
	//memory or storage is allocated once and remains unless it is empty 
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        try 
        {
            // Taking input from the user
            System.out.print("Enter a number: ");
            int num = scanner.nextInt();
            
            // It could throw an exception
            int result = 100 / num;  // Might throw ArithmeticException for divide by zero
            
            System.out.println("Result: " + result);
        }
        catch (ArithmeticException e) 
        {
            System.out.println("Error: Cannot divide by zero.");
        }
        catch (Exception e) 
        {
            System.out.println(e);
        }
        finally 
        {
        	//block that acts as a flag to check where we are presently executing:finally
            System.out.println("This block always execute");
        }
        System.out.println("Rest of the code");
    }
}

