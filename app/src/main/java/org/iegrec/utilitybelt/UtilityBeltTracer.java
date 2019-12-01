package org.iegrec.utilitybelt;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class UtilityBeltTracer extends Service {
    public UtilityBeltTracer() {
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        // TODO: Set things up
        return Service.START_NOT_STICKY;
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        return null;
        // throw new UnsupportedOperationException("Not yet implemented");
    }
}
