package net.snatchdreams.dagger2basics.dagger;

import net.snatchdreams.dagger2basics.car.DieselEngine;
import net.snatchdreams.dagger2basics.car.Engine;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class DieselEngineModule {

    @Binds
    abstract Engine bindsEngine(DieselEngine engine);
}
