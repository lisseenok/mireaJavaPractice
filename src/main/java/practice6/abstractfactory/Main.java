package practice6.abstractfactory;

import practice6.abstractfactory.factories.AnimalFactory;
import practice6.abstractfactory.factories.RussianAnimalFactory;

public class Main {

    private static Application configureApplication() {
        Application app;
        AnimalFactory factory = new RussianAnimalFactory();
        app = new Application(factory);
        return app;
    }

    public static void main(String[] args) {
        Application app = configureApplication();
        app.say();
    }

}
