package com.devd.java8practice.functionalInterface;

/**
 * @author: Devaraj Reddy,
 * Date : 2019-08-12
 */
public class BiFunctionExample {
    
    //create BiFunction which accepts emp list and predicate, return the filtered employee names.
    
    public static void main(String[] args) {
        
        printEmployeeNamesWhoseGenderIsMaleUsingBiFunction();
        
        printEmployeeNamesWhoHaveExpGreaterThan6UsingBiFunction();
        
    }
    
    private static void printEmployeeNamesWhoseGenderIsMaleUsingBiFunction() {
        
        System.out.println();
        System.out.println("printEmployeeNamesWhoseGenderIsMaleUsingBiFunction : ");
        System.out.println(
                "=====================================================================================================");
        
        //print all the male employees. Use BiFunction send employee list and predicate (which has filter logic) as
        // parameters and return the filtered employees.
        
    }
    
    private static void printEmployeeNamesWhoHaveExpGreaterThan6UsingBiFunction() {
        
        System.out.println();
        System.out.println("printEmployeeNamesWhoHaveExpGreaterThan6UsingBiFunction : ");
        System.out.println(
                "=====================================================================================================");
        
        //print all the employees who have experience greater than 6. Use BiFunction send employee list
        // and predicate (which has filter logic) as parameters and return the filtered employees.
        
    }
    
}
