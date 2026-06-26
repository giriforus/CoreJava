package com.core.corejava;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

/**
 * P32: Find Longest String in a List
 * Finds the string with maximum length using Java 8 Streams and Comparators.
 */
public class P32_LongestString {
    public static void main(String[] args) {
        List<String> items = Arrays.asList("apple", "banana", "cherry", "date", "elephant");
        
        Optional<String> longest = items.stream()
                .max(Comparator.comparing(String::length));
        
        System.out.println("List: " + items);
        longest.ifPresentOrElse(
            value -> System.out.println("Longest String: " + value + " (length: " + value.length() + ")"),
            () -> System.out.println("List is empty")
        );
    }
}
