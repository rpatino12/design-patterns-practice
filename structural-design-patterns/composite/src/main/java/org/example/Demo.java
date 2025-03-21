package org.example;

import org.example.editor.ImageEditor;
import org.example.shapes.Circle;
import org.example.shapes.Rectangle;
import org.example.shapes.CompoundShape;
import org.example.shapes.Dot;

import java.awt.*;

/**
 * CLIENT CODE
 *
 */
public class Demo {
    public static void main( String[] args ) {
        ImageEditor editor = new ImageEditor();

        // Here we are loading one lea objects (simple circle object)
        // and two compound objects to the canvas, the first compound object
        // with one circle and one dot, the second compound object with one
        // rectangle and four dots.
        editor.loadShapes(
                new Circle(10, 10, 10, Color.BLUE),

                new CompoundShape(
                        new Circle(110, 110, 50, Color.RED),
                        new Dot(160, 160, Color.RED)
                ),

                new CompoundShape(
                        new Rectangle(250, 250, 100, 100, Color.GREEN),
                        new Dot(240, 240, Color.GREEN),
                        new Dot(240, 360, Color.GREEN),
                        new Dot(360, 360, Color.GREEN),
                        new Dot(360, 240, Color.GREEN)
                )
        );
    }
}
