package org.example;
import java.util.*;

public class Group {
    private ArrayList<Person> members;

    public Group() {
        this.members = new ArrayList<>();
    }

    public void addPerson(Person person) {
        this.members.add(person);
    }

    public void listPeople() {
        System.out.println("List of people: ");
        for (Person person : this.members) {
            System.out.println(person);
        }
    }

    public void removePerson(String name) {
        Person toRemove = null;
        for(Person person : this.members) {
            if(person.getName().equals(name)) {
                toRemove = person;
                break;
            }
        }

        if (toRemove != null) {
            this.members.remove(toRemove);
            System.out.println("removed");
        } else {
            System.out.println("not found");
        }
    }
}
