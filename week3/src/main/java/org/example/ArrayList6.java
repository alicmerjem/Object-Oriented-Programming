package org.example;
import java.util.ArrayList;

public class ArrayList6 {
    public static void print(ArrayList<String> list) {
        for (String word : list) {
            System.out.println(word);
        }
    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("java");
        list.add("python");
        list.add("mysql");

        print(list);
    }
}
