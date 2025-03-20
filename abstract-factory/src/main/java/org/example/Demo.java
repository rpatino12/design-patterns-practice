package org.example;

import org.example.app.Application;
import org.example.factories.GUIFactory;
import org.example.factories.MacOsFactory;
import org.example.factories.WindowsFactory;

/**
 * Demo class. Everything comes together here.
 */

public class Demo {

    /**
     * Application picks the factory type and creates it in run time (usually at
     * initialization stage), depending on the configuration or environment
     * variables.
     */
    public static Application configureApplication(){
        Application app;
        GUIFactory factory;

        String osName = System.getProperty("os.name").toLowerCase();
//        String osName = "MacOS by Apple".toLowerCase();

        if (osName.contains("mac")) {
            factory = new MacOsFactory();
        } else {
            factory = new WindowsFactory();
        }
        app = new Application(factory);
        return app;
    }

    public static void main( String[] args ) {
        Application app = configureApplication();
        app.paint();
    }
}
