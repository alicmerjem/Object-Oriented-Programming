package org.example.additionaltasks;
import java.util.*;

enum Gender {
    MALE, FEMALE
}

public class Person {
    private String firstName;
    private int age;
    private Gender gender;

    public Person(String firstName, int age, Gender gender) {
        this.firstName = firstName;
        this.age = age;
        this.gender = gender;
    }

    public String getFirstName() { return firstName; }
    public int getAge() { return age; }
    public Gender getGender() { return gender; }
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public void setAge(int age) { this.age = age; }
    public void setGender(Gender gender) { this.gender = gender; }
}

class Assistant extends Person {
    public Assistant(String firstName, int age, Gender gender) {
        super(firstName, age, gender);
    }
}

class Professor extends Person {
    public Professor(String firstName, int age, Gender gender) {
        super(firstName, age, gender);
    }
}

class Company<T extends Person> {
    private List<T> employees;

    public Company(List<T> employees) {
        this.employees = employees;
    }

    public List<T> getEmployees() { return employees; }
    public void setEmployees(List<T> employees) { this.employees = employees; }

    public List<T> filterByGender(Gender gender) {
        List<T> result = new ArrayList<>();

        for (T employee : employees) {
            if (employee.getGender() == gender) {
                result.add(employee);
            }
        }

        return result;
    }

    public T getByFirstName(String firstName) {
        for (T employee : employees) {
            if (employee.getFirstName().equalsIgnoreCase(firstName)) {
                return employee;
            }
        }
        return null;
    }
}
