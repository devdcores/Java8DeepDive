package com.devd.java8practice.streams;

/**
 * @author: Devaraj Reddy,
 * Date : 2019-08-12
 */
public class MatchesExample {
    
    public static void main(String[] args) {
        
        isEveryEmployeeEarningSalaryMoreThan10k();
        
        isThereAnyEmployeeEarningSalaryMoreThan80k();
        
        doesAllEmployeesWontEarnMoreThan95k();
        
    }
    
    private static void isEveryEmployeeEarningSalaryMoreThan10k() {
        
        System.out.println();
        System.out.println("isEveryEmployeeEarningSalaryMoreThan10k : ");
        System.out.println(
                "=====================================================================================================");
        
        //Use allMatch on stream to check weather all employees earn salary more than 10k.
        
    }
    
    
    private static void isThereAnyEmployeeEarningSalaryMoreThan80k() {
        
        System.out.println();
        System.out.println("isThereAnyEmployeeEarningSalaryMoreThan80k : ");
        System.out.println(
                "=====================================================================================================");
        
        //Use anyMatch on stream to check weather any employee is earning salary more than 80k.
        
    }
    
    private static void doesAllEmployeesWontEarnMoreThan95k() {
        
        System.out.println();
        System.out.println("doesAllEmployeesWontEarnMoreThan95k : ");
        System.out.println(
                "=====================================================================================================");
        
        //Use noneMatch on stream, it is like opposite of allMatch.
        
    }
    
}
