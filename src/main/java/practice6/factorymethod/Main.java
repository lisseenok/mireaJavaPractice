package practice6.factorymethod;

import practice6.factorymethod.speaker.AmericanCatSpeaker;
import practice6.factorymethod.speaker.CatSpeaker;
import practice6.factorymethod.speaker.RussianCatSpeaker;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        Random random = ThreadLocalRandom.current();
        List<CatSpeaker> catSpeakers = new ArrayList<>();
        catSpeakers.add(new AmericanCatSpeaker());
        catSpeakers.add(new RussianCatSpeaker());

        for (int i = 0; i < 10; i ++) {
            int idx = Math.abs(random.nextInt() % 2) == 0 ? 0 : 1;
            CatSpeaker itemGenerator = catSpeakers.get(idx);
            itemGenerator.say();
        }
    }
}
