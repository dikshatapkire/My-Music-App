package com.example.mymusicapp;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;

public class tereHawaleService extends Service {
    private MediaPlayer MP;
    public tereHawaleService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public void onCreate() {
        super.onCreate();
        MP= MediaPlayer.create(this,R.raw.tere);
    }


    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        MP.setLooping(true);
        MP.start();

        return super.onStartCommand(intent, flags, startId);
    }
}