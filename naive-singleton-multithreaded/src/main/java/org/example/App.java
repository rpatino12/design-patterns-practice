package org.example;

/**
 * Naïve Singleton (multithreaded)
 * The same class behaves incorrectly in a multithreaded environment.
 * Multiple threads can call the creation method simultaneously and get several instances of Singleton class.
 */
public class App {
    public static void main( String[] args ) {
        System.out.println("If you see the same value, then singleton was reused (yay!)" + "\n" +
                "If you see different values, then 2 singletons were created (booo!!)" + "\n\n" +
                "RESULT:" + "\n");
        Thread threadFoo = new Thread(new ThreadFoo());
        Thread threadBar = new Thread(new ThreadBar());
        threadFoo.start();
        threadBar.start();
    }

    static class ThreadFoo implements Runnable {
        @Override
        public void run() {
            Singleton singleton = Singleton.getInstance("FOO");
            System.out.println("From THREAD-FOO: " + singleton.value);
        }
    }

    static class ThreadBar implements Runnable {
        @Override
        public void run() {
            Singleton singleton = Singleton.getInstance("BAR");
            System.out.println("From THREAD-BAR: " + singleton.value);
        }
    }
}
