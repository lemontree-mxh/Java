import java.io.*;

public class EmployeeTest {
    public static void main(String args[]){
        Employee empOne = new Employee("Apple");
        Employee empTwo = new Employee("Pear");

        empOne.empAge(26);
        empOne.empDesignation("Senior Software Engineer");
        empOne.empSalary(10000);
        empOne.printEmployee();

        empTwo.empAge(21);
        empTwo.empDesignation("Software Engineer");
        empTwo.empSalary(5000);
        empTwo.printEmployee();

        System.out.println(empOne.DEPARTMENT + " average salary:" + empOne.salary);
    }
}
