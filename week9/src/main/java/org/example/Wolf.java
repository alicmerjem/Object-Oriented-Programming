package org.example;
import java.util.*;

record Wolf(String name, int age) {}

class MainWolf {
    private static List<Wolf> wolfRegistry = new ArrayList<>();

    public static void main(String[] args) {
        wolfRegistry.add(new Wolf("Akela", 5));
        wolfRegistry.add(new Wolf("Raksha", 4));
        wolfRegistry.add(new Wolf("Grey", 2));

        Optional<Wolf> foundWolf = findWolfByName("Akela");
        foundWolf.ifPresent(w -> System.out.println("Found: " + w.name()));

        Optional<Wolf> missingWolf = findWolfByName("Balto");
        Wolf result = missingWolf.orElse(new Wolf("Generic Wolf", 1));
        System.out.println("Result: " + result.name());

        try {
            Wolf criticalWolf = findWolfByName("Ghost").orElseThrow(() ->
                    new NoSuchElementException("Wolf not found in registry!"));
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static Optional<Wolf> findWolfByName(String name) {
        for (Wolf wolf : wolfRegistry) {
            if (wolf.name().equalsIgnoreCase(name)) {
                return Optional.of(wolf);
            }
        }
        return Optional.empty();
    }
}