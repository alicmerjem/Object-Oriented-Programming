package org.example;

public class Task1 {
    public void FizzBuzz(int x, int y) {
        for (int i = x; i <= y; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        Task1 fizzbuzz = new Task1();

        System.out.println("Testing fizzbuzz from 1 to 15");
        fizzbuzz.FizzBuzz(1,15);
    }
}
