import java.io.*;

public class Employee {
    public String name;
    int age;
    String designation;
    public static double salary;
    public static final String DEPARTMENT = "Development";

    public Employee(String empName){
        name = empName;
    }

    public void empAge(int empAge){
        age = empAge;
    }

    public void empDesignation(String empDesig){
        designation = empDesig;
    }

    public void empSalary(double empSalary){
        salary = empSalary;
    }

    public void printEmployee(){
        System.out.println("Name:" + name);
        System.out.println("Age:" + age);
        System.out.println("Designation:" + designation);
        System.out.println("Salary:" + salary);
    }
}
