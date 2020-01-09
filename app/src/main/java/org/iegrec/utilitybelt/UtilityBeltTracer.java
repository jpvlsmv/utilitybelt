package org.iegrec.utilitybelt;

import android.app.Service;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.IBinder;
import android.preference.PreferenceManager;

import java.time.Instant;
import java.util.Timer;
import java.util.TimerTask;

public class UtilityBeltTracer extends Service {
    private void startTimer(){
        final Timer timer;
        timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                SharedPreferences p = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                SharedPreferences.Editor edit = p.edit();
                    edit.putString("LASTSEEN", String.valueOf(Instant.now().getEpochSecond()));
                edit.apply();
            }
        }
        ,60,60);
    }

    @Override
    public void onCreate() {
        startTimer();
        super.onCreate();
    }

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
