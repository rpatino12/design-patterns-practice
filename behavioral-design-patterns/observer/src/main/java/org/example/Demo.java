package org.example;

import org.example.listeners.EmailNotificationListener;
import org.example.listeners.LogOpenListener;
import org.example.publisher.Editor;

/**
 * Hello world!
 *
 */
public class Demo {
    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.events.subscribe("open", new LogOpenListener("/path/to/log/file.txt"));
        editor.events.subscribe("save", new LogOpenListener("/path/to/log/file.txt"));
        editor.events.subscribe("open", new EmailNotificationListener("user@example.com"));
        editor.events.subscribe("save", new EmailNotificationListener("admin@example.com"));

        try {
            editor.openFile("test.txt");
            editor.saveFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
