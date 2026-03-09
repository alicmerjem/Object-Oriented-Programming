package org.example;

public class Task9 {
    public int findGCD(int a, int b) {
        while (b!=0) {
            int remainder = a % b;
            a = b;
            b = remainder;
        }

        return a;
    }

    public static void main(String[] args) {
        Task9 t = new Task9();

        System.out.println("GCD of 5 and 10: " + t.findGCD(5, 10));
    }
}
