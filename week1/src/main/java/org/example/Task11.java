package org.example;
import java.util.*;

public class Task11 {
    public static void main(String[] args) {
        String password = "JavaRocks";

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the password: ");
        String password1 = scanner.nextLine();

        if(password.equals(password1)) {
            System.out.println("Access granted.");
        } else {
            System.out.println("Access denied");
        }
    }
}
