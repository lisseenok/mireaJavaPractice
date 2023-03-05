package practice6.abstractfactory;

import practice6.abstractfactory.dog.Dog;
import practice6.abstractfactory.factories.AnimalFactory;
import practice6.factorymethod.cat.Cat;

public class Application {

    private Dog dog;

    private Cat cat;

    public Application(AnimalFactory factory) {
        cat = factory.createCat();
        dog = factory.createDog();
    }

    public void say() {
        cat.say();
        dog.say();
    }
}
