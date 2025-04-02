package org.example;

import org.example.shapes.Circle;
import org.example.shapes.CompoundShape;
import org.example.shapes.Dot;
import org.example.shapes.Rectangle;
import org.example.shapes.Shape;
import org.example.visitor.XMLExportVisitor;

/**
 * Hello world!
 *
 */
public class Demo {
    public static void main(String[] args) {
        Dot dot = new Dot(1, 10, 55);
        Circle circle = new Circle(2, 23, 15, 10);
        Rectangle rectangle = new Rectangle(3, 10, 17, 20, 30);

        CompoundShape compoundShape = new CompoundShape(4);
        compoundShape.add(dot);
        compoundShape.add(circle);
        compoundShape.add(rectangle);

        CompoundShape c = new CompoundShape(5);
        c.add(dot);
        compoundShape.add(c);

        export(circle, compoundShape);
    }

    private static void export(Shape... shapes) {
        XMLExportVisitor exportVisitor = new XMLExportVisitor();
        for (Shape shape : shapes){
            System.out.println(exportVisitor.export(shape));
        }
    }
}
