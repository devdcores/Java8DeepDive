package com.devd.java8practice.streams;

/**
 * @author: Devaraj Reddy,
 * Date : 2019-08-12
 */
public class FilterExample {
    
    public static void main(String[] args) {
        
        printEmployeesNamesFilterByGender();
        
        printEmployeesFilterByGenderFemaleAndSalaryGreater50k();
        
    }
    
    private static void printEmployeesNamesFilterByGender() {
        
        System.out.println();
        System.out.println("printEmployeesNamesFilterByGender : ");
        System.out.println(
                "=====================================================================================================");
        
        //print only male or female employees.
        // use filter function on stream.
        
        System.out.println();
        System.out.println("Male Employees : ");
        System.out.println("=====================");
        
        //print male employee names.
        
        System.out.println();
        System.out.println("Female Employees : ");
        System.out.println("=====================");
        
        //print female employee names.
        
    }
    
    private static void printEmployeesFilterByGenderFemaleAndSalaryGreater50k() {
        
        System.out.println();
        System.out.println("printEmployeesFilterByGenderFemaleAndSalaryGreater50k : ");
        System.out.println(
                "=====================================================================================================");
        
        //print only male or female employees.
        // use filter function on stream.
        // try with 2 filters or single filter using predicate chaining.
        
        System.out.println();
        System.out.println("Using 2 filters : ");
        System.out.println("=====================");
        
        //use .filter method 2 times.
        
        System.out.println();
        System.out.println("Using Predicate Chaining : ");
        System.out.println("=====================");
        
        //use predicate chaining.
        
    }
}
