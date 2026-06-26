package com.core.corejava;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * P02: Character Frequency Counter
 * Counts the frequency of each character in a string using Java 8 Streams.
 */
public class P02_CharacterFrequency {
    public static void main(String[] args) {
        String input = "hello world";
        
        Map<Character, Long> characterFrequency = input.chars()
                .mapToObj(c -> (char) c)
                .filter(c -> c != ' ')
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        
        System.out.println("String: " + input);
        characterFrequency.forEach((ch, count) -> 
            System.out.println("'" + ch + "' -> " + count)
        );
    }
}
