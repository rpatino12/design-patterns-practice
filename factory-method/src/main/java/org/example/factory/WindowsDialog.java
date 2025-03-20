package org.example.factory;

import org.example.buttons.Button;
import org.example.buttons.HtmlButton;
import org.example.buttons.WindowsButton;

/**
 * Windows Dialog will produce Windows buttons.
 */
public class WindowsDialog extends Dialog {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
