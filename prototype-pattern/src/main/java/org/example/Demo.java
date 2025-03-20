package org.example;

import org.example.cache.BundledShapeCache;
import org.example.shapes.Circle;
import org.example.shapes.Rectangle;
import org.example.shapes.Shape;

import java.util.ArrayList;
import java.util.List;

/**
 * Here happens the magic
 *
 */
public class Demo {
    public static void main( String[] args ) {
        List<Shape> shapes = new ArrayList<>();
        List<Shape> shapesCopy = new ArrayList<>();

        Circle circle = new Circle();
        circle.setX(10);
        circle.setY(20);
        circle.setRadius(15);
        circle.setColor("red");
        shapes.add(circle);

        Circle anotherCircle = (Circle) circle.clone();
        shapes.add(anotherCircle);

        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(10);
        rectangle.setHeight(20);
        rectangle.setColor("blue");
        shapes.add(rectangle);

        Rectangle anotherRectangle = (Rectangle) rectangle.clone();
        shapes.add(anotherRectangle);

        // Clone the shapes list to the copy list
        cloneAndCompare(shapes, shapesCopy);
        System.out.println();

        /*
        * You could implement a centralized prototype registry (or factory), which would contain a set of
        * pre-defined prototype objects. This way you could retrieve new objects from the factory by passing
        * its name or other parameters. The factory would search for an appropriate prototype,
        * clone it and return you a copy.
        * */
        BundledShapeCache cache = new BundledShapeCache();
        cache.register("Big red circle", circle);
        cache.register("Medium blue rectangle", rectangle);

        Shape shape1 = cache.get("Big red circle");
        Shape shape2 = cache.get("Medium blue rectangle");
        Shape shape3 = cache.get("Medium blue rectangle");

        if (shape1 != shape2 && !shape1.equals(shape2)) {
            System.out.println("The circle is totally different than the rectangle (yay!)");
        } else {
            System.out.println("The circle is same shape as the rectangle (boo!)");
        }

        if (shape2 != shape3) {
            System.out.println("Medium blue rectangles are two different objects (yay!)");
            if (shape2.equals(shape3)) {
                System.out.println("And they are identical (yay!)");
            } else {
                System.out.println("But they are not identical (boo!)");
            }
        } else {
            System.out.println("Rectangle objects are the same (boo!)");
        }
    }

    // Let's check if the items in the copy list are identical to the original list
    // but refer to different objects in memory
    private static void cloneAndCompare(List<Shape> shapes, List<Shape> shapesCopy) {
        for (Shape shape : shapes){
            shapesCopy.add(shape.clone());
        }

        for (int i = 0; i < shapes.size(); i++){
            if (shapes.get(i) != shapesCopy.get(i)){
                System.out.println(i + ": Shapes are different objects in memory (yay!)");
                if (shapes.get(i).equals(shapesCopy.get(i))) {
                    System.out.println(i + ": And they are identical (yay!)");
                } else {
                    System.out.println(i + ": But they are not identical (boo!)");
                }
            } else {
                System.out.println(i + ": Shapes objects are the same address in memory (boo!)");
            }
        }
    }
}
