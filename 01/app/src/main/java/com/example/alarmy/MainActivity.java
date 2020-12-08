package com.example.alarmy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btncheck1,btncheck2,btnp,btnsetting;
    @Override
    protected  void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnp = (Button)findViewById(R.id.btplu);
        btnp.setOnClickListener(new View.OnClickListener() {
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
        btnsetting = (Button)findViewById(R.id.btsetting);
        btnsetting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mhs = new Intent(MainActivity.this, Settingg.class);
                startActivity(mhs);
            }
        });

    }

}