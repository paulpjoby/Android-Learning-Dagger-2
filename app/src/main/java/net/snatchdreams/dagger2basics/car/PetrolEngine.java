package net.snatchdreams.dagger2basics.car;

import android.util.Log;

import javax.inject.Inject;

public class PetrolEngine implements Engine {

    @Inject
    public PetrolEngine(){}

    @Override
    public void start() {
        Log.i("Car", "Petrol Engine Started");
    }
}
