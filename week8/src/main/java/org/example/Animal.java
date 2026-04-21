package org.example;
import java.util.*;

abstract class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() { return name; }
    public int getAge() { return age; }

    public abstract void speak();
}

class Lion extends Animal implements Comparable<Lion> {
    public Lion(String name, int age) {
        super(name, age);
    }

    @Override
    public void speak() {
        System.out.println("Roar");
    }

    @Override
    public int compareTo(Lion other) {
        return Integer.compare(this.getAge(), other.getAge());
    }
}

class Elephant extends Animal implements Comparable<Elephant> {
    public Elephant(String name, int age) {
        super(name, age);
    }

    @Override
    public void speak() {
        System.out.println("Toot");
    }

    @Override
    public int compareTo(Elephant other) {
        return Integer.compare(this.getAge(), other.getAge());
    }
}

class AnimalCage<T extends Animal & Comparable<T>> {
    private List<T> animals = new ArrayList<>();

    public void addAnimal(T animal) {
        animals.add(animal);
    }

    public void sortAnimal() {
        Collections.sort(animals);
    }

    public void printAnimals() {
        for (T animal : animals) {
            System.out.println(animal.getName() + " " + animal.getAge());
            animal.speak();
        }
    }
}

class Testing {
    public static void main(String[] args) {
        AnimalCage<Lion> lion = new AnimalCage<>();
        lion.addAnimal(new Lion("Lion", 18));
        lion.addAnimal(new Lion("Lion", 19));
        lion.addAnimal(new Lion("Lion", 20));

        lion.printAnimals();

        AnimalCage<Elephant> elephant = new AnimalCage<>();
        elephant.addAnimal(new Elephant("Elephant", 18));
        elephant.addAnimal(new Elephant("Elephant", 19));

        elephant.printAnimals();
    }
}
