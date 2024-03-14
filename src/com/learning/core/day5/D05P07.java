package com.learning.core.day5;
import java.util.*;
import java.util.Scanner;

class Person2 implements Comparable<Person2> {
    private int id;
    private String name;
    private int age;
    private double salary;

    public Person2(int id, String name, int age, double salary) {
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

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + salary;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Person2 person = (Person2) obj;
        return id == person.id;
    }

    @Override
    public int compareTo(Person2 other) {
        return Integer.compare(this.id, other.id);
    }
}

public class D05P07 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeSet<Person2> person2Set = new TreeSet<>();

        // Taking input for 6 persons
        for (int i = 1; i <= 6; i++) {
            System.out.println("Enter details for person " + i + ":");
            System.out.print("ID: ");
            int id = sc.nextInt();
            sc.nextLine(); // Consume newline
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Age: ");
            int age = sc.nextInt();
            System.out.print("Salary: ");
            double salary = sc.nextDouble();
            sc.nextLine(); // Consume newline

            person2Set.add(new Person2(id, name, age, salary));
        }

        for (Person2 person : person2Set) {
            System.out.printf("%d %s %.1f\n", person.getId(), person.getName(), person.getSalary());
        }
    }
}

	