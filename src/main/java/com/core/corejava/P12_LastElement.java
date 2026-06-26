package com.core.corejava;

import java.util.Arrays;
import java.util.List;

/**
 * P12: Get Last Element from List
 * Retrieves the last element using Java 8 Streams and Optional.
 */
public class P12_LastElement {
    public static void main(String[] args) {
        List<String> items = Arrays.asList("apple", "banana", "cherry", "date");
        
        String lastElement = items.stream()
                .skip(items.size() - 1)
                .findFirst()
                .orElse("No element");
        
        System.out.println("List: " + items);
        System.out.println("Last Element: " + lastElement);
    }
}
