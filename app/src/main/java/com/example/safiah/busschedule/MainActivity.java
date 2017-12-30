package com.example.safiah.busschedule;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gotoBus(View view){
        Intent intent = new Intent(this,Bus.class);
        startActivity(intent);
    }

    public void gotoCurrentLocation(View view){
        Intent intent = new Intent(this,MapsActivity.class);
        startActivity(intent);
    }

    public void gotoBusStop(View view){
        Intent intent = new Intent(this,MapsActivity2.class);
        startActivity(intent);
    }
}
