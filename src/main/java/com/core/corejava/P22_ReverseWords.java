package com.core.corejava;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * P22: Reverse Each Word in a String
 * Reverses every word while maintaining word order using Java 8 Streams.
 */
public class P22_ReverseWords {
    public static void main(String[] args) {
        String input = "hello world java";
        
        String reversed = Arrays.stream(input.split(" "))
                .map(word -> new StringBuilder(word).reverse().toString())
                .collect(Collectors.joining(" "));
        
        System.out.println("Original: " + input);
        System.out.println("Reversed Words: " + reversed);
    }
}
