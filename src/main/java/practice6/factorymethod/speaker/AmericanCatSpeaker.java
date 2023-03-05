package practice6.factorymethod.speaker;

import practice6.factorymethod.cat.AmericanCat;
import practice6.factorymethod.cat.Cat;
import practice6.factorymethod.speaker.CatSpeaker;

public class AmericanCatSpeaker extends CatSpeaker {
    @Override
    public Cat createCat() {
        return new AmericanCat();
    }
}
