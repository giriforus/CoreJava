package com.core.corejava;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * P21: Find Common Elements Between Two Arrays
 * Finds elements present in both arrays using Java 8 Streams.
 */
public class P21_CommonElements {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> list2 = Arrays.asList(3, 4, 5, 6, 7);
        
        List<Integer> common = list1.stream()
                .filter(list2::contains)
                .distinct()
                .toList();
        
        System.out.println("List 1: " + list1);
        System.out.println("List 2: " + list2);
        System.out.println("Common Elements: " + common);
    }
}
