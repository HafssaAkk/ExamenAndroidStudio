package com.example.examen2and;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class nouveauproduit extends AppCompatActivity {
    MyDBProduit db;
    Button btn;
    EditText edt1,edt2,edt3,edt4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nouveauproduit);

        edt1 = findViewById(R.id.elib);
        edt2 = findViewById(R.id.efamille);
        edt3 = findViewById(R.id.eprxachat);
        edt4 = findViewById(R.id.eprxvente);
        btn = findViewById(R.id.btnsave);

        btn.setOnClickListener(new View.OnClickListener() {
            class Produit extends produit {
                public Produit(int i, String s, String s1, Double aDouble, Double aDouble1) {
                }
            }

            @Override
            public void onClick(View view) {
                if (edt1.getText().toString().isEmpty() || edt2.getText().toString().isEmpty()
                        || edt3.getText().toString().isEmpty() || edt4.getText().toString().isEmpty())
                    Toast.makeText(nouveauproduit.this, " veuillez Remplissez tous les champs !", Toast.LENGTH_LONG).show();
                else {
                    long produit = MyDBProduit.Insert_Produit(db.getWritableDatabase(), new Produit(1, edt1.getText().toString(), edt2.getText().toString(), Double.valueOf(edt3.getText().toString()), Double.valueOf(edt4.getText().toString())));
                    Toast.makeText(nouveauproduit.this, "Ajouté avec succès !", Toast.LENGTH_SHORT).show();
                    edt1.getText().clear();
                    edt2.getText().clear();
                    edt3.getText().clear();
                    edt4.getText().clear();
                    edt1.requestFocus();
                }
            }
        });
    }
}
