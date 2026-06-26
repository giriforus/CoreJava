package com.core.corejava;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * P03: Sort in Reverse Order
 * Sorts a list of integers in descending order using Java 8 Streams.
 */
public class P03_ReverseOrderSort {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 2, 8, 1, 9, 3);
        
        System.out.println("Original: " + numbers);
        System.out.println("Sorted (Descending):");
        
        numbers.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);
    }
}
