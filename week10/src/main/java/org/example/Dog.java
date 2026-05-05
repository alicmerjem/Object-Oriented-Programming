package org.example;
import java.lang.reflect.*;
import java.lang.annotation.*;

class Dog {
    private final String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void bark() {
        System.out.println("Woof!");
    }

    public void say(String message) {
        System.out.println("Dog says: " + message);
    }

    private void whisper() {
        System.out.println("Secret bark...");
    }

    public static void info() {
        System.out.println("Static info about dogs.");
    }
}

class TestingDogReflection {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
       Dog myDog = new Dog("Snoopy", 3);

       Class<?> clazz = myDog.getClass();

       System.out.println("Class name: " + clazz.getName());

       System.out.println("=== Displaying all the fields ===");
       for (Field field : clazz.getDeclaredFields()) {
           String access = Modifier.toString(field.getModifiers());
           System.out.println(access + " " + field.getType().getSimpleName() + " " + field.getName());
       }

       System.out.println("=== Displaying all the methods ===");
       for (Method method : clazz.getDeclaredMethods()) {
           System.out.println(Modifier.toString(method.getModifiers()) + " " + method.getName() + method.getReturnType().getSimpleName() + method.getName() + java.util.Arrays.toString(method.getParameterTypes()));
       }

       System.out.println("=== Modify the final field name ===");
       Field fieldName = clazz.getDeclaredField("name");
       fieldName.setAccessible(true);
       fieldName.set(myDog, "Clifford");

       System.out.println("Invoke method");
       Method barkMethod = clazz.getMethod("bark");
       barkMethod.invoke("bark");
    }
}
