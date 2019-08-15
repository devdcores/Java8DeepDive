package com.devd.java8examples.db;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author: Devaraj Reddy,
 * Date : 2019-08-12
 */
public class EmployeeDatabase {
    
    public static List<Employee> getEmployees() {
        
        List<Employee> employees = new ArrayList<>();
        
        Employee employee1 = new Employee(1, "Camille", 6, 65000, Arrays.asList("Java", "NodeJs", "React", "AWS"),
                                          "female");
        Employee employee2 = new Employee(2, "Alice", 5, 48000, Arrays.asList("Python", "Spring", "NodeJs", "Java"),
                                          "male");
        
        
        Employee employee3 = new Employee(3, "Ammy", 8, 80000, Arrays.asList("C++", "NodeJs", "C", "Html"), "female");
        Employee employee4 = new Employee(4, "Bruce", 2, 20000, Arrays.asList("OracleDB", "NodeJs", "Java"), "male");
        
        
        Employee employee5 = new Employee(5, "Kat", 4, 35000, Arrays.asList("Java", "NodeJs", "AWS"), "female");
        Employee employee6 = new Employee(6, "Watson", 5, 40000, Arrays.asList("Python", "Java", "NodeJs", "C++"),
                                          "male");
        
        Employee employee7 = new Employee(7, "Chris", 10, 90000, Arrays.asList("Javascript", "NodeJs", "AWS", "React"),
                                          "male");
        Employee employee8 = new Employee(8, "Lee", 6, 73000, Arrays.asList("Angular", "NodeJs", "React"), "male");
        
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);
        employees.add(employee5);
        employees.add(employee6);
        employees.add(employee7);
        employees.add(employee8);
        
        return employees;
    }
}


