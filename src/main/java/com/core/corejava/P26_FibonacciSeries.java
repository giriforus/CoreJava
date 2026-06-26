package com.core.corejava;

import java.util.stream.Stream;

/**
 * P26: Fibonacci Series Generator
 * Generates first N Fibonacci numbers using Java 8 Streams iterate.
 */
public class P26_FibonacciSeries {
    public static void main(String[] args) {
        int limit = 10;
        
        System.out.println("First " + limit + " Fibonacci Numbers:");
        
        Stream.iterate(new int[]{0, 1}, f -> new int[]{f[1], f[0] + f[1]})
                .limit(limit)
                .map(f -> f[0])
                .forEach(num -> System.out.print(num + " "));
        
        System.out.println();
    }
}
