package com.example.alarmy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class checktime1 extends AppCompatActivity {

  Button btnback;
  Button btnsave;
    @Override
    protected  void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checktime1);
        btnback = (Button) findViewById(R.id.btback);
        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mhback = new Intent(checktime1.this, MainActivity.class);
                startActivity(mhback);
            }
        });
        btnsave = findViewById(R.id.Save);
        btnsave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(checktime1.this, "Saved", Toast.LENGTH_SHORT).show();
            }
        });
    }


}