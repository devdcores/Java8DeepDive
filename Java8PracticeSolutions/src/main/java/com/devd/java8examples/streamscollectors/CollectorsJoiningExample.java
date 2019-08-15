package com.devd.java8examples.streamscollectors;

import com.devd.java8examples.db.Employee;
import com.devd.java8examples.db.EmployeeDatabase;

import java.util.stream.Collectors;

/**
 * @author: Devaraj Reddy,
 * Date : 2019-08-12
 */
public class CollectorsJoiningExample {
    
    public static void main(String[] args) {
        
        concatAllEmployeeNamesAndPrint();
        
        concatAllEmployeeNamesWithDelimiterAndPrint();
        
        concatAllEmployeeNamesWithDelimiterPrefixSuffixAndPrint();
        
    }
    
    
    private static void concatAllEmployeeNamesAndPrint() {
        
        System.out.println();
        System.out.println("concatAllEmployeeNamesAndPrint : ");
        System.out.println(
                "=====================================================================================================");
        
        //use joining method on Collectors.
        
        String concatEmpNames = EmployeeDatabase.getEmployees()
                                                .stream()
                                                .map(Employee::getEmployeeName)
                                                .collect(Collectors.joining());
        
        System.out.println(concatEmpNames);
        
    }
    
    private static void concatAllEmployeeNamesWithDelimiterAndPrint() {
        
        System.out.println();
        System.out.println("concatAllEmployeeNamesWithDelimiterAndPrint : ");
        System.out.println(
                "=====================================================================================================");
        
        //use joining method on Collectors, use "-" as the delimiter.
        
        String concatEmpNamesWithDelimiter = EmployeeDatabase.getEmployees()
                                                             .stream()
                                                             .map(Employee::getEmployeeName)
                                                             .collect(Collectors.joining("-"));
        
        System.out.println(concatEmpNamesWithDelimiter);
        
    }
    
    private static void concatAllEmployeeNamesWithDelimiterPrefixSuffixAndPrint() {
        
        System.out.println();
        System.out.println("concatAllEmployeeNamesWithDelimiterPrefixSuffixAndPrint : ");
        System.out.println(
                "=====================================================================================================");
        
        //use joining method on Collectors. use "-" as delimiter, "[" as prefix, "]" as suffix.
        
        String concatEmpNamesWithDelimiterWithPrefixSuffix = EmployeeDatabase.getEmployees()
                                                             .stream()
                                                             .map(Employee::getEmployeeName)
                                                             .collect(Collectors.joining("-", "[", "]"));
        
        System.out.println(concatEmpNamesWithDelimiterWithPrefixSuffix);
        
    }
}
