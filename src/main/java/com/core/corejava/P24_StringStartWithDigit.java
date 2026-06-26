package com.core.corejava;

import java.util.Arrays;
import java.util.List;

/**
 * P24: Find Strings Starting with a Digit
 * Filters strings that begin with a digit using Java 8 Streams.
 */
public class P24_StringStartWithDigit {
    public static void main(String[] args) {
        List<String> items = Arrays.asList("apple", "1st", "2nd", "banana", "3rd");
        
        List<String> startsWithDigit = items.stream()
                .filter(s -> !s.isEmpty() && Character.isDigit(s.charAt(0)))
                .toList();
        
        System.out.println("List: " + items);
        System.out.println("Strings starting with digit: " + startsWithDigit);
    }
}
