package net.snatchdreams.dagger2basics;

import android.util.Log;

import javax.inject.Inject;

public class Car {
    private Engine engine;
    private Wheel wheel;

    // Here we are NOT worried about the creation
    // of engine and wheel instances as there are
    // independent from the Car and created somewhere
    // else and then passed to the car constructor
    @Inject
    Car(Engine engine, Wheel wheel)
    {
        this.engine = engine;
        this.wheel = wheel;
    }

    public void drive()
    {
        Log.i("Car: ", "Car Driving.............");
    }

}
