package practice6.factorymethod.speaker;

import practice6.factorymethod.cat.Cat;
import practice6.factorymethod.cat.RussianCat;
import practice6.factorymethod.speaker.CatSpeaker;

public class RussianCatSpeaker extends CatSpeaker {
    @Override
    public Cat createCat() {
        return new RussianCat();
    }
}
