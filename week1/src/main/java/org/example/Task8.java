package org.example;
import java.util.*;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your age: ");
        int age = scanner.nextInt();

        if(age < 18) {
            System.out.println("You are not eligible to vote");

        } else {
            System.out.println("You are eligible to vote");
        }
    }
}
