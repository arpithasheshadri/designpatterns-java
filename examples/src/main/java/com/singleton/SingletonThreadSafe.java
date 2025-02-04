package com.singleton;

// Bill Pugh Singleton
public class SingletonThreadSafe {
    private SingletonThreadSafe() {
        System.out.println("Singleton is instantiated");
    }

    private static class SingletonHelper {
        private static final SingletonThreadSafe INSTANCE = new SingletonThreadSafe();
    }

    public static SingletonThreadSafe getInstance() {
        return SingletonHelper.INSTANCE;
    }

    public void doSomething(){
        System.out.println("Done Something");
    }
}

/*
 * Explanation:

Uses an inner static helper class to create the singleton instance.
Ensures lazy initialization and thread safety.
The INSTANCE is created only when getInstance() is called for the first time.

 */
