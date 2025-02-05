package com.java.wipro.exception;
/*
 * @author Nikunj
 */

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

//checked at compime time
public class Checked
{
	public static void main(String[] args) 
	{
		try
		{
			File file=new File("Wrong path");
			FileReader reader=new FileReader(file);
		}
		catch(IOException e)
		{
			System.out.println(e.getStackTrace());
		}
		
	}
}