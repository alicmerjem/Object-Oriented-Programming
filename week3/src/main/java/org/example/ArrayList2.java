package org.example;
import java.util.*;

public class ArrayList2 {
    public static void main(String[] args) {
        ArrayList<String> teachers = new ArrayList<String>();

        teachers.add("becir");
        teachers.add("mirza");
        teachers.add("samira");
        teachers.add("emina");
        teachers.add("adnan");

        System.out.println("Number of teachers: " + teachers.size());

        System.out.println("First teacher on the list: " + teachers.get(0));

        teachers.remove("samira");

        if(teachers.contains("samira")) {
            System.out.println("Samira is here");
        } else {
            System.out.println("Samira is not here");
        }
    }
}
