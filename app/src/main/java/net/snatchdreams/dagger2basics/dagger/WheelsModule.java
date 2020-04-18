package net.snatchdreams.dagger2basics.dagger;

import net.snatchdreams.dagger2basics.car.Rims;
import net.snatchdreams.dagger2basics.car.Tires;
import net.snatchdreams.dagger2basics.car.Wheel;

import dagger.Module;
import dagger.Provides;

@Module
public class WheelsModule {

    @Provides
    static Rims provideRims()
    {
        return new Rims();
    }

    @Provides
    static Tires provideTires()
    {
        Tires tires = new Tires();
        tires.inflate();
        return tires;
    }

    @Provides
    static Wheel provideWheels(Rims rims, Tires tires)
    {
        return new Wheel(rims, tires);
    }
}
