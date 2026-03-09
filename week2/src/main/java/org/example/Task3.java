package org.example;

public class Task3 {
    public void printPattern(int n) {
        // outer loop for rows
        for (int i = 0; i < n; i++) {
            // inner loop for columns
            for (int j = 0; j < n; j++) {
                if((i + j) % 2 == 0) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Task3 t = new Task3();

        System.out.println("If we pick n = 4 this is what we are going to get: ");
        t.printPattern(4);
    }
}
