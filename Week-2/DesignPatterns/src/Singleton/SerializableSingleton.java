package Singleton;

import java.io.Serial;
import java.io.Serializable;

public class SerializableSingleton implements Serializable {
    private static  SerializableSingleton instance = null;
    private SerializableSingleton() {

    }

    public static SerializableSingleton getInstance() {
        if(instance == null) {
            instance = new SerializableSingleton();
        }
        return instance;
    }

    /**
     * This is the key method that is responsible during deserialization process
     * This method gets invoked, and we are simply returning an already created object
     */
    @Serial
    protected Object readResolve() {
        return instance;
    }
}