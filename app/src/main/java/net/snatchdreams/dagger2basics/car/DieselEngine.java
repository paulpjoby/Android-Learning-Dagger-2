package net.snatchdreams.dagger2basics.car;

import android.util.Log;

import javax.inject.Inject;

public class DieselEngine implements Engine {

    @Inject
    public DieselEngine(){}

    @Override
    public void start()
    {
        Log.i("Car", "Diesel Engine Started");
    }
}
