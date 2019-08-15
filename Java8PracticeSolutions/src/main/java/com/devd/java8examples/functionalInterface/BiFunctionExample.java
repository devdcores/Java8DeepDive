package com.devd.java8examples.functionalInterface;

import com.devd.java8examples.db.Employee;
import com.devd.java8examples.db.EmployeeDatabase;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Predicate;

/**
 * @author: Devaraj Reddy,
 * Date : 2019-08-12
 */
public class BiFunctionExample {
    
    //create BiFunction which accepts emp list and predicate, return the filtered employee names.
    private static BiFunction<List<Employee>, Predicate<Employee>, List<String>> predicateListBiFunction =
            (a, b) -> {
                
                List<String> employeeList = new ArrayList<>();
                a.forEach(employee -> {
                    
                    if (b.test(employee)) {
                        employeeList.add(employee.getEmployeeName());
                    }
                    
                });
                
                return employeeList;
            };
    
    public static void main(String[] args) {
        
        printEmployeeNamesWhoseGenderIsMaleUsingBiFunction();
        
        printEmployeeNamesWhoHaveExpGreaterThan6UsingBiFunction();
        
    }
    
    private static void printEmployeeNamesWhoseGenderIsMaleUsingBiFunction() {
        
        System.out.println();
        System.out.println("printEmployeesWhoseGenderIsMaleUsingBiFunction : ");
        System.out.println(
                "=====================================================================================================");
        
        //print all the male employees. Use BiFunction send employee list and predicate (which has filter logic) as
        // parameters and return the filtered employees.
        
        List<String> maleEmployeeList = predicateListBiFunction.apply(EmployeeDatabase.getEmployees(),
                                                                      (e) -> e.getGender().equals("male"));
        
        System.out.println(maleEmployeeList);
        
    }
    
    private static void printEmployeeNamesWhoHaveExpGreaterThan6UsingBiFunction() {
        
        System.out.println();
        System.out.println("printEmployeesWhoHaveExpGreaterThan6UsingBiFunction : ");
        System.out.println(
                "=====================================================================================================");
        
        //print all the employees who have experience greater than 6. Use BiFunction send employee list
        // and predicate (which has filter logic) as parameters and return the filtered employees.
        
        List<String> expGrtThan6EmployeeList = predicateListBiFunction.apply(EmployeeDatabase.getEmployees(),
                                                                             (e) -> e.getExperienceInYears() > 6);
        
        System.out.println(expGrtThan6EmployeeList);
    }
    
}
