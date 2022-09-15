package org.example.lesson3.task5;

import java.util.ArrayList;
import java.util.List;

public class DogFarm {
    private List<Dog> dogList = new ArrayList<>();

    public void addDogs(Dog ... dogs){
        for (Dog dog : dogs){
            dogList.add(dog);
        }
    }

    @Override
    public String toString() {
        return "DogFarm{" +
                "dogList=" + dogList +
                '}';
    }
}
