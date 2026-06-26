package com.core.corejava;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * P06: Merge Two Arrays into Single Sorted Array Without Duplicates
 * Merges arrays, removes duplicates and sorts using Java 8 Streams.
 */
public class P06_MergeSortedDistinct {
    public static void main(String[] args) {
        int[] array1 = {1, 3, 5, 7, 1};
        int[] array2 = {2, 4, 6, 8, 2};
        
        int[] merged = IntStream.concat(Arrays.stream(array1), Arrays.stream(array2))
                .distinct()
                .sorted()
                .toArray();
        
        System.out.println("Array 1: " + Arrays.toString(array1));
        System.out.println("Array 2: " + Arrays.toString(array2));
        System.out.println("Merged (Distinct & Sorted): " + Arrays.toString(merged));
    }
}
