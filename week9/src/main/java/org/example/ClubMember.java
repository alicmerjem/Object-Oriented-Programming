package org.example;
import java.util.*;

public class ClubMember implements Comparable<ClubMember>{
    private String name;
    private int height;

    public ClubMember(String name, int height) {
        this.name = name;
        this.height = height;
    }

    public String getName() { return name; }
    public int getHeight() { return height; }

    @Override
    public int compareTo(ClubMember other) {
        return this.height - other.height;
    }

    @Override
    public String toString() {
        return "ClubMember [name=" + name + ", height=" + height + "]";
    }
}

class TestingClubMember {
    public static void main(String[] args) {
        List<ClubMember> members = new ArrayList<ClubMember>();
        members.add(new ClubMember("Alice", 1));
        members.add(new ClubMember("Bob", 2));
        members.add(new ClubMember("Carl", 3));

        Collections.sort(members);
        System.out.println(members);

        ClubMember target = new ClubMember("", 170);
        int index = Collections.binarySearch(members, target);

        if (index >= 0) {
            System.out.println("Found at " + members.get(index).getName());
        } else {
            System.out.println("Not found");
        }
    }
}
