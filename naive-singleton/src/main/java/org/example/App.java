package org.example;

/**
 * Naïve Singleton (single-threaded)
 * It’s pretty easy to implement a sloppy Singleton.
 * You just need to hide the constructor and implement a static creation method.
 */
public class App {
    public static void main( String[] args ) {
        System.out.println("If you see the same value, then singleton was reused (yay!)" + "\n" +
                "If you see different values, then 2 singletons were created (boo!!)" + "\n\n" +
                "RESULT:" + "\n");

        Singleton singleton = Singleton.getInstance("FOO");
        Singleton anotherSingleton = Singleton.getInstance("BAR");
        System.out.println(singleton.value);
        System.out.println(anotherSingleton.value);
    }
}
