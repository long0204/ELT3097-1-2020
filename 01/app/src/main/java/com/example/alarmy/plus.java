package com.example.alarmy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class plus extends AppCompatActivity {

    Button btc,bta,btq;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plus);
        btc = (Button) findViewById(R.id.btplus);
        btc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mx = new Intent(plus.this,MainActivity.class);
                startActivity(mx);
            }
        });
        bta = (Button) findViewById(R.id.btplusalarm);
        bta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mx = new Intent(plus.this,checktime1.class);
                startActivity(mx);
            }
        });
        btq = findViewById(R.id.btplusquickalarm);
        btq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(plus.this, "Soon", Toast.LENGTH_SHORT).show();
            }
        });
    }
}