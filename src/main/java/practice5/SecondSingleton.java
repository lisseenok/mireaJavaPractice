package practice5;

// низкая производительность
public class SecondSingleton {
    private static SecondSingleton instance;

    public static synchronized SecondSingleton getInstance() {
        if (instance == null) {
            instance = new SecondSingleton();
        }
        return instance;
    }
}
