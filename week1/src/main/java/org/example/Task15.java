package org.example;
import java.util.Scanner;
import java.util.Random;

public class Task15 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int numberToGuess = random.nextInt(100) + 1;
        int userGuess = 0;
        int numberOfTries = 0;

        System.out.println("I am thinking of a number between 1 and 100");
        System.out.println("Can you guess what it is?");

        while(userGuess != numberToGuess) {
            System.out.println("Enter your guess: ");
            userGuess = scanner.nextInt();
            numberOfTries++;

            if(userGuess < numberToGuess) {
                System.out.println("Too low, try again");
            } else if (userGuess > numberToGuess) {
                System.out.println("Too high, try again");
            } else {
                System.out.println("Congratulations, you guessed it!");
            }
        }
    }
}
