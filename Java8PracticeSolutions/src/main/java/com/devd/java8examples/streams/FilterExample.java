package com.devd.java8examples.streams;

import com.devd.java8examples.db.Employee;
import com.devd.java8examples.db.EmployeeDatabase;

import java.util.function.Predicate;

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
        System.out.println("printEmployeesFilterByGender : ");
        System.out.println(
                "=====================================================================================================");
        
        //print only male or female employees.
        // use filter function on stream.
        
        System.out.println();
        System.out.println("Male Employees : ");
        System.out.println("=====================");
        
        EmployeeDatabase.getEmployees()
                        .stream()
                        .filter(employee -> employee.getGender().equals("male"))
                        .forEach(k -> System.out.println(k.getEmployeeName()));
        
        
        System.out.println();
        System.out.println("Female Employees : ");
        System.out.println("=====================");
        
        EmployeeDatabase.getEmployees()
                        .stream()
                        .filter(employee -> employee.getGender().equals("female"))
                        .forEach(k -> System.out.println(k.getEmployeeName()));
        
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
        
        EmployeeDatabase.getEmployees()
                        .stream()
                        .filter(employee -> employee.getGender().equals("female"))
                        .filter(employee -> employee.getSalary() > 50000)
                        .forEach(System.out::println);
        
        System.out.println();
        System.out.println("Using Predicate Chaining : ");
        System.out.println("=====================");
        
        Predicate<Employee> predicateGender = employee -> employee.getGender().equals("female");
        Predicate<Employee> predicateSalary = employee -> employee.getSalary() > 50000;
        
        EmployeeDatabase.getEmployees()
                        .stream()
                        .filter(predicateGender.and(predicateSalary))
                        .forEach(System.out::println);
        
    }
}
