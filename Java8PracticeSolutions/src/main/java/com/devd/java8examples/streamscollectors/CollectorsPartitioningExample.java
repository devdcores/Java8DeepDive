package com.devd.java8examples.streamscollectors;

import com.devd.java8examples.db.Employee;
import com.devd.java8examples.db.EmployeeDatabase;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author: Devaraj Reddy,
 * Date : 2019-08-12
 */
public class CollectorsPartitioningExample {
    
    private static Gson gson = new GsonBuilder().setPrettyPrinting().create();
    
    public static void main(String[] args) {
        
        partitionByExperience();
        
    }
    
    private static void partitionByExperience() {
        
        System.out.println();
        System.out.println("partitionByExperience : ");
        System.out.println(
                "=====================================================================================================");
        
        //use partitionBy to split the results by who having experience greater than 5.
        
        Map<Boolean, List<Employee>> collect = EmployeeDatabase.getEmployees()
                                                               .stream()
                                                               .collect(Collectors.partitioningBy((a) -> a.getExperienceInYears() > 5));
        
        System.out.println(gson.toJson(collect));
        
    }
}
