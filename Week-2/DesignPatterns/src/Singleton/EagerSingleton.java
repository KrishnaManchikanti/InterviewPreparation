package Singleton;

import java.io.Serializable;

public class EagerSingleton implements Serializable {
    private static final EagerSingleton instance = new EagerSingleton();
    private EagerSingleton() {
        // Do your init work here
    }
    public static  EagerSingleton getInstance() {
        return instance;
    }
}