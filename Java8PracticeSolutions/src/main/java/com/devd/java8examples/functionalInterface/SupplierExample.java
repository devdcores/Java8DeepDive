package com.devd.java8examples.functionalInterface;

import com.devd.java8examples.db.Employee;
import com.devd.java8examples.db.EmployeeDatabase;

import java.util.List;
import java.util.function.Supplier;

/**
 * @author: Devaraj Reddy,
 * Date : 2019-08-12
 */
public class SupplierExample {
    
    //create Supplier to return employee list
    private static Supplier<List<Employee>> supplier = EmployeeDatabase::getEmployees;
    
    public static void main(String[] args) {
        
        printEmployeesList();
        
    }
    
    private static void printEmployeesList() {
        
        System.out.println("printEmployeesList : ");
        System.out.println(
                "=====================================================================================================");
        
        //get all the employees from EmployeeDatabase using supplier and print them.
        
        List<Employee> employeeList = supplier.get();
        
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
        
    }
}
