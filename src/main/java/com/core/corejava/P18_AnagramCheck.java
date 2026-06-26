package com.core.corejava;

import java.util.stream.Collectors;

/**
 * P18: Anagram Check
 * Checks if two strings are anagrams using Java 8 Streams.
 */
public class P18_AnagramCheck {
    public static void main(String[] args) {
        String string1 = "listen";
        String string2 = "silent";
        
        String sorted1 = string1.toUpperCase().chars()
                .sorted()
                .boxed()
                .map(String::valueOf)
                .collect(Collectors.joining());
        
        String sorted2 = string2.toUpperCase().chars()
                .sorted()
                .boxed()
                .map(String::valueOf)
                .collect(Collectors.joining());
        
        boolean isAnagram = sorted1.equals(sorted2);
        
        System.out.println("String 1: " + string1);
        System.out.println("String 2: " + string2);
        System.out.println("Are Anagrams: " + isAnagram);
    }
}
