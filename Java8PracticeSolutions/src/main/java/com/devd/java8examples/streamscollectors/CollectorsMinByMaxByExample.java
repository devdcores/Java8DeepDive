package com.devd.java8examples.streamscollectors;

import com.devd.java8examples.db.Employee;
import com.devd.java8examples.db.EmployeeDatabase;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * @author: Devaraj Reddy,
 * Date : 2019-08-12
 */
public class CollectorsMinByMaxByExample {
    
    public static void main(String[] args) {
        
        printMinimumSalaryEarnedByMaleEmployees();
        
        printMinimumSalaryEarnedByFemaleEmployees();
    }
    
    private static void printMinimumSalaryEarnedByMaleEmployees() {
        
        System.out.println();
        System.out.println("printMinimumSalaryEarnedByMaleEmployees : ");
        System.out.println(
                "=====================================================================================================");
        
        //use minBy on collectors to get min Salary Optional and print if exists.
        
        Optional<Double> minMaleSalary = EmployeeDatabase.getEmployees()
                                                     .stream()
                                                     .filter(employee -> employee.getGender().equals("male"))
                                                     .map(Employee::getSalary)
                                                     .collect(Collectors.minBy(Comparator.comparingDouble(s -> s)));
    
        minMaleSalary.ifPresent(System.out::println);
        
    }
    
    private static void printMinimumSalaryEarnedByFemaleEmployees() {
        
        System.out.println();
        System.out.println("printMinimumSalaryEarnedByFemaleEmployees : ");
        System.out.println(
                "=====================================================================================================");
        
        //use maxBy on collectors to get min Salary Optional and print if exists.
        
        Optional<Double> minFemaleSalary = EmployeeDatabase.getEmployees()
                                                     .stream()
                                                     .filter(employee -> employee.getGender().equals("female"))
                                                     .map(Employee::getSalary)
                                                     .collect(Collectors.minBy(Comparator.comparingDouble(s -> s)));
    
        minFemaleSalary.ifPresent(System.out::println);
        
    }
}
