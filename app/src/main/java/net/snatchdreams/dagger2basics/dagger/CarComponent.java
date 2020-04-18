package net.snatchdreams.dagger2basics.dagger;

import net.snatchdreams.dagger2basics.MainActivity;
import net.snatchdreams.dagger2basics.car.Car;

import dagger.Component;

@Component(modules = {WheelsModule.class, DieselEngineModule.class})
public interface CarComponent {
    Car getCar();

    void inject(MainActivity mainActivity);
}
