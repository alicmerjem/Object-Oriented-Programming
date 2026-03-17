package org.example;

public class Task4 {
    public void printDetails(String name) {
        System.out.println("Hi, my name is " + name);
    }

    public void printDetails(String name, int age) {
        System.out.println("Hi, my name is " + name + ", and I am " + age + " years old.");
    }

    public void printDetails(String name, int age, String city) {
        System.out.println("Hi, my name is " + name + ", and I am " + age + " years old. I live in: " + city);
    }
}
