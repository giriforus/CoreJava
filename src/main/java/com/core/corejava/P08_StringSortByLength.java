package com.core.corejava;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * P08: Sort Strings by Length
 * Sorts list of strings in increasing order of their length using Java 8 Streams.
 */
public class P08_StringSortByLength {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "a", "banana", "hi", "elephant");
        
        List<String> sortedByLength = strings.stream()
                .sorted(Comparator.comparing(String::length))
                .toList();
        
        System.out.println("Original: " + strings);
        System.out.println("Sorted by Length: " + sortedByLength);
    }
}
