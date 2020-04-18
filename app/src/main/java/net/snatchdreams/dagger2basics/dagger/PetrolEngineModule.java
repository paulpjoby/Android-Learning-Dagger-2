package net.snatchdreams.dagger2basics.dagger;

import net.snatchdreams.dagger2basics.car.Engine;
import net.snatchdreams.dagger2basics.car.PetrolEngine;

import dagger.Module;
import dagger.Provides;

@Module
public class PetrolEngineModule {

    @Provides
    Engine provideEngine(PetrolEngine engine)
    {
        return engine;
    }
}
