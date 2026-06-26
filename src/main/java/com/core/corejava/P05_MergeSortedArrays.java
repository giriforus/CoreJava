package com.core.corejava;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * P05: Merge Two Unsorted Arrays into Single Sorted Array
 * Merges two arrays and sorts them using Java 8 Streams.
 */
public class P05_MergeSortedArrays {
    public static void main(String[] args) {
        int[] array1 = {1, 3, 5, 7};
        int[] array2 = {2, 4, 6, 8};
        
        int[] merged = IntStream.concat(Arrays.stream(array1), Arrays.stream(array2))
                .sorted()
                .toArray();
        
        System.out.println("Array 1: " + Arrays.toString(array1));
        System.out.println("Array 2: " + Arrays.toString(array2));
        System.out.println("Merged and Sorted: " + Arrays.toString(merged));
    }
}
