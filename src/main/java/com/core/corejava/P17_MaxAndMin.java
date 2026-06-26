package com.core.corejava;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

/**
 * P17: Find Maximum and Minimum Values
 * Finds max and min values in list using Optional and Comparators.
 */
public class P17_MaxAndMin {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 2, 8, 1, 9, 3);
        
        Optional<Integer> maximum = numbers.stream()
                .max(Comparator.naturalOrder());
        
        Optional<Integer> minimum = numbers.stream()
                .min(Comparator.naturalOrder());
        
        System.out.println("List: " + numbers);
        maximum.ifPresent(max -> System.out.println("Maximum: " + max));
        minimum.ifPresent(min -> System.out.println("Minimum: " + min));
    }
}
