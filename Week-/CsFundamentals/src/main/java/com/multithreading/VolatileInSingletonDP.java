package com.multithreading;

public class VolatileInSingletonDP {
    //t1 -> cpu -> cache -> RAM1
    //t2 -> cpu -> cache -> RAM1
    //volatile variable directly store in RAM as a shared variable not in Cache.
    private static volatile VolatileInSingletonDP instance;

    private VolatileInSingletonDP(){
        System.out.println("TV Set instantiated");
    }

    public static VolatileInSingletonDP getInstance(){
        if (instance == null){
            synchronized (VolatileInSingletonDP.class){
                if (instance == null)
                    instance = new VolatileInSingletonDP();
            }
        }
        return instance;
    }
}
