package com.example.examen2and;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class afficheproduit extends AppCompatActivity {
    MyDBProduit db;
    Spinner spn;
    ArrayList<produit> prds;
    TextView txv1,txv2,txv3,txv4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ficheproduit);

        spn=findViewById(R.id.spin);
        txv1=findViewById(R.id.libelle);
        txv2=findViewById(R.id.famille);
        txv3=findViewById(R.id.prixa);
        txv3=findViewById(R.id.prixv);

        db=new MyDBProduit(this);

        prds=MyDBProduit.getListeProduits(db.getReadableDatabase());

        ArrayList<String> lstPrds=new ArrayList<>();
        for(produit p: prds){
            lstPrds.add(p.getIdProduit()+" - "+ p.getLibelle());
        }
        ArrayAdapter<String> ad=new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,lstPrds);
        spn.setAdapter(ad);

        spn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                produit p= prds.get(i);
                txv1.setText("Libelle : "+p.getLibelle());
                txv2.setText("Famille : "+p.getFamille());
                txv3.setText(String.format("%s : %.2f","Prix Achat :",p.getPrixAchat()));
                txv4.setText(String.format("%s : %.2f","Prix Vente :",p.getPrixVente()));
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
}
