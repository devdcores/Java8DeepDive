package com.devd.java8examples.streams;

import com.devd.java8examples.db.Employee;
import com.devd.java8examples.db.EmployeeDatabase;

import java.util.Optional;

/**
 * @author: Devaraj Reddy,
 * Date : 2019-08-12
 */
public class FilterMapReduceExample {
    
    public static void main(String[] args) {
        
        printTotalSalaryEarnedByFemaleEmployees();
    }
    
    private static void printTotalSalaryEarnedByFemaleEmployees() {
        
        System.out.println();
        System.out.println("printTotalSalaryEarnedByFemaleEmployees : ");
        System.out.println(
                "=====================================================================================================");
        
        //Use Filter, Map and Reduce to print total salary taken by female employees.
        
        Optional<Double> femaleTotalSalary = EmployeeDatabase.getEmployees()
                                                             .stream()
                                                             .filter(employee -> employee.getGender().equals("female"))
                                                             .map(Employee::getSalary)
                                                             .reduce(Double::sum);
        
        femaleTotalSalary.ifPresent(System.out::println);
    }
}
