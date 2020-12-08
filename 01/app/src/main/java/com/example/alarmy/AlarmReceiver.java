package com.example.alarmy;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class AlarmReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.e("Toi trong bao thuc","Xin chao");
        Intent myIntent = new Intent(context,Music.class);
        context.startService(myIntent);
    }
}
