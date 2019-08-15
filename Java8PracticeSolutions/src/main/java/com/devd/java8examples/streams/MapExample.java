package com.devd.java8examples.streams;

import com.devd.java8examples.db.Employee;
import com.devd.java8examples.db.EmployeeDatabase;

/**
 * @author: Devaraj Reddy,
 * Date : 2019-08-12
 */
public class MapExample {
    
    public static void main(String[] args) {
        
        printEmployeeNames();
        printEmployeeNamesInUpperCaseUsingMap();
        
    }
    
    private static void printEmployeeNames() {
        
        System.out.println();
        System.out.println("printEmployeeNames : ");
        System.out.println(
                "=====================================================================================================");
        
        //use map on stream to convert employee to name and print.
        
        EmployeeDatabase.getEmployees()
                        .stream()
                        .map(Employee::getEmployeeName)
                        .forEach(System.out::println);
        
    }
    
    private static void printEmployeeNamesInUpperCaseUsingMap() {
        
        System.out.println();
        System.out.println("printNamesInUpperCaseUsingMap : ");
        System.out.println(
                "=====================================================================================================");
        
        //use map on stream to convert employee to name and to uppercase and print.
        
        EmployeeDatabase.getEmployees()
                        .stream()
                        .map(Employee::getEmployeeName)
                        .map(String::toUpperCase)
                        .forEach(System.out::println);
        
    }
}
