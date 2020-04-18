package net.snatchdreams.dagger2basics.car;

import android.util.Log;

import javax.inject.Inject;

public class Remote {
    @Inject
    Remote()
    {

    }

    public void setListener(Car car)
    {
        Log.i("Car" , "Remote Enabled ...");
    }
}
