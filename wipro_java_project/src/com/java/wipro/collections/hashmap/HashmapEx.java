package com.java.wipro.collections.hashmap;
/*
 * @author Nikunj
 */
import java.util.HashMap;
import java.util.Map;

public class HashmapEx{

    public static void main(String[] args) {

        // Create a HashMap
        Map<String, Integer> numberMap = new HashMap<>();

        // Add elements to the HashMap
        numberMap.put("One", 1);
        numberMap.put("Two", 2);
        numberMap.put("Three", 3);
        System.out.println("HashMap after adding elements: " + numberMap);

        // Access elements from the HashMap
        Integer value = numberMap.get("Two");
        if (value != null) {
            System.out.println("Value associated with key 'Two': " + value);
        } else {
            System.out.println("Key 'Two' not found in the HashMap.");
        }

        // Change an element in the HashMap
        numberMap.put("Two", 22); // Overwrite the existing value for key "Two"
        System.out.println("HashMap after changing element 'Two': " + numberMap);

        // xRemove an element from the HashMap
        numberMap.remove("Three");
        System.out.println("HashMap after removing element 'Three': " + numberMap);

        // Verify the removal
        if (numberMap.containsKey("Three")) {
            System.out.println("Element 'Three' still exists."); // This will not be printed
        } else {
            System.out.println("Element 'Three' has been successfully removed.");
        }
    }
}

