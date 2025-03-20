package org.example;

import org.example.builders.CarBuilder;
import org.example.builders.CarManualBuilder;
import org.example.cars.Car;
import org.example.cars.Manual;
import org.example.director.Director;

/**
 * CLIENT CODE
 *
 * Demo class. Everything comes together here.
 */
public class Demo {

    public static void main( String[] args ) {
        Director director = new Director();

        // Director gets the concrete builder object from the client
        // (application code). That's because application knows better which
        // builder to use to get a specific product.
        CarBuilder builder = new CarBuilder();
        director.constructSportsCar(builder);

        // The final product is often retrieved from a builder object, since
        // Director is not aware and not dependent on concrete builders and
        // products.
        Car car = builder.getResult();
        System.out.println("Car built:\n" + car.getCarType());

        CarManualBuilder manualBuilder = new CarManualBuilder();

        // Director may know several building recipes.
        director.constructSportsCar(manualBuilder);
        Manual carManual = manualBuilder.getResult();
        System.out.println("\nCar manual built:\n" + carManual.print());

        // Let's construct a SUV as well
        CarBuilder builder1 = new CarBuilder();
        director.constructSUV(builder1);
        Car car1 = builder1.getResult();
        System.out.println("Car built:\n" + car1.getCarType());

        CarManualBuilder manualBuilder1 = new CarManualBuilder();
        director.constructSUV(manualBuilder1);
        Manual carManual1 = manualBuilder1.getResult();
        System.out.println("\nCar manual built:\n" + carManual1.print());

    }
}
