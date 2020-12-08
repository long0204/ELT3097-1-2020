package com.example.alarmy;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import java.util.Calendar;

public class checktime1 extends AppCompatActivity {

  Button btnback;
  Button btnsave;
  TextView texthienthi;
  TimePicker timepicker;
  Calendar calendar;
  AlarmManager alarmManager;
  PendingIntent pendingIntent;
    @Override
    protected  void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checktime1);
        btnsave = findViewById(R.id.Save);
        texthienthi =(TextView)findViewById(R.id.hienthi);
        timepicker = (TimePicker)findViewById(R.id.timePicker2);
        calendar = Calendar.getInstance();
        alarmManager = (AlarmManager)getSystemService(ALARM_SERVICE);
        final Intent intent = new Intent(checktime1.this, AlarmReceiver.class);

        btnsave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calendar.set(Calendar.HOUR_OF_DAY,timepicker.getCurrentHour());
                calendar.set(Calendar.MINUTE,timepicker.getCurrentMinute());

                int gio = timepicker.getCurrentHour();
                int phut = timepicker.getCurrentMinute();

                String string_gio =String.valueOf(gio);
                String string_phut = String.valueOf(phut);

                if (gio > 12) {
                     string_gio =String.valueOf(gio - 12);
                }
                if (phut < 10) {
                    string_phut = "0" + String.valueOf(phut);
                }
                pendingIntent = PendingIntent.getBroadcast(
                        checktime1.this,0,intent,PendingIntent.FLAG_UPDATE_CURRENT
                );
                alarmManager.set(AlarmManager.RTC_WAKEUP,calendar.getTimeInMillis(),pendingIntent);
                texthienthi.setText("Ring in " + string_gio + " : "+ string_phut);
            }
        });
        btnback = (Button)findViewById(R.id.btback);
        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mhmain = new Intent(checktime1.this, MainActivity.class);
                startActivity(mhmain);
            }
        });
    }


}