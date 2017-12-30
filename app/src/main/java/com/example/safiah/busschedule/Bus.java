package com.example.safiah.busschedule;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Bus extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bus);
    }

    public void gotoSecondActivity(View view){
        Intent intent = new Intent(this,second_activity.class);
        startActivity(intent);
    }

    public void gotoFSKM(View view){
        Intent intent = new Intent(this,FSKM.class);
        startActivity(intent);
    }

    public void gotoSaas(View view){
        Intent intent = new Intent(this,Saas.class);
        startActivity(intent);
    }
}
