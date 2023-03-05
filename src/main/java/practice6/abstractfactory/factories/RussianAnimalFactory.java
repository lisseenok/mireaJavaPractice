package practice6.abstractfactory.factories;

import practice6.abstractfactory.dog.Dog;
import practice6.abstractfactory.dog.RussianDog;
import practice6.factorymethod.cat.Cat;
import practice6.factorymethod.cat.RussianCat;

public class RussianAnimalFactory implements AnimalFactory{
    @Override
    public Dog createDog() {
        return new RussianDog();
    }

    @Override
    public Cat createCat() {
        return new RussianCat();
    }
}
