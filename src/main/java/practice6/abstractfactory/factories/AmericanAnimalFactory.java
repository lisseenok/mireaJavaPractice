package practice6.abstractfactory.factories;

import practice6.abstractfactory.dog.AmericanDog;
import practice6.abstractfactory.dog.Dog;
import practice6.factorymethod.cat.AmericanCat;
import practice6.factorymethod.cat.Cat;

public class AmericanAnimalFactory implements AnimalFactory{
    @Override
    public Dog createDog() {
        return new AmericanDog();
    }

    @Override
    public Cat createCat() {
        return new AmericanCat();
    }
}
