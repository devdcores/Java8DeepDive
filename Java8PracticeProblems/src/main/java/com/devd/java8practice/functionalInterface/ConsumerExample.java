package com.devd.java8practice.functionalInterface;

/**
 * @author: Devaraj Reddy,
 * Date : 2019-08-12
 */
public class ConsumerExample {
    
    //create Consumer to print employee names
    
    //create BiConsumer to print employee name with salary
    
    public static void main(String[] args) {
        
        printEmployeeNames();
        
        printEmployeeNameAndSalaryUsingBiConsumer();
        
    }
    
    private static void printEmployeeNames() {
        
        System.out.println();
        System.out.println("printEmployeeNames : ");
        System.out.println(
                "=====================================================================================================");
        
        //print all the names of employees using Consumer, use forEach on list.
        
    }
    
    private static void printEmployeeNameAndSalaryUsingBiConsumer() {
        
        System.out.println();
        System.out.println("printEmployeeNameAndSalaryUsingBiConsumer : ");
        System.out.println(
                "=====================================================================================================");
        
        //print all the names with salary of employees using BiConsumer which accepts two
        // parameters name and salary and print in this format "name : salary"
        
    }
    
}
