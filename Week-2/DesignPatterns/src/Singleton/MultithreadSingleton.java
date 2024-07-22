package Singleton;

public class MultithreadSingleton {
    private static MultithreadSingleton instance = null;
    private MultithreadSingleton() {

    }

    public static MultithreadSingleton getInstance() {
        // Question arise why we have two null check here.
        // Reason for first null check is same as explained in method level synchronization why create lock if our object is already created.
        if(instance == null) {
            // Our method is static, so we have class level locking here
            synchronized (MultithreadSingleton.class) {
                //Reason for second null check is lets say two object are come inside first null at same time
                // One call has taken lock and proceeds for creating object first time. Now once lock is released for t1
                // t2 should not create object because its already created and that's why we have second null check.
                if(instance == null) {
                    instance = new MultithreadSingleton();
                }
            }
        }
        return instance;
    }
}