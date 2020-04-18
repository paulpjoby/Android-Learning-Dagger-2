package net.snatchdreams.dagger2basics;

import android.util.Log;

public class Car {
    Engine engine;
    Wheel wheel;

    // Here we are NOT worried about the creation
    // of engine and wheel instances as there are
    // independent from the Car and created somewhere
    // else and then passed to the car constructor
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
