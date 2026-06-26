package com.core.corejava;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharFrequency {
      public static void main(String[] args) {
        String text ="Hello World";
        Map<Character, Long> charCounts= text.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
          charCounts.forEach((k,v)->System.out.println(k+" : "+v));

      String str ="This is Giri";
      Map<Character, Long> charCount = str.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
    charCount.forEach((k,v)->System.out.println(k+" count: "+v));

      }
}
