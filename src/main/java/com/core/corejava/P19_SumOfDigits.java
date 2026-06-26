package com.core.corejava;

import java.util.stream.Stream;

/**
 * P19: Calculate Sum of All Digits in a Number
 * Computes sum of digits using Java 8 Streams.
 */
public class P19_SumOfDigits {
    public static void main(String[] args) {
        int number = 12345;
        
        int digitSum = Stream.of(String.valueOf(number).split(""))
                .mapToInt(Integer::parseInt)
                .sum();
        
        System.out.println("Number: " + number);
        System.out.println("Sum of Digits: " + digitSum);
    }
}
