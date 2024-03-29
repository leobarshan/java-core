package com.learning.core.day5;
import java.util.*;
import java.util.Scanner;

class Participant implements Comparable<Participant> {
    private int id;
    private String name;
    private int age;
    private double salary;

    public Participant(int id, String name, int age, double salary) {
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
        return "ID: " + id + ", Name: " + name + ", Age: " + age + ", Salary: " + salary;
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
        Participant participant = (Participant) obj;
        return id == participant.id;
    }

    @Override
    public int compareTo(Participant other) {
        return Integer.compare(this.id, other.id);
    }
}
public class D05P09 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TreeSet<Participant> participantSet = new TreeSet<>();

       
        for (int i = 1; i <= 6; i++) {
            System.out.println("Enter details for participant " + i + ":");
            System.out.print("ID: ");
            int id = scanner.nextInt();
            scanner.nextLine(); 
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Age: ");
            int age = scanner.nextInt();
            System.out.print("Salary: ");
            double salary = scanner.nextDouble();
            scanner.nextLine(); 

            participantSet.add(new Participant(id, name, age, salary));
        }

      
        double totalSalary = 0;
        for (Participant participant : participantSet) {
            totalSalary += participant.getSalary();
        }

      
        System.out.println((int) totalSalary);
    }
}

