package com.java.wipro.java8;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
/**
 *@author Nikunj 
 */
public class Adjust 
{
	//function to check date and time according to our requirement
	public static void checkingAdjusters()
	{
		LocalDate date=LocalDate.now();
		System.out.println("The current date is:"+date);
		
		//to get the first day of the next month
		LocalDate dayOfNextMonth =date.with(TemporalAdjusters.firstDayOfMonth());
		System.out.println("Firstday of next month:"+ dayOfNextMonth);
		
		//get the next saturday
		LocalDate nextSaturday =date.with(TemporalAdjusters.next(DayOfWeek.SATURDAY));
		System.out.println("next saturday from now is: "+nextSaturday);
		
		//first day of current month
		LocalDate firstDay=date.with(TemporalAdjusters.firstDayOfMonth());
		System.out.println("firstDayOfMonth: "+firstDay);
		
		//last day of current month
		LocalDate lastDay=date.with(TemporalAdjusters.lastDayOfMonth());
		System.out.println("LastDayOfMonth: "+ lastDay);	
	}
	
	//Driver code
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		checkingAdjusters();
	}

}
