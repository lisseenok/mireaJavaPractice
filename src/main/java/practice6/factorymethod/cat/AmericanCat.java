package practice6.factorymethod.cat;

import practice6.factorymethod.cat.Cat;

public class AmericanCat implements Cat {
    @Override
    public void say() {
        System.out.println("i am american cat");
    }
}
