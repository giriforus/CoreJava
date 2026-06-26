package com.core.corejava;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * P30: Flatten Nested List
 * Converts a nested list into single flat list using flatMap in Java 8 Streams.
 */
public class P30_FlattenNestedList {
    public static void main(String[] args) {
        List<List<Integer>> nestedList = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5, 6),
                Arrays.asList(7, 8, 9)
        );
        
        List<Integer> flatList = nestedList.stream()
                .flatMap(List::stream)
                .toList();
        
        System.out.println("Nested List: " + nestedList);
        System.out.println("Flattened List: " + flatList);
    }
}
