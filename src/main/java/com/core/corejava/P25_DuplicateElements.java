package com.core.corejava;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * P25: Find Duplicate Elements
 * Identifies duplicate elements in a list using Java 8 Streams.
 */
public class P25_DuplicateElements {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 2, 4, 1, 5, 3);
        
        Set<Integer> duplicates = numbers.stream()
                .filter(n -> Collections.frequency(numbers, n) > 1)
                .collect(Collectors.toSet());
        
        System.out.println("List: " + numbers);
        System.out.println("Duplicate Elements: " + duplicates);
    }
}
