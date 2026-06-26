package com.core.corejava;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * P16: Join List of Strings with Prefix, Suffix and Delimiter
 * Joins elements with custom prefix, suffix and delimiter using Java 8 Streams.
 */
public class P16_JoinWithDelimiter {
    public static void main(String[] args) {
        List<String> items = Arrays.asList("apple", "banana", "cherry");
        
        String joined = items.stream()
                .collect(Collectors.joining(", ", "[", "]"));
        
        System.out.println("List: " + items);
        System.out.println("Joined: " + joined);
    }
}
