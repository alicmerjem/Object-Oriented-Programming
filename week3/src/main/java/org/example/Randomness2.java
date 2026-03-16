package org.example;
import java.util.Random;

public class Randomness2 {
    private Random random;

    public Randomness2() {
        this.random = new Random();
    }

    public String forecastWeather() {
        double probability = this.random.nextDouble();
        if (probability < 0.8) {
            return "Wind";
        } else if (probability < 0.9) {
            return "Sunny";
        } else {
            return "Cloudy";
        }
    }
}
