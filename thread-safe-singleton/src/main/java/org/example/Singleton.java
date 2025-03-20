package org.example;

public final class Singleton {
    // The field must be declared volatile so that double check lock would work
    // correctly.
    private static volatile Singleton instance;

    // The singleton can have multiple instance fields, here we just have one field "value"
    public String value;

    private Singleton(String value) {
        this.value = value;
    }

    public static Singleton getInstance(String value) {
        // This approach for multithreaded environments is called "Double-Checked Locking" (DCL)
        // It exists to prevent race condition between multiple threads that may attempt
        // to get singleton instance at the same time
        Singleton result = instance;
        if (result != null) {
            return result;
        }

        synchronized(Singleton.class) {
            if (instance == null) {
                instance = new Singleton(value);
            }
            return instance;
        }
    }
}
