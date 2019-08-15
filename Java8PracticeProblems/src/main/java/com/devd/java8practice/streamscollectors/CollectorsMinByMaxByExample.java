package com.devd.java8practice.streamscollectors;

/**
 * @author: Devaraj Reddy,
 * Date : 2019-08-12
 */
public class CollectorsMinByMaxByExample {
    
    public static void main(String[] args) {
        
        printMinimumSalaryEarnedByMaleEmployees();
        
        printMinimumSalaryEarnedByFemaleEmployees();
    }
    
    private static void printMinimumSalaryEarnedByMaleEmployees() {
        
        System.out.println();
        System.out.println("printMinimumSalaryEarnedByMaleEmployees : ");
        System.out.println(
                "=====================================================================================================");
        
        //use minBy on collectors to get min Salary Optional and print if exists.
        
    }
    
    private static void printMinimumSalaryEarnedByFemaleEmployees() {
        
        System.out.println();
        System.out.println("printMinimumSalaryEarnedByFemaleEmployees : ");
        System.out.println(
                "=====================================================================================================");
        
        //use maxBy on collectors to get min Salary Optional and print if exists.
        
    }
}
