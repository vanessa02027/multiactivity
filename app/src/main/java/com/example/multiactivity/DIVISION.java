package com.example.multiactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class DIVISION extends AppCompatActivity {
    EditText num1, num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_division);

        num1 = (EditText) findViewById(R.id.num1);
        num2 = (EditText) findViewById(R.id.num2);
        Button btnDivision = (Button) findViewById(R.id.btnDivision);
        final TextView tvResultado = (TextView) findViewById(R.id.textViewResultado);

        btnDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int aux1 = Integer.valueOf(num1.getText().toString());
                int aux2 = Integer.valueOf(num2.getText().toString());
                int resultado = aux1 / aux2;
                tvResultado.setText(" "+resultado);
            }
        });
    }
}





