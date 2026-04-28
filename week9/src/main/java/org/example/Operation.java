package org.example;
import java.util.*;

@FunctionalInterface
interface Operation {
    int apply(int a, int b);
}

class TestingLambdas {
    public static void main(String[] args) {
        // Lambdas for different operations
        Operation add = (a, b) -> a + b;
        Operation subtract = (a, b) -> a - b;
        Operation multiply = (a, b) -> a * b;
        Operation divide = (a, b) -> a / b;

        // Printing results using calculate method
        System.out.println("Addition: " + calculate(10, 5, add));
        System.out.println("Subtraction: " + calculate(10, 5, subtract));
        System.out.println("Multiplication: " + calculate(10, 5, multiply));
        System.out.println("Division: " + calculate(10, 5, divide));

        // Bonus: Using a Map to store operations
        Map<String, Operation> operationsMap = new HashMap<>();
        operationsMap.put("add", add);
        operationsMap.put("subtract", subtract);
        operationsMap.put("multiply", multiply);
        operationsMap.put("divide", divide);

        // Simulating user input
        String input = "multiply";
        if (operationsMap.containsKey(input)) {
            int result = calculate(20, 4, operationsMap.get(input));
            System.out.println("Map result (" + input + "): " + result);
        }
    }

    public static int calculate(int a, int b, Operation op) {
        return op.apply(a, b);
    }
}