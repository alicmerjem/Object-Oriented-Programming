package org.example;

public class Task6 {
    public int sumNatural(int n) {
        int sum = 0;

        // loop from 1 and up to including n
        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        return sum;
    }

    public static void main(String[] args) {
        Task6 t = new Task6();

        System.out.println("The sum is: " + t.sumNatural(5));

        int result = t.sumNatural(10);
        System.out.println("the sum of 10 is: " + result);
    }
}
