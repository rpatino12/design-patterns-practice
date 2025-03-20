package org.example.factories;

import org.example.products.buttons.Button;
import org.example.products.buttons.WindowsButton;
import org.example.products.checkboxes.Checkbox;
import org.example.products.checkboxes.WindowsCheckbox;

/**
 * Each concrete factory extends basic factory and responsible for creating
 * products of a single variety.
 */
public class WindowsFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
