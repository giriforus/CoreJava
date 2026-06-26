package com.core.corejava;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

/**
 * P20: Find Second Largest Number
 * Finds the second largest element using Java 8 Streams.
 */
public class P20_SecondLargest {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 2, 8, 1, 9, 3);
        
        Optional<Integer> secondLargest = numbers.stream()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst();
        
        System.out.println("List: " + numbers);
        secondLargest.ifPresentOrElse(
            value -> System.out.println("Second Largest: " + value),
            () -> System.out.println("Second largest not found")
        );
    }
}
