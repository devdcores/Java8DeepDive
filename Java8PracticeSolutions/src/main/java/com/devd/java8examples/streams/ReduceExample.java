package com.devd.java8examples.streams;

import com.devd.java8examples.db.Employee;
import com.devd.java8examples.db.EmployeeDatabase;

import java.util.Optional;

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
        
        Double totalSalary = EmployeeDatabase.getEmployees()
                                             .stream()
                                             .map(Employee::getSalary)
                                             .reduce(0.0, Double::sum);
        
        System.out.println("Total Salary of All Employees : " + totalSalary);
        
    }
    
    private static void printTotalSalaryTakenByEmployeesWithoutDefaultValue() {
        
        System.out.println();
        System.out.println("printTotalSalaryTakenByEmployeesWithoutDefaultValue : ");
        System.out.println(
                "=====================================================================================================");
        
        //use reduce function on stream to find total salary taken by employee, dont use default/initial value, get
        // an optional and print if value exists.
        
        Optional<Double> totalSalaryOptional = EmployeeDatabase.getEmployees()
                                                               .stream()
                                                               .map(Employee::getSalary)
                                                               .reduce(Double::sum);
        
        totalSalaryOptional.ifPresent(res -> System.out.println("Total Salary of All Employees (Optional) : " + res));
        
    }
    
    private static void printMinimumSalaryEarnedByEmployee() {
        
        System.out.println();
        System.out.println("printMinimumSalaryEarnedByEmployee : ");
        System.out.println(
                "=====================================================================================================");
        
        //use reduce function on stream to find min salary taken by employee
        
        Optional<Double> totalSalaryOptional = EmployeeDatabase.getEmployees()
                                                               .stream()
                                                               .map(Employee::getSalary)
                                                               .reduce(Double::min);
        
        totalSalaryOptional.ifPresent(
                minSalary -> System.out.println("Min Salary : " + minSalary));
    }
    
    private static void printMaximumSalaryEarnedByEmployee() {
        
        System.out.println();
        System.out.println("printMaximumSalaryEarnedByEmployee : ");
        System.out.println(
                "=====================================================================================================");
        
        //use reduce function on stream to find max salary taken by employee.
        
        Optional<Double> totalSalaryOptional = EmployeeDatabase.getEmployees()
                                                               .stream()
                                                               .map(Employee::getSalary)
                                                               .reduce(Double::max);
        
        totalSalaryOptional.ifPresent(
                maxSalary -> System.out.println("Max Salary : " + maxSalary));
        
    }
}
