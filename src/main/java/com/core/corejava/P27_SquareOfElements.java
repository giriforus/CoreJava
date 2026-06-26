package com.core.corejava;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * P27: Calculate Square of Each Element
 * Maps each element to its square using Java 8 Streams.
 */
public class P27_SquareOfElements {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        
        List<Integer> squares = numbers.stream()
                .map(n -> n * n)
                .toList();
        
        System.out.println("Original List: " + numbers);
        System.out.println("Squares: " + squares);
    }
}
