package org.example;

public class Person {
    private String name;
    private int age;
    
    public Person(String name) {
        this.name = name;
        this.age = 0;
    }

    public Person(String name, int age) {
        this.name = name;
        this.setAge(age);
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("age cannot be negative");
        }
    }

    @Override
    public String toString() {
        return "Name: " + this.name + ", Age: " + this.age;
    }

    public void increaseAge() {
        this.age++;
    }

    public boolean isAdult() {
        return this.age >= 18;
    }

    public static void main(String[] args) {
        Person p1 = new Person("merjem");

        Person p2 = new Person("alice");

        p2.increaseAge();
        System.out.println(p2);
        System.out.println("Is person 2 an adult? " + p2.isAdult());

        p1.setAge(-20000);
        System.out.println(p1.getAge());
    }
}
