package com.java.wipro.java8;
/*
 * @author Nikunj
 */
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StreamInt {

    public static void main(String[] args)
    {
        List<Integer> list = Arrays.asList(2,5,1,7,4);

        // Find the minimum value using Stream API
        Integer min = list.stream()
                .min(Comparator.comparing(Integer::valueOf))
                .orElse(null);

        // Find the maximum value using Stream API
        Integer max = list.stream()
                .max(Comparator.comparing(Integer::valueOf))
                .orElse(null);

        // Print the results
        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);
    }
}