package practice5;

public class ThirdSingleton {
    private static volatile ThirdSingleton instance;

    public static ThirdSingleton getInstance() {
        ThirdSingleton localInstance = instance;
        if (localInstance == null) {
            synchronized (ThirdSingleton.class) {
                localInstance = instance;
                if (localInstance == null) {
                    instance = localInstance = new ThirdSingleton();
                }
            }
        }
        return localInstance;
    }
}
