package com.example.multiactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnprincipal1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnprincipal1=findViewById(R.id.btnprincipal);


        btnprincipal1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pasar1=new Intent(MainActivity.this, secundario. class);
                startActivity(pasar1);
            }
        });
    }
}
