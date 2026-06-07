package org.example.generics;
import java.util.*;

public class Employee {
    private int id;
    private String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
}

class Manager extends Employee {
    public Manager(int id, String name) {
        super(id, name);
    }
}

class Developer extends Employee {
    public Developer(int id, String name) {
        super(id, name);
    }
}

class Company<T extends Employee> {
    private List<T> staff = new ArrayList<>();

    public void addEmployee(T employee) {
        staff.add(employee);
    }

    public List<T> filterByName(String name) {
        List<T> result = new ArrayList<>();

        for (T employee : staff) {
            if (employee.getName().equalsIgnoreCase(name)) {
                result.add(employee);
            }
        }

        return result;
    }

    public T getById(int id) {
        for (T employee : staff) {
            if (employee.getId() == id) {
                return employee;
            }
        }
        return null;
    }
}
