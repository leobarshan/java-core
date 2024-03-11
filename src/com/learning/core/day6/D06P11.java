package com.learning.core.day6;
import java.util.*;
import java.util.Scanner;

public class D06P11 {
	public static void main(String[] args) {
        Hashtable<Integer, Employee> employeeTable = new Hashtable<>();

        Employee employee1 = new Employee(1001, "Daniel", "Analyst", "L&D");
        Employee employee2 = new Employee(1002, "Thomas", "Tester", "Testing");
        Employee employee3 = new Employee(1003, "Robert", "Product Manager", "Development");
        Employee employee4 = new Employee(1004, "Grace", "Tech Support", "HR");
        Employee employee5 = new Employee(1005, "Charles", "QA Lead", "Testing");
        Employee employee6 = new Employee(1006, "Henry", "Accountant", "Finance");
        employeeTable.put(employee1.getId(), employee1);
        employeeTable.put(employee2.getId(), employee2);
        employeeTable.put(employee3.getId(), employee3);
        employeeTable.put(employee4.getId(), employee4);
        employeeTable.put(employee5.getId(), employee5);
        employeeTable.put(employee6.getId(), employee6);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter employee ID to search: ");
        int searchId = scanner.nextInt();

        Employee foundEmployee = employeeTable.get(searchId);

        if (foundEmployee != null) {
            System.out.println("Employee found:");
            System.out.println(foundEmployee);
        } else {
            System.out.println("Employee with ID " + searchId + " not found.");
        }
        scanner.close();
    }
}
