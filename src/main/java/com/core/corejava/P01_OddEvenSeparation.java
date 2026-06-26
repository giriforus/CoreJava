package com.core.corejava;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * P01: Separate Odd and Even Numbers
 * Partitions a list of integers into odd and even numbers using Java 8 Streams.
 */
public class P01_OddEvenSeparation {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        
        Map<Boolean, List<Integer>> oddEvenPartition = numbers.stream()
                .collect(Collectors.partitioningBy(n -> n % 2 == 0));
        
        System.out.println("Even Numbers: " + oddEvenPartition.get(true));
        System.out.println("Odd Numbers: " + oddEvenPartition.get(false));
    }
}
