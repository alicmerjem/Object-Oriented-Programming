package org.example;
import java.util.*;

abstract class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() { return name; }
    public double getSalary() { return salary; }

    public abstract double calculateBonus();

    public String getDetails() {
        return "Name: " + name + ", Salary: " + salary;
    }
}

interface Reportable {
    public String generateReport();
}

class Developer extends Employee implements Reportable {
    private String programmingLanguage;

    public Developer(String name, double salary, String programmingLanguage) {
        super(name, salary);
        this.programmingLanguage  = programmingLanguage;
    }

    public String getProgrammingLanguage() { return programmingLanguage; }

    @Override
    public double calculateBonus() {
        return getSalary() * 0.20;
    }

    @Override
    public String generateReport() {
        return super.getDetails() +  ", Programming Language: " + programmingLanguage;
    }
}

class Manager extends Employee implements Reportable {
    private int teamSize;

    public Manager(String name, double salary, String programmingLanguage, int teamSize) {
        super(name, salary);
        this.teamSize = teamSize;
    }

    public int getTeamSize() { return teamSize; }

    @Override
    public double calculateBonus() { return getSalary() * 0.3; }

    @Override
    public String generateReport() {
        return super.getDetails() +  ", Team Size: " + teamSize;
    }
}

class Testing5 {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<Employee>();
        employees.add(new Developer("Merjem", 5000, "Java"));
        employees.add(new Manager("Dino", 5000,"C++", 10));

        for (Employee e : employees) {
            System.out.println(e.calculateBonus());
            System.out.println(e.getDetails());
        }
    }
}
