package net.snatchdreams.dagger2basics.car;

import android.util.Log;

// We don't own this class so we can't annotate it with @Inject
public class Tires {

    public void inflate()
    {
        Log.i("Car", "Tires inflated");
    }
}
