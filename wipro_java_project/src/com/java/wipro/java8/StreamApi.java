package com.java.wipro.java8;

/*
 * @author Nikunj
 */
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApi {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		List<String> list =Arrays.asList("Nikunj","John","Devid");//list type of string
		List<String> stream =list.stream().
             filter(name->name.startsWith("N")).//filter name 
             collect(Collectors.toList());
		System.out.println(stream);//print the name after filtering
		
		List<String> stream1 =list.stream().
	            map(String::toUpperCase).//convert list elements in uppercase
	             collect(Collectors.toList());
			System.out.println(stream1);//print the list in uppercase
	}

}
