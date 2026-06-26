package com.core.corejava;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * P13: Calculate Age from Date of Birth
 * Computes age in years using Java 8 Time API.
 */
public class P13_AgeCalculation {
    public static void main(String[] args) {
        LocalDate dateOfBirth = LocalDate.of(1990, 5, 15);
        LocalDate today = LocalDate.now();
        
        long ageInYears = ChronoUnit.YEARS.between(dateOfBirth, today);
        
        System.out.println("Date of Birth: " + dateOfBirth);
        System.out.println("Today's Date: " + today);
        System.out.println("Age: " + ageInYears + " years");
    }
}
