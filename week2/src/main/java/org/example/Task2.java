package org.example;

public class Task2 {
    public int sumToSingleDigit(int n) {
        while (n >= 10) { // repeat until n is a single digit - 0 until 9
            int sum = 0;

            while (n > 0) { // extract and sum each digit
                sum += n % 10; // get the last digit
                n /= 10; // remove the last digit
            }

            n = sum; // set n to new sum to check if we need to loop again
        }
        return n;
    }

    public static void main(String[] args) {
        Task2 sum = new Task2();

        int result = sum.sumToSingleDigit(987);
        System.out.println("The result is: " + result);
    }
}
