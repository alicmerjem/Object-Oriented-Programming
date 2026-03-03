package org.example;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an integer: ");
        int number = scanner.nextInt();

        if(number%2==0) {
            System.out.println("The number is even");
        } else {
            System.out.println("The number is odd");
        }
    }
}
