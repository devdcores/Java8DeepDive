package com.devd.java8practice.functionalInterface;

/**
 * @author: Devaraj Reddy,
 * Date : 2019-08-12
 */
public class PredicateExample {
    
    //create Predicate for employee having exp greater than or equal to 5
    
    //create Predicate for employee having salary greater than or equal to 70000
    
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
        
    }
    
    private static void printEmployeesWhoseSalaryGreaterThan70k() {
        
        System.out.println();
        System.out.println("printEmployeesWhoseSalaryGreaterThan70k : ");
        System.out.println(
                "=====================================================================================================");
        
        //print all the employees who has experience greater than 5.
        // use the above created predicate to print only employees who has salary greater than 70000.
        
    }
    
    private static void printEmployeesWhoHasExpGreaterThan5AndSalaryGreaterThan70k() {
        
        System.out.println();
        System.out.println("printEmployeesWhoHasExpGreaterThan5AndSalaryGreaterThan70k : ");
        System.out.println(
                "=====================================================================================================");
        
        //use both the created predicate's, apply predicate chaining to print employees who has experience
        // greater than 5 and also have salary greater than 70k.
        
    }
    
    private static void printEmployeesWhoHasExpGreaterThan5_Or_SalaryGreaterThan70k() {
        
        System.out.println();
        System.out.println("printEmployeesWhoHasExpGreaterThan5_Or_SalaryGreaterThan70k : ");
        System.out.println(
                "=====================================================================================================");
        
        //use both the created predicate's, apply predicate chaining to print employees who has experience
        // greater than 5 or have salary greater than 70k.
        
    }
    
}
