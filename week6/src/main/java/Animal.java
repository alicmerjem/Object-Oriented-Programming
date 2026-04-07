import java.util.*;

public class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public void speak() {
        System.out.println("the animal makes a sound");
    }
}

class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println("woof");
    }

    public void fetchBall() {
        System.out.println("fetch ball");
    }

}

class Cat extends  Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println("meow");
    }

    public void scratchSofa() {
        System.out.println("scratch sofa");
    }
}

class Parrot extends  Animal {
    public Parrot(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println("polly wants a cracker");
    }

    public void flyAround() {
        System.out.println("fly around");
    }
}

class Main {
    public static void main(String[] args) {
        ArrayList<Animal> myAnimals = new ArrayList<>();

        myAnimals.add(new Dog("rex"));
        myAnimals.add(new Cat("luna"));

        for (Animal a : myAnimals) {
            a.speak();

            if (a instanceof Dog) {
                Dog myDog = (Dog) a;
                myDog.fetchBall();
            } else if (a instanceof Cat) {
                Cat myCat = (Cat) a;
                myCat.scratchSofa();
            } else if (a instanceof Parrot) {
                Parrot myParrot = (Parrot) a;
                myParrot.flyAround();
            }
        }
    }
}