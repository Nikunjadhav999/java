package com.java.wipro.collections;
import java.util.HashMap;
import java.util.Map;
/**
 * @author Nikunj
 */
public class MapEx 
{
	public static void main(String[] args) 
	{
		//create a hashmap where integer is the key and string is the value
		Map<Integer, String> map =new HashMap<>();
		
		//Adding key-value pairs to the map
		map.put(1, "Apple");
		map.put(2, "Banana");
		map.put(3, "Cherry");
		
		//Accessing values by key
		System.out.println("Key 1: "+map.get(1));
		System.out.println("Key 2: "+map.get(2));
        
		//checking if a key exist in the map
		if(map.containsKey(3))
		{
			System.out.println("key 3 exist with value: "+ map.get(3));
		}
		
		//iterating over the map using for each loop
		System.out.println("\n Iterating through the map:");
		for(Map.Entry<Integer , String> entry : map.entrySet())
		{
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
		//Removing a key value pair
		map.remove(2);
		
		//display the map after removal
		System.out.println("\n Map after removal of key 2:");
		for(Map.Entry<Integer , String> entry : map.entrySet())
		{
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
	}

}
