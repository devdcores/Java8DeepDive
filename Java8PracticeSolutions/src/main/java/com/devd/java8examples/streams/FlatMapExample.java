package com.devd.java8examples.streams;

import com.devd.java8examples.db.Employee;
import com.devd.java8examples.db.EmployeeDatabase;

import java.util.Collection;

/**
 * @author: Devaraj Reddy,
 * Date : 2019-08-12
 */
public class FlatMapExample {
    
    public static void main(String[] args) {
        
        printDistinctEmployeesSkillsetInSortedOrder();
        
    }
    
    private static void printDistinctEmployeesSkillsetInSortedOrder() {
        
        System.out.println();
        System.out.println("printDistinctEmployeesSkillsetInSortedOrder : ");
        System.out.println(
                "=====================================================================================================");
        
        //print all the skillsets employee's has. There should not be any duplicates.
        // since, skillset is itself List, use flatMap to get the stream of skillset and use distinct.
        
        EmployeeDatabase.getEmployees()
                        .stream()
                        .map(Employee::getSkillSet)
                        .flatMap(Collection::stream)
                        .distinct()
                        .sorted()
                        .forEach(System.out::println);
        
    }
}
