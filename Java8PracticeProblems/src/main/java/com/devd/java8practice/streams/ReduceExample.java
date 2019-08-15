package com.devd.java8practice.streams;

/**
 * @author: Devaraj Reddy,
 * Date : 2019-08-12
 */
public class ReduceExample {
    
    public static void main(String[] args) {
        
        printTotalSalaryTakenByEmployees();
        
        printTotalSalaryTakenByEmployeesWithoutDefaultValue();
        
        printMinimumSalaryEarnedByEmployee();
        
        printMaximumSalaryEarnedByEmployee();
        
    }
    
    
    private static void printTotalSalaryTakenByEmployees() {
        
        System.out.println();
        System.out.println("printTotalSalaryTakenByEmployees : ");
        System.out.println(
                "=====================================================================================================");
        
        //use reduce function on stream to find total salary taken by employee
        
    }
    
    private static void printTotalSalaryTakenByEmployeesWithoutDefaultValue() {
        
        System.out.println();
        System.out.println("printTotalSalaryTakenByEmployeesWithoutDefaultValue : ");
        System.out.println(
                "=====================================================================================================");
        
        //use reduce function on stream to find total salary taken by employee, dont use default/initial value, get
        // an optional and print if value exists.
        
    }
    
    private static void printMinimumSalaryEarnedByEmployee() {
        
        System.out.println();
        System.out.println("printMinimumSalaryEarnedByEmployee : ");
        System.out.println(
                "=====================================================================================================");
        
        //use reduce function on stream to find min salary taken by employee
        
    }
    
    private static void printMaximumSalaryEarnedByEmployee() {
        
        System.out.println();
        System.out.println("printMaximumSalaryEarnedByEmployee : ");
        System.out.println(
                "=====================================================================================================");
        
        //use reduce function on stream to find max salary taken by employee.
        
    }
}
