package org.iegrec.utilitybelt;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import java.util.Objects;

public class UtilityBeltBootReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        String s = intent.getAction();
        if (Objects.requireNonNull(s).equalsIgnoreCase(Intent.ACTION_BOOT_COMPLETED))  {
            Intent serviceIntent = new Intent(context, org.iegrec.utilitybelt.UtilityBeltTracer.class);
            context.startService(serviceIntent);
        }
    }
}
