package org.example.factories;

import org.example.products.buttons.Button;
import org.example.products.buttons.MacOsButton;
import org.example.products.checkboxes.Checkbox;
import org.example.products.checkboxes.MacOsCheckbox;

/**
 * Each concrete factory extends basic factory and responsible for creating
 * products of a single variety.
 */
public class MacOsFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new MacOsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOsCheckbox();
    }
}
