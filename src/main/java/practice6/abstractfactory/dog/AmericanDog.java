package practice6.abstractfactory.dog;

import practice6.abstractfactory.dog.Dog;

public class AmericanDog implements Dog {
    @Override
    public void say() {
        System.out.println("i am american dog");
    }
}
