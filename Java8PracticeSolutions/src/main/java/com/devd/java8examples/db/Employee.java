package com.devd.java8examples.db;

import java.util.List;

/**
 * @author: Devaraj Reddy,
 * Date : 2019-08-12
 */
public class Employee {
    
    private int id;
    private String employeeName;
    private int experienceInYears;
    private double salary;
    private List<String> skillSet;
    private String gender;
    
    public Employee(int id, String employeeName, int experienceInYears, double salary, List<String> skillSet,
                    String gender) {
        this.id = id;
        this.employeeName = employeeName;
        this.experienceInYears = experienceInYears;
        this.salary = salary;
        this.skillSet = skillSet;
        this.gender = gender;
    }
    
    public Employee() {
    }
    
    public int getId() {
        return id;
    }
    
    public String getEmployeeName() {
        return employeeName;
    }
    
    public int getExperienceInYears() {
        return experienceInYears;
    }
    
    public double getSalary() {
        return salary;
    }
    
    public List<String> getSkillSet() {
        return skillSet;
    }
    
    public String getGender() {
        return gender;
    }
    
    @Override
    public String toString() {
        return "Employee{" +
                       "id=" + id +
                       ", employeeName='" + employeeName + '\'' +
                       ", experienceInYears=" + experienceInYears +
                       ", salary=" + salary +
                       ", skillSet=" + skillSet +
                       ", gender='" + gender + '\'' +
                       '}';
    }
}
