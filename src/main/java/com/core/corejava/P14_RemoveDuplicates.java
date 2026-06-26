package com.core.corejava;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * P14: Remove Duplicate Elements from List
 * Removes duplicate elements using distinct() in Java 8 Streams.
 */
public class P14_RemoveDuplicates {
    public static void main(String[] args) {
        List<String> items = Arrays.asList("apple", "banana", "apple", "cherry", "banana");
        
        List<String> uniqueItems = items.stream()
                .distinct()
                .toList();
        
        System.out.println("Original: " + items);
        System.out.println("Without Duplicates: " + uniqueItems);
    }
}
