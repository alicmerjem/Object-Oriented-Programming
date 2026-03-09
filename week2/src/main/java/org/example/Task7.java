package org.example;

public class Task7 {
    public String reverseString(String str) {
        String reversed = "";

        // loop backwards
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }

        return reversed;
    }

    public static void main(String[] args) {
        Task7 t = new Task7();

        String result = t.reverseString("Hello Java");
        System.out.println(result);
    }
}
