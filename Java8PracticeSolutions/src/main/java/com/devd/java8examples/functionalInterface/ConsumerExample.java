package com.devd.java8examples.functionalInterface;

import com.devd.java8examples.db.Employee;
import com.devd.java8examples.db.EmployeeDatabase;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

/**
 * @author: Devaraj Reddy,
 * Date : 2019-08-12
 */
public class ConsumerExample {
    
    //create Consumer to print employee names
    private static Consumer<Employee> employeeConsumer = (System.out::println);
    
    //create BiConsumer to print employee name with salary
    private static BiConsumer<String, Double> employeeBiConsumer = (a, b) -> System.out.println(a + " : " + b);
    
    public static void main(String[] args) {
        
        printEmployeeNames();
        
        printEmployeeNameAndSalaryUsingBiConsumer();
        
    }
    
    private static void printEmployeeNames() {
        
        System.out.println();
        System.out.println("printNames : ");
        System.out.println(
                "=====================================================================================================");
        
        //print all the names of employees using Consumer, use forEach on list.
        
        for (Employee employee : EmployeeDatabase.getEmployees()) {
            employeeConsumer.accept(employee);
        }
        
    }
    
    private static void printEmployeeNameAndSalaryUsingBiConsumer() {
        
        System.out.println();
        System.out.println("printEmployeeNameAndSalaryUsingBiConsumer : ");
        System.out.println(
                "=====================================================================================================");
        
        //print all the names with salary of employees using BiConsumer which accepts two
        // parameters name and salary and print in this format "name : salary"
        
        for (Employee employee : EmployeeDatabase.getEmployees()) {
            employeeBiConsumer.accept(employee.getEmployeeName(),
                                      employee.getSalary());
        }
        
    }
    
}
