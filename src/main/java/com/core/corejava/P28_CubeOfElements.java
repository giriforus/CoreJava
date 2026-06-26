package com.core.corejava;

import java.util.Arrays;
import java.util.List;

/**
 * P28: Calculate Cube of Each Element
 * Maps each element to its cube using Java 8 Streams.
 */
public class P28_CubeOfElements {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        
        List<Integer> cubes = numbers.stream()
                .map(n -> n * n * n)
                .toList();
        
        System.out.println("Original List: " + numbers);
        System.out.println("Cubes: " + cubes);
    }
}
