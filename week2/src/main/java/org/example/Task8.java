package org.example;

public class Task8 {
    public int countDigits(int n) {
        // edge case, if n is =, it still has one digit
        if (n == 0) return 1;

        // handle negative numbers by turning them into positive ones
        if (n < 0) n = Math.abs(n);

        int count = 0;
        while(n > 0) {
            n /= 10;
            count++;
        }

        return count;
    }

    public static void main(String[] args) {
        Task8 t = new Task8();

        System.out.println("Digits in 45678: " + t.countDigits(45678));
    }
}
