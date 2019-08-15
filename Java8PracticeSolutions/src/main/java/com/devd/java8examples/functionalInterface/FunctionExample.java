package com.devd.java8examples.functionalInterface;

import com.devd.java8examples.db.Employee;
import com.devd.java8examples.db.EmployeeDatabase;

import java.util.function.Function;

/**
 * @author: Devaraj Reddy,
 * Date : 2019-08-12
 */
public class FunctionExample {
    
    //create Function to convert employee names to uppercase
    private static Function<String, String> functionUpperCase = String::toUpperCase;
    
    public static void main(String[] args) {
        
        printEmployeeNamesInUpperCase();
        
    }
    
    private static void printEmployeeNamesInUpperCase() {
        
        System.out.println();
        System.out.println("printEmployeeNamesInUpperCase : ");
        System.out.println(
                "=====================================================================================================");
        
        //print all employee names in uppercase. Use Function to convert names to uppercase.
        
        for (Employee employee : EmployeeDatabase.getEmployees()) {
            System.out.println(functionUpperCase.apply(employee.getEmployeeName()));
        }
        
    }
    
}
