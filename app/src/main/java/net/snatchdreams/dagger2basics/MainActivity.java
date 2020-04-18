package net.snatchdreams.dagger2basics;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Dependency injection without Dagger
        Engine engine = new Engine();
        Wheel wheel = new Wheel();

        Car myCar = new Car(engine, wheel);
        // Here we have to take care about the creation of engine and wheel but its
        // independent from the car module
    }
}
