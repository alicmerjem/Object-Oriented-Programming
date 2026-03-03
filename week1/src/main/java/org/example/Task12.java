package org.example;
import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        String username = "admin";
        String password = "1234";

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the username: ");
        String username1 = scanner.nextLine();
        System.out.println("Please etner the password: ");
        String password1 = scanner.nextLine();

        if (username.equals(username1) && password.equals(password1)) {
            System.out.println("Welcome, Admin!");
        } else {
            System.out.println("Access denied");
        }
    }
}
