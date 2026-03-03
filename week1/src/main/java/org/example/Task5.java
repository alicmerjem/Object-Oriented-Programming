package org.example;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the temperature in celsius: ");
        int celsius = scanner.nextInt();

        int fahrenheit = (int) ((celsius * 1.8) + 32);

        System.out.println("The temperature in fahrenheit is: " + fahrenheit);
    }
}
