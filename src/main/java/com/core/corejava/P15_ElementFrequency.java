package com.core.corejava;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * P15: Count Frequency of Each Element in List
 * Counts occurrences of each element using groupingBy collector.
 */
public class P15_ElementFrequency {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 2, 4, 1, 5, 3, 2);
        
        Map<Integer, Long> frequency = numbers.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        
        System.out.println("List: " + numbers);
        System.out.println("Element Frequency:");
        frequency.forEach((num, count) -> System.out.println(num + " -> " + count));
    }
}
