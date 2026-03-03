package org.example;
import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int number = scanner.nextInt();

        for(int i = number; i > 0; i--) {
            System.out.println(i);
        }
    }
}
