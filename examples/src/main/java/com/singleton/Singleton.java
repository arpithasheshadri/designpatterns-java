package com.singleton;

public class Singleton {
    private static Singleton instance;

    private Singleton() {
        System.out.println("Singleton is instantiated");
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton(); 
            return instance;
        } else {
            return instance;
        }
    }

    public static void doSomething()
    {
        System.out.println("Somethong is Done.");
    }
}

/**
 * 1. This way of implementing Singleton is not thread safe, cuz if two threads call getInstance() at the 
 * same time when instance is null, they might create multiple instances, breaking the Singleton pattern
 * 2. doSomething() is static, while getInstance() returns an instance of Singleton. Calling getInstance().doSomething(); 
 * is misleading since doSomething() should ideally be an instance method
 * 
 * Solution -
 * 
 * 1. Using synchronization - Fixes the thread-safety issue but synchronization causes performance overhead
 * 2. Bill Pugh Singleton - Best performance, lazy initialization, and thread-safe without needing explicit synchronization
 */ 
 