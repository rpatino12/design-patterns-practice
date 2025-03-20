package org.example.app;

import org.example.factories.GUIFactory;
import org.example.products.buttons.Button;
import org.example.products.checkboxes.Checkbox;

/**
 * CLIENT CODE
 *
 * Factory users don't care which concrete factory they use since they work with
 * factories and products through abstract interfaces.
 */
public class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint() {
        System.out.println("Application render process starts");
        button.paint();
        checkbox.paint();
        System.out.println("Application render process ends");
    }
}
