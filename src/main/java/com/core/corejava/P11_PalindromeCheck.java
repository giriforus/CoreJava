package com.core.corejava;

import java.util.stream.IntStream;

/**
 * P11: Palindrome Check
 * Determines if a string is a palindrome using Java 8 Streams.
 */
public class P11_PalindromeCheck {
    public static void main(String[] args) {
        String input = "racecar";
        
        boolean isPalindrome = IntStream.range(0, input.length() / 2)
                .noneMatch(i -> input.charAt(i) != input.charAt(input.length() - 1 - i));
        
        System.out.println("String: " + input);
        System.out.println("Is Palindrome: " + isPalindrome);
    }
}
