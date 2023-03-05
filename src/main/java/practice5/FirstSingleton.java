package practice5;

// только для однопоточных
public class FirstSingleton {

    private static FirstSingleton instance;

    private FirstSingleton(){}

    public static FirstSingleton getInstance() {
        if (instance == null) instance = new FirstSingleton();
        return instance;
    }
}
