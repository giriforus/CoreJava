package com.core.corejava;

import java.util.stream.IntStream;

/**
 * P23: Calculate Sum of First 10 Natural Numbers
 * Computes sum using IntStream.range() in Java 8.
 */
public class P23_SumFirstTenNatural {
    public static void main(String[] args) {
        int sum = IntStream.range(1, 11).sum();
        
        System.out.println("Sum of first 10 natural numbers: " + sum);
        System.out.println("Numbers: 1 to 10");
    }
}
