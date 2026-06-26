package com.core.corejava;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * P31: Group Employees by Department
 * Groups custom objects by a property using groupingBy collector in Java 8.
 */
public class P31_GroupEmployeesByDept {
    
    static class Employee {
        private final String name;
        private final String department;
        
        public Employee(String name, String department) {
            this.name = name;
            this.department = department;
        }
        
        public String getDepartment() {
            return department;
        }
        
        @Override
        public String toString() {
            return name + " (" + department + ")";
        }
    }
    
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", "HR"),
                new Employee("Bob", "IT"),
                new Employee("Charlie", "HR"),
                new Employee("David", "IT"),
                new Employee("Eve", "Finance")
        );
        
        Map<String, List<Employee>> groupedByDept = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));
        
        System.out.println("Employees grouped by department:");
        groupedByDept.forEach((dept, emps) -> {
            System.out.println(dept + ":");
            emps.forEach(emp -> System.out.println("  - " + emp));
        });
    }
}
