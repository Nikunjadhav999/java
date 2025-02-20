package com.java.wipro.collections.hashmap;
import java.util.HashMap; // Import the HashMap class
import java.util.Map;     // Import the Map interface

public class Task {

    public static void main(String[] args) {
        // Create a HashMap to store student data
        // Key: Roll Number (Integer)
        // Value: Name (String)
        Map<Integer, String> students = new HashMap<>();

        // Add student data to the HashMap
        // put(key, value) - adds a key-value pair to the map

        students.put(1, "Alice"); // Roll number 1, name Alice
        students.put(2, "Bob");   // Roll number 2, name Bob
        students.put(3, "Alice"); // Roll number 3, name Alice (duplicate name allowed)

        // Demonstrating duplicate roll number:
        // This will overwrite the previous entry for roll number 1
        students.put(1, "Updated Alice"); // Roll number 1, name Updated Alice

        students.put(4, "Charlie");
        students.put(5, "David");
        students.put(6, "Eve");
        students.put(7, "Bob"); //duplicate name
        students.put(8, "Frank");
        students.put(9, "Grace");
        students.put(10, "Heidi");


        // Print the HashMap to the console
        // This will show the roll numbers and names stored in the map
        System.out.println(students);
    }
}
