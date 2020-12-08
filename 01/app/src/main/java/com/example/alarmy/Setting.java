package com.example.alarmy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Setting extends AppCompatActivity {

    Button btnalarm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);
        //if (findViewById(R.id.frament_container)!=null)
        //{
        //    if (savedInstanceState!=null)
        //        return;

         //   getFragmentManager().beginTransaction().add(R.id.frament_container,new SettingFragment()).commit();
        //}
        btnalarm = (Button)findViewById(R.id.alarmmm);
        btnalarm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mhtime1 = new Intent(Setting.this, MainActivity.class);
                startActivity(mhtime1);
            }
        });
    }
}