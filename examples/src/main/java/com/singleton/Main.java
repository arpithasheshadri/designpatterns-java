package com.singleton;

public class Main {
    public static void main(String[] args) {
        // Singleton example 1
        Singleton singletonobj = Singleton.getInstance();
        singletonobj.doSomething();

        // Singleton example 2
        SingletonThreadSafe singletonobj2 = SingletonThreadSafe.getInstance();
        singletonobj2.doSomething();
    }
}