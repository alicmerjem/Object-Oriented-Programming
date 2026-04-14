package org.example;
import java.util.*;

public interface Playable {
    public void play();
}

class Guitar implements Playable{
    private String brand;

    public Guitar(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    @Override
    public void play() {
        System.out.println("Guitar: " + brand);
    }
}

class Piano implements Playable {
    private String brand;

    public Piano(String brand) {
        this.brand = brand;
    }

    @Override
    public void play() {
        System.out.println("Piano: " + brand);
    }

    public String getBrand() {
        return brand;
    }
}

class Drum implements Playable {
    private String brand;

    public Drum(String brand) {
        this.brand = brand;
    }

    @Override
    public void play() {
        System.out.println("Drum: " + brand);
    }

    public String getBrand() {
        return brand;
    }
}

class Testing2 {
    public static void main(String[] args) {
        ArrayList<Playable> instruments = new ArrayList<>();

        instruments.add(new Piano("yamaha"));
        instruments.add(new Guitar("gibson"));
        instruments.add(new Drum("drum workshop"));

        for (Playable p : instruments) {
            p.play();

            if (p instanceof Guitar) {
                Guitar g = (Guitar) p;
                System.out.println("The brand is: " + g.getBrand());
            } else if (p instanceof Piano) {
                Piano pi = (Piano) p;
                System.out.println("The brand is: " + pi.getBrand());
            } else if (p instanceof Drum) {
                Drum d = (Drum) p;
                System.out.println("The brand is: " + d.getBrand());
            }
        }
    }
}
