package org.example;
import java.util.*;

public record Person(String name, int age, int height) {
    public static Person createAnonymus() {
        return new Person("Anonymus", 0, 0);
    }
}

class TestingPerson {
    public static void main(String[] args) {
        Person p1 = new Person("Merjem", 21, 163);
        Person p2 = new Person("Jusuf", 19, 185);
        Person p3 = Person.createAnonymus();

        System.out.println(p1.name());
        System.out.println(p2.name());

        System.out.println(p1);

        if (p1.equals(p2)) {
            System.out.println("p1 and p2 are the same");
        } else {
            System.out.println("p1 and p2 are not the same");
        }
    }
}


