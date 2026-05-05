package org.example;
import java.lang.reflect.*;
import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface VeryImportant { }

@VeryImportant
record Lion(String name) {}



public class Animal {
    private final String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() { return name; }
    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    void speak() {
        System.out.println("The animal makes a sound");
    }

    void say(String message) {
        System.out.println("The animal says: " + message);
    }
}

class TestingAnimalReflection {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        try {
            Animal myAnimal = new Animal("Raccoon", 2);

            Class<?> clazz = myAnimal.getClass();

            System.out.println("=== Displaying all fields ===");

            for (Field f : clazz.getDeclaredFields()) {
                System.out.println(f.getName() + f.getType().getSimpleName());
            }

            System.out.println("=== Displaying all methods ===");
            for (Method m : clazz.getDeclaredMethods()) {
                System.out.println(m.getName() + m.getReturnType().getSimpleName());
            }

            System.out.println("=== Value before modification ===");
            System.out.println(myAnimal.getName() + myAnimal.getAge());

            System.out.println("=== Value after modification ===");
            Field nameField = clazz.getDeclaredField("name");
            nameField.setAccessible(true);
            nameField.set(myAnimal, "Rocco");
            System.out.println(myAnimal.getName());

            System.out.println("=== Using reflection to invoke both methods ===");
            Method speakMethod = clazz.getDeclaredMethod("speak");
            speakMethod.invoke(myAnimal);

            Method sayMethod = clazz.getDeclaredMethod("say", String.class);
            sayMethod.invoke(myAnimal, "hey!");

            System.out.println("=== Checking annotation ===");
            Class<Lion> clazz2 = Lion.class;

            if (clazz2.isAnnotationPresent(VeryImportant.class)) {
                System.out.println(clazz.getSimpleName());
            } else {
                System.out.println("regular class");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}