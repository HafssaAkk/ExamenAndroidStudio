package com.example.examen2and;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class listeproduit  extends AppCompatActivity {
    ListView lst;
    MyDBProduit db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listeproduit);

        db = new MyDBProduit(this);
        lst = findViewById(R.id.lst);

        ArrayList<produit> all = MyDBProduit.getListeProduits(db.getReadableDatabase());

        ArrayList<String> infos = new ArrayList<>();

        for(produit p : all){
            infos.add(p.getIdProduit() + " - " + p.getLibelle());
        }

        ArrayAdapter<String> ad = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,infos);
        lst.setAdapter(ad);

    }
}
