package com.devd.java8examples.streams;

import com.devd.java8examples.db.Employee;
import com.devd.java8examples.db.EmployeeDatabase;

import java.util.Comparator;

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
        
        EmployeeDatabase.getEmployees()
                        .stream()
                        .sorted(Comparator.comparingDouble(Employee::getSalary))
                        .forEach(System.out::println);
        
    }
    
    private static void printEmployeesOrderByDecreasingSalary() {
        
        System.out.println();
        System.out.println("printEmployeesOrderByDecreasingSalary : ");
        System.out.println(
                "=====================================================================================================");
        
        //sort the employees by their salaries in decreasing order and print them.
        // hint: use sorted function on stream and pass comparator lambda function which has logic to sort according to
        // use case.
        
        EmployeeDatabase.getEmployees()
                        .stream()
                        .sorted((a, b) -> (-1) * Double.compare(a.getSalary(), b.getSalary()))
                        .forEach(System.out::println);
        
    }
    
}
