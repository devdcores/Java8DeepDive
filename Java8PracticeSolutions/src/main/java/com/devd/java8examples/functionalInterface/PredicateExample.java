package com.devd.java8examples.functionalInterface;

import com.devd.java8examples.db.Employee;
import com.devd.java8examples.db.EmployeeDatabase;

import java.util.function.Predicate;

/**
 * @author: Devaraj Reddy,
 * Date : 2019-08-12
 */
public class PredicateExample {
    
    //create Predicate for employee having exp greater than or equal to 5
    private static Predicate<Employee> employeePredicateExp = (employee -> employee.getExperienceInYears() > 5);
    
    //create Predicate for employee having salary greater than or equal to 70000
    private static Predicate<Employee> employeePredicateSalary = (employee -> employee.getSalary() > 70000);
    
    public static void main(String[] args) {
        
        printEmployeesWhoseExperienceGreaterThan5();
        
        printEmployeesWhoseSalaryGreaterThan70k();
        
        printEmployeesWhoHasExpGreaterThan5AndSalaryGreaterThan70k();
        
        printEmployeesWhoHasExpGreaterThan5_Or_SalaryGreaterThan70k();
        
    }
    
    private static void printEmployeesWhoseExperienceGreaterThan5() {
        
        System.out.println();
        System.out.println("printEmployeesWhoseExperienceGreaterThan5 : ");
        System.out.println(
                "=====================================================================================================");
        
        //print all the employees who has experience greater than 5.
        // use the above created predicate to print only employees who has experience greater than 5.
        
        for (Employee employee : EmployeeDatabase.getEmployees()) {
            if (employeePredicateExp.test(employee)) {
                System.out.println(employee);
            }
        }
        
    }
    
    private static void printEmployeesWhoseSalaryGreaterThan70k() {
        
        System.out.println();
        System.out.println("printEmployeesWhoseSalaryGreaterThan70k : ");
        System.out.println(
                "=====================================================================================================");
        
        //print all the employees who has experience greater than 5.
        // use the above created predicate to print only employees who has salary greater than 70000.
        
        for (Employee employee : EmployeeDatabase.getEmployees()) {
            if (employeePredicateSalary.test(employee)) {
                System.out.println(employee);
            }
        }
    }
    
    private static void printEmployeesWhoHasExpGreaterThan5AndSalaryGreaterThan70k() {
        
        System.out.println();
        System.out.println("printEmployeesWhoHasExpGreaterThan5AndSalaryGreaterThan70k : ");
        System.out.println(
                "=====================================================================================================");
        
        //use both the created predicate's, apply predicate chaining to print employees who has experience
        // greater than 5 and also have salary greater than 70k.
        
        for (Employee employee : EmployeeDatabase.getEmployees()) {
            if (employeePredicateExp.and(employeePredicateSalary).test(employee)) {
                System.out.println(employee);
            }
        }
    }
    
    private static void printEmployeesWhoHasExpGreaterThan5_Or_SalaryGreaterThan70k() {
        
        System.out.println();
        System.out.println("printEmployeesWhoHasExpGreaterThan5_Or_SalaryGreaterThan70k : ");
        System.out.println(
                "=====================================================================================================");
        
        //use both the created predicate's, apply predicate chaining to print employees who has experience
        // greater than 5 or have salary greater than 70k.
        
        for (Employee employee : EmployeeDatabase.getEmployees()) {
            if (employeePredicateExp.or(employeePredicateSalary).test(employee)) {
                System.out.println(employee);
            }
        }
    }
    
}
