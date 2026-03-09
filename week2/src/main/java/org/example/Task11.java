package org.example;

public class Task11 {
    public int sumDigits(int n) {
        int sum = 0;

        // handle negative numbers by making them positive
        n = Math.abs(n);

        while(n > 0) {
            sum += n % 10;
            n /= 10;
        }

        return sum;
    }

    public static void main(String[] args) {
        Task11 t = new Task11();
        System.out.println("The sum of 123 is: " + t.sumDigits(123));
    }
}
