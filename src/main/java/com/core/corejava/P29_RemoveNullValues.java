package com.core.corejava;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * P29: Remove Null Values from List
 * Filters out null values using Objects::nonNull in Java 8 Streams.
 */
public class P29_RemoveNullValues {
    public static void main(String[] args) {
        List<Integer> items = Arrays.asList(1, null, 2, null, 3, 4, null, 5);
        
        List<Integer> nonNullItems = items.stream()
                .filter(Objects::nonNull)
                .toList();
        
        System.out.println("Original (with nulls): " + items);
        System.out.println("Without nulls: " + nonNullItems);
    }
}
