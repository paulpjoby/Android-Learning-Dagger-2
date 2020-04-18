package net.snatchdreams.dagger2basics.car;

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

    //This method will be called by dagger after the constructor is done;
    @Inject
    public void enableRemote(Remote remote) {
        remote.setListener(this); // Pass the injected object into the dependency
    }

    public void drive()
    {
        engine.start();
        Log.i("Car: ", "Car Driving.............");
    }

}
