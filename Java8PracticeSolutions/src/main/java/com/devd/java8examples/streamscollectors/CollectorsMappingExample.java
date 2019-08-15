package com.devd.java8examples.streamscollectors;

import com.devd.java8examples.db.Employee;
import com.devd.java8examples.db.EmployeeDatabase;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author: Devaraj Reddy,
 * Date : 2019-08-12
 */
public class CollectorsMappingExample {
    
    public static void main(String[] args) {
        
        collectEmployeeNamesInToListAndPrint();
        
    }
    
    private static void collectEmployeeNamesInToListAndPrint() {
        
        System.out.println();
        System.out.println("collectEmployeeNamesInToListAndPrint : ");
        System.out.println(
                "=====================================================================================================");
        
        //use mapping on collectors to map employee to employee name and collect to list.
        
        List<String> empNamesLisr = EmployeeDatabase.getEmployees()
                                                    .stream()
                                                    .collect(Collectors.mapping(Employee::getEmployeeName, Collectors.toList()));
        
        System.out.println(empNamesLisr);
    }
}
