package org.example;

public class Task4 {
    public void collatzSteps(int n) {
        // continue until we reach 1
        while (n != 1) {
            System.out.print(n + " -> ");

            // logic: check if even or odd
            if (n%2 == 0) {
                n = n / 2;
            } else {
                n = (3 * n) + 1;
            }
        }

        // print the final 1, which is the stopping point
        System.out.println(1);
    }

    public static void main(String[] args) {
        Task4 t4 = new Task4();
        t4.collatzSteps(4);
    }
}
