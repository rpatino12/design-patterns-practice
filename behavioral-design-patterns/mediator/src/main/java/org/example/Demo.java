package org.example;

import org.example.components.AddButton;
import org.example.components.DeleteButton;
import org.example.components.Filter;
import org.example.components.List;
import org.example.components.SaveButton;
import org.example.components.TextBox;
import org.example.components.Title;
import org.example.mediator.Editor;
import org.example.mediator.Mediator;

import javax.swing.*;

/**
 * Demo class. Everything comes together here.
 */
public class Demo {
    public static void main(String[] args) {
        Mediator mediator = new Editor();

        mediator.registerComponent(new Title());
        mediator.registerComponent(new TextBox());
        mediator.registerComponent(new AddButton());
        mediator.registerComponent(new DeleteButton());
        mediator.registerComponent(new SaveButton());
        mediator.registerComponent(new List(new DefaultListModel()));
        mediator.registerComponent(new Filter());

        mediator.createGUI();
    }
}
