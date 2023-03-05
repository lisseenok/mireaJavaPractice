package practice6.factorymethod.cat;

import practice6.factorymethod.cat.Cat;

public class RussianCat implements Cat {
    @Override
    public void say() {
        System.out.println("я русский кот");
    }
}
