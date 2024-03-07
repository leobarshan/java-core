package com.learning.core.day5;
import java.util.Scanner;
import java.util.TreeSet;

class Person8 implements Comparable<Person8> {
    private int id;
    private String name;
    private int age;
    private double salary;

    public Person8(int id, String name, int age, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name.toUpperCase();
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(id);
    }

    @Override
    public int compareTo(Person8 other) {
        return Integer.compare(this.id, other.id);
    }
}

public class D05P08 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        TreeSet<Person8> persons = new TreeSet<>();
        System.out.println("Enter the number of Persons:");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= n; i++) {
            System.out.println("Enter details for person " + i + ":");
            System.out.print("ID: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Age: ");
            int age = sc.nextInt();
            sc.nextLine();
            System.out.print("Salary: ");
            double salary = sc.nextDouble();
            sc.nextLine();

            persons.add(new Person8(id, name, age, salary));
        }

        sc.close();
       
        System.out.println("Names in UpperCase as follows : ");
        for (Person8 person : persons) {
            System.out.println(person);
        }
    }
}