package com.core.corejava;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * P07: Find Top 3 Maximum and Minimum Numbers
 * Finds the top 3 maximum and minimum values in a list using Java 8 Streams.
 */
public class P07_TopThreeMaxMin {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 2, 8, 1, 9, 3, 7, 4, 6);
        
        List<Integer> top3Max = numbers.stream()
                .sorted(Comparator.reverseOrder())
                .limit(3)
                .toList();
        
        List<Integer> top3Min = numbers.stream()
                .sorted()
                .limit(3)
                .toList();
        
        System.out.println("Numbers: " + numbers);
        System.out.println("Top 3 Maximum: " + top3Max);
        System.out.println("Top 3 Minimum: " + top3Min);
    }
}
