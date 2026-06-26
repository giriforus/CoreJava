package com.core.corejava;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * P10: Reverse an Integer Array
 * Reverses an array using Java 8 Streams with IntStream.
 */
public class P10_ReverseIntegerArray {
    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4, 5};
        
        int[] reversed = IntStream.rangeClosed(1, original.length)
                .map(i -> original[original.length - i])
                .toArray();
        
        System.out.println("Original: " + Arrays.toString(original));
        System.out.println("Reversed: " + Arrays.toString(reversed));
    }
}
