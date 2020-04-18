package net.snatchdreams.dagger2basics;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import net.snatchdreams.dagger2basics.car.Car;
import net.snatchdreams.dagger2basics.dagger.CarComponent;
import net.snatchdreams.dagger2basics.dagger.DaggerCarComponent;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    private Car car;

    @Inject
    public Car car2; // This if for demonstrating Field Injection

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Manual Dependency Injection
        //Dependency injection without Dagger

        //        Engine engine = new Engine(){};
        //        Wheel wheel = new Wheel(null, null);
        //        Car myCar = new Car(engine, wheel);

        // Here we have to take care about the creation of engine and wheel but its
        // independent from the car module


        //Now using Dagger for Dependency
        CarComponent carComponent  = DaggerCarComponent.create();
        car = carComponent.getCar();
        car.drive();

        //Car 2 is created using Field Injection
        carComponent.inject(this);
        car2.drive();
    }
}
