package org.example;
import java.util.*;

abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

   public abstract void makeSound();

    public String getName() { return name; }
}

class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }

    public void fetch() {
        System.out.println("Fetch the ball!");
    }
}

class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }

    public void purr() {
        System.out.println("Purr!");
    }
}

class Testing1 {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();

        animals.add(new Dog("rex"));
        animals.add(new Cat("luna"));

        for (Animal a : animals) {
            System.out.println(a.getName());
            a.makeSound();

            if (a instanceof Dog) {
                Dog d = (Dog) a;
                d.fetch();
            } else if (a instanceof Cat) {
                Cat c = (Cat) a;
                c.purr();
            }
        }
    }
}
