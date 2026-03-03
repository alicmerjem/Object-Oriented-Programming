package org.example;
import java.util.*;
public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the first number: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Please enter the second number: ");
        int secondNumber = scanner.nextInt();

        if (firstNumber > secondNumber) {
            System.out.println("First number is greater than second number");
        } else if (firstNumber < secondNumber) {
            System.out.println("Second number is greater than first number");
        } else {
            System.out.println("The numbers are equal");
        }
    }
}
