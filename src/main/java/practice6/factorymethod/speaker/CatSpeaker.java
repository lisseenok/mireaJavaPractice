package practice6.factorymethod.speaker;

import practice6.factorymethod.cat.Cat;

public abstract class CatSpeaker {

    public void say() {
        Cat cat = createCat();
        cat.say();
    }

    public abstract Cat createCat();
}
