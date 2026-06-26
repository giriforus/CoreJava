package com.core.corejava;

import java.util.Arrays;
import java.util.List;

/**
 * P04: Print Multiples of 5
 * Filters and prints all numbers divisible by 5 using Java 8 Streams.
 */
public class P04_MultiplesOfFive {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 10, 15, 20, 25, 30, 7, 11);
        
        List<Integer> multiplesOfFive = numbers.stream()
                .filter(n -> n % 5 == 0)
                .toList();
        
        System.out.println("Multiples of 5: " + multiplesOfFive);
    }
}
