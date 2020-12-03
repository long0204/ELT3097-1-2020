package com.example.alarmy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btncheck1,btncheck2,btncheck3,btnp;
    @Override
    protected  void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btncheck1 = (Button)findViewById(R.id.btplu);
        btncheck1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mhtime1 = new Intent(MainActivity.this, plus.class);
                startActivity(mhtime1);
            }
        });
        btncheck1 = (Button)findViewById(R.id.btchecktime1);
        btncheck1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mhtime1 = new Intent(MainActivity.this, checktime1.class);
                startActivity(mhtime1);
            }
        });
        btncheck2 = (Button)findViewById(R.id.btchecktime2);
        btncheck2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mhtime1 = new Intent(MainActivity.this, checktime1.class);
                startActivity(mhtime1);
            }
        });
        btncheck3 = (Button)findViewById(R.id.btchecktime3);
        btncheck3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mhtime1 = new Intent(MainActivity.this, checktime1.class);
                startActivity(mhtime1);
            }
        });
    }

}