package com.mjc.stage2;

public class ThreadSafeSingleton {
    // The volatile keyword ensures visibility of changes across threads
    private static volatile ThreadSafeSingleton instance;

    // Private constructor to prevent instantiation
    private ThreadSafeSingleton() {
    }

    // Method to return the singleton instance
    public static ThreadSafeSingleton getInstance() {
        if (instance == null) { // First check (no locking)
            synchronized (ThreadSafeSingleton.class) {
                if (instance == null) { // Second check (with locking)
                    instance = new ThreadSafeSingleton();
                }
            }
        }
        return instance;
    }
}