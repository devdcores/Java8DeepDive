package com.devd.java8examples.streamscollectors;

import com.devd.java8examples.db.EmployeeDatabase;

import java.util.stream.Collectors;

/**
 * @author: Devaraj Reddy,
 * Date : 2019-08-12
 */
public class CollectorsCountingExample {
    
    public static void main(String[] args) {
        
        printCountOfMaleEmployees();
        
        printCountOfFeMaleEmployees();
        
    }
    
    private static void printCountOfMaleEmployees() {
        
        System.out.println();
        System.out.println("printCountOfMaleEmployees : ");
        System.out.println(
                "=====================================================================================================");
        
        //use counting method to count female employee count.
        
        Long femaleCount = EmployeeDatabase.getEmployees()
                                           .stream()
                                           .filter(e -> e.getGender().equals("female"))
                                           .collect(Collectors.counting());
        
        System.out.println("Female Employee Count: " + femaleCount);
        
    }
    
    private static void printCountOfFeMaleEmployees() {
        
        System.out.println();
        System.out.println("printCountOfFeMaleEmployees : ");
        System.out.println(
                "=====================================================================================================");
        
        //use counting method on Collectors to count male employee count.
        
        Long maleCount = EmployeeDatabase.getEmployees()
                                         .stream()
                                         .filter(e -> e.getGender().equals("male"))
                                         .collect(Collectors.counting());
        
        System.out.println("Male Employee Count: " + maleCount);
        
    }
}