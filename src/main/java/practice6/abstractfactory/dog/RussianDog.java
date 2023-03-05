package practice6.abstractfactory.dog;

import practice6.abstractfactory.dog.Dog;

public class RussianDog implements Dog {
    @Override
    public void say() {
        System.out.println("я русская собака");
    }
}
