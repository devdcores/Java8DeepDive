package com.devd.java8practice.streamscollectors;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * @author: Devaraj Reddy,
 * Date : 2019-08-12
 */
public class CollectorsGroupingExample {
    
    static Gson gson = new GsonBuilder().setPrettyPrinting().create();
    
    public static void main(String[] args) {
        
        printEmployeeNamesGroupByGender();
        
        printEmployeesTotalSalaryGroupByGender();
        
        printEmployeesCountGroupByGender();
        
        printWhichEmployeeNameIsGettingMaxSalInTheirExp();
        
        printEmployeeNamesGroupByGenderExpAndSalaryMultiLevelGrouping();
    }
    
    private static void printEmployeeNamesGroupByGender() {
        
        System.out.println();
        System.out.println("printEmployeeNamesGroupByGender : ");
        System.out.println(
                "=====================================================================================================");
        
        //use groupingBy to group employee by their gender and collect their names.
        // use gson to print in json format.
        
    }
    
    private static void printEmployeesTotalSalaryGroupByGender() {
        
        System.out.println();
        System.out.println("printEmployeesTotalSalaryGroupByGender : ");
        System.out.println(
                "=====================================================================================================");
        
        //use groupingBy to group employee by their gender and collect their total salary.
        // use gson to print in json format.
        
    }
    
    private static void printEmployeesCountGroupByGender() {
        
        System.out.println();
        System.out.println("printEmployeesCountGroupByGender : ");
        System.out.println(
                "=====================================================================================================");
        
        //use groupingBy to group by gender, and use counting to count the employees on each group.
        // use gson to print in json format.
        
    }
    
    
    private static void printWhichEmployeeNameIsGettingMaxSalInTheirExp() {
        
        System.out.println();
        System.out.println("printWhichEmployeeIsGettingMaxSalInTheirExp : ");
        System.out.println(
                "=====================================================================================================");
        
        //use groupingBy to group by experience in years and use collectingAndThen method
        // to get max salary in that group.
        // use gson to print in json format.
        
    }
    
    private static void printEmployeeNamesGroupByGenderExpAndSalaryMultiLevelGrouping() {
        
        System.out.println();
        System.out.println("printEmployeeNamesGroupByGenderExpAndSalaryMultiLevelGrouping : ");
        System.out.println(
                "=====================================================================================================");
        
        //use groupingBy multiple times to group by gender, experience and salary.
        // use gson to print in json format.
        
    }
}