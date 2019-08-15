package com.devd.java8practice.streams;

/**
 * @author: Devaraj Reddy,
 * Date : 2019-08-12
 */
public class ComparatorExample {
    
    public static void main(String[] args) {
        
        printEmployeesOrderByIncreasingSalary();
        
        printEmployeesOrderByDecreasingSalary();
        
    }
    
    private static void printEmployeesOrderByIncreasingSalary() {
        
        System.out.println();
        System.out.println("printEmployeesOrderByIncreasingSalary : ");
        System.out.println(
                "=====================================================================================================");
        
        //sort the employees by their salaries in increasing order and print them.
        // hint: use sorted function on stream.
        
    }
    
    private static void printEmployeesOrderByDecreasingSalary() {
        
        System.out.println();
        System.out.println("printEmployeesOrderByDecreasingSalary : ");
        System.out.println(
                "=====================================================================================================");
        
        //sort the employees by their salaries in decreasing order and print them.
        // hint: use sorted function on stream and pass comparator lambda function which has logic to sort according to
        // use case.
        
    }
    
}
