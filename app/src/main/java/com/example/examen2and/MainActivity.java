package com.example.examen2and;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    MyDBProduit db;
    Button b1,b2,b3,b4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    public void acceder(View v){
        Intent i=null;
        switch (v.getId()){
            case R.id.btn1:
                i=new Intent(this,listeproduit.class);
                break;
            case R.id.btn2:
                i=new Intent(this,afficheproduit.class);
                break;
            case R.id.btn3:
                i=new Intent(this,nouveauproduit.class);
                break;
            case R.id.btn4:
                i=new Intent(this,editerproduit.class);
                break;
        }
        startActivity(i);
    }
}