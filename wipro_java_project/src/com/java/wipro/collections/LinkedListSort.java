package com.java.wipro.collections;
/*
 * @author Nikunj
 */
import java.util.LinkedList;
import java.util.Collections;
import java.util.Comparator;

public class LinkedListSort
{

    public static void main(String[] args) 
    {
        // Create a LinkedList of Integer type
        LinkedList<Integer> linkedList = new LinkedList<>();
        
        // Add elements to the LinkedList
        linkedList.add(5);
        linkedList.add(2);
        linkedList.add(8);
        linkedList.add(1);
        linkedList.add(3);

        System.out.println("Before sorting: " + linkedList);

        // Sort the LinkedList using a custom Comparator
        Collections.sort(linkedList, new IntegerComparator());

        System.out.println("After sorting: " + linkedList);
    }

    // Custom Comparator class to compare integers
    static class IntegerComparator implements Comparator<Integer> 
    {
        @Override
        public int compare(Integer num1, Integer num2) {
            // Compare the two integers
            return num1 - num2;
        }
    }
}

