package com.example.alarmclock;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;

public class Music extends Service {
    MediaPlayer mediaPlayer;
    int id;
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        String getKey = intent.getExtras().getString("Extra");
        if (getKey.equals("on")) id =1; else if (getKey.equals("off")) id = 0;
        if (id == 1) {
            mediaPlayer = MediaPlayer.create(this,R.raw.music);
            mediaPlayer.start();
            id = 0;
        } else if (id == 0) {
            mediaPlayer.stop();
            mediaPlayer.reset();
        }

        return START_NOT_STICKY;
    }
}
