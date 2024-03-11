package com.learning.core.day5;
import java.util.*;

class Person implements Comparable<Person> {
    private int id;
    private String name;
    private int age;
    private double salary;

    public Person(int id, String name, int age, double salary) {
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
        return "id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary;
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
        Person person = (Person) obj;
        return id == person.id;
    }

    @Override
    public int compareTo(Person other) {
        return Integer.compare(this.id, other.id);
    }
}


public class D05P10 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeSet<Person> personSet = new TreeSet<>();
        for (int i = 1; i <= 6; i++) {
            System.out.println("Enter person details " + i + ":");
            System.out.print("ID: ");
            int id = sc.nextInt();
            sc.nextLine(); 
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Age: ");
            int age = sc.nextInt();
            System.out.print("Salary: ");
            double salary = sc.nextDouble();
            sc.nextLine(); 
            personSet.add(new Person(id, name, age, salary));
        }
        for (Person person : personSet) {
            if (person.getName().toLowerCase().startsWith("j")) {
                System.out.println("The first person is : " + person);
                break;
            }
        }
        sc.close();
    }
}

