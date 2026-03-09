package org.example;

public class Task5 {
    void printDiamond(int n) {
        // top half
        for (int i = 1; i <= n; i+= 2) {
            // print spaces
            for (int j = 0; j < (n - i) / 2; j++) {
                System.out.print(" ");
            }

            // print stars
            for(int j = 0; j < i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // bottom half
        for (int i = n - 2; i >= 1; i -= 2) {
            // print spaces
            for(int j = 0; j < (n - i) / 2; j++) {
                System.out.print(" ");
            }

            // print stars
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        Task5 t5 = new Task5();

        t5.printDiamond(5);
    }
}
