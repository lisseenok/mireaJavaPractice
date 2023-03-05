package practice6.abstractfactory.factories;

import practice6.abstractfactory.dog.Dog;
import practice6.factorymethod.cat.Cat;

public interface AnimalFactory {

    Dog createDog();
    Cat createCat();
}
