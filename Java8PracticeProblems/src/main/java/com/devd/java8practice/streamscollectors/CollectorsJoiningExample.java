package com.devd.java8practice.streamscollectors;

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
        
    }
    
    private static void concatAllEmployeeNamesWithDelimiterAndPrint() {
        
        System.out.println();
        System.out.println("concatAllEmployeeNamesWithDelimiterAndPrint : ");
        System.out.println(
                "=====================================================================================================");
        
        //use joining method on Collectors, use "-" as the delimiter.
        
    }
    
    private static void concatAllEmployeeNamesWithDelimiterPrefixSuffixAndPrint() {
        
        System.out.println();
        System.out.println("concatAllEmployeeNamesWithDelimiterPrefixSuffixAndPrint : ");
        System.out.println(
                "=====================================================================================================");
        
        //use joining method on Collectors. use "-" as delimiter, "[" as prefix, "]" as suffix.
        
    }
}
