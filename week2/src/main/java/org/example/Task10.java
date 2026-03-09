package org.example;

public class Task10 {
    public int power(int base, int exponent) {
        int result = 1; // because any number to the power of 1 is 1

        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }

        return result;
    }

    public static void main(String[] args) {
        Task10 t = new Task10();

        System.out.println("Calculating 6 to the power of 2: " + t.power(6, 2));
    }
}
