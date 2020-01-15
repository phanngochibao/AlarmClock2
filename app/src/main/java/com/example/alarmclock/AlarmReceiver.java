package com.example.alarmclock;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class AlarmReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        String string = intent.getExtras().getString("Extra");
        Intent myIntent = new Intent(context,Music.class);
        myIntent.putExtra("extra",string);
        context.startService(myIntent);
    }
}
