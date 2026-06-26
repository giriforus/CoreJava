package com.core.corejava;

import java.util.Arrays;

/**
 * P09: Calculate Sum and Average of Array Elements
 * Computes sum and average using Java 8 Streams IntStream.
 */
public class P09_SumAndAverage {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        
        int sum = Arrays.stream(numbers).sum();
        double average = Arrays.stream(numbers).average().orElse(0.0);
        long count = Arrays.stream(numbers).count();
        
        System.out.println("Array: " + Arrays.toString(numbers));
        System.out.println("Count: " + count);
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
    }
}
