package com.devd.java8examples.streamscollectors;

import com.devd.java8examples.db.Employee;
import com.devd.java8examples.db.EmployeeDatabase;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author: Devaraj Reddy,
 * Date : 2019-08-12
 */
public class CollectorsGroupingExample {
    
    private static Gson gson = new GsonBuilder().setPrettyPrinting().create();
    
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
        
        Map<String, List<String>> groupByMaleAndFemaleEmployeeNames =
                EmployeeDatabase.getEmployees()
                                .stream()
                                .collect(Collectors.groupingBy(Employee::getGender,
                                                               Collectors.mapping(Employee::getEmployeeName,
                                                                                  Collectors.toList())));
        
        System.out.println(gson.toJson(groupByMaleAndFemaleEmployeeNames));
        
    }
    
    private static void printEmployeesTotalSalaryGroupByGender() {
        
        System.out.println();
        System.out.println("printEmployeesTotalSalaryGroupByGender : ");
        System.out.println(
                "=====================================================================================================");
        
        //use groupingBy to group employee by their gender and collect their total salary.
        // use gson to print in json format.
        
        Map<String, Double> totalSalaryGroupedByGender =
                EmployeeDatabase.getEmployees()
                                .stream()
                                .collect(Collectors.groupingBy(Employee::getGender,
                                                               Collectors.summingDouble(Employee::getSalary)));
        
        System.out.println(gson.toJson(totalSalaryGroupedByGender));
        
    }
    
    private static void printEmployeesCountGroupByGender() {
        
        System.out.println();
        System.out.println("printEmployeesCountGroupByGender : ");
        System.out.println(
                "=====================================================================================================");
        
        //use groupingBy to group by gender, and use counting to count the employees on each group.
        
        Map<String, Long> countEmployeesGroupByGender = EmployeeDatabase.getEmployees()
                                                                        .stream()
                                                                        .collect(Collectors.groupingBy(Employee::getGender,
                                                                                                       Collectors.counting()));
        
        System.out.println(gson.toJson(countEmployeesGroupByGender));
    }
    
    
    private static void printWhichEmployeeNameIsGettingMaxSalInTheirExp() {
        
        System.out.println();
        System.out.println("printWhichEmployeeIsGettingMaxSalInTheirExp : ");
        System.out.println(
                "=====================================================================================================");
        
        //use groupingBy to group by experience in years and use collectingAndThen method
        // to get max salary in that group.
        
        Map<Integer, String> groupByExp = EmployeeDatabase.getEmployees()
                                                       .stream()
                                                       .collect(Collectors.groupingBy(Employee::getExperienceInYears,
                                                                Collectors.collectingAndThen(
                                                                Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)),
                                                                (s) -> s.map(Employee::getEmployeeName).orElse(null))
                                                       ));
        
        System.out.println(gson.toJson(groupByExp));
        
    }
    
    private static void printEmployeeNamesGroupByGenderExpAndSalaryMultiLevelGrouping() {
    
        System.out.println();
        System.out.println("printEmployeeNamesGroupByGenderExpAndSalaryMultiLevelGrouping : ");
        System.out.println(
                "=====================================================================================================");
        
        //use groupingBy multiple times to group by gender, experience and salary.
        
        Map<String, Map<String, Map<String, List<String>>>> groupByGenderExpSalary =
                EmployeeDatabase.getEmployees()
                                .stream()
                                .collect(Collectors.groupingBy(Employee::getGender,
                                         Collectors.groupingBy(CollectorsGroupingExample::groupExp,
                                         Collectors.groupingBy(CollectorsGroupingExample::groupSalary,
                                         Collectors.mapping(Employee::getEmployeeName,
                                         Collectors.toList()))
                                )));
        
        System.out.println(gson.toJson(groupByGenderExpSalary));
        
    }
    
    private static String groupExp(Employee k) {
        if (k.getExperienceInYears() > 8) {
            return "Staff Software Engineer";
        } else if (k.getExperienceInYears() >= 5) {
            return "Senior Software Engineer";
        } else {
            return "Software Engineer";
        }
    }
    
    private static String groupSalary(Employee k) {
        if (k.getSalary() >= 70000) {
            return "High Salary";
        } else if (k.getSalary() >= 50000) {
            return "Medium Salary";
        } else {
            return "Low Salary";
        }
    }
}