package com.yagami.camellapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class Manualconstruayuda extends AppCompatActivity {
    CardView card_view;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manualconstruayuda);
        card_view = findViewById(R.id.card_view);
        card_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent card_view = new Intent(Manualconstruayuda.this, comoinstalartubo.class);
                startActivity(card_view);
            }
        });



    } public void comoinstalar(View view) {
        Intent funcion=new Intent(this,comoinstalartubo.class);
        startActivity(funcion);

    }


}

