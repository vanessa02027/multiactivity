package com.example.multiactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class secundario extends AppCompatActivity {
    Button btnSUMA1;
    Button btnRESTA2;
    Button btnMULTIPLICACION3;
    Button btnDIVISION4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.secundario);
        btnSUMA1=findViewById(R.id.btnSUMA);
        btnRESTA2=findViewById(R.id.btnRESTA);
        btnMULTIPLICACION3=findViewById(R.id.btnMULTIPLICACION);
        btnDIVISION4=findViewById(R.id.btnDIVISION);


        btnSUMA1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pasar1=new Intent(secundario.this, SUMA. class);
                startActivity(pasar1);
            }
        });
        btnRESTA2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pasar2=new Intent(secundario.this, RESTA.class);
                startActivity(pasar2);
            }
        });
        btnMULTIPLICACION3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pasar3=new Intent(secundario.this, MULTIPLICACION. class);
                startActivity(pasar3);
            }
        });
        btnDIVISION4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pasar4=new Intent(secundario.this, DIVISION. class);
                startActivity(pasar4);
            }
        });

    }
}

