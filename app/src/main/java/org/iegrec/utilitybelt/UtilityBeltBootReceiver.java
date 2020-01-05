package org.iegrec.utilitybelt;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class UtilityBeltBootReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        if (intent.getAction().equalsIgnoreCase(Intent.ACTION_BOOT_COMPLETED))  {
            Intent serviceIntent = new Intent(context, org.iegrec.utilitybelt.UtilityBeltTracer.class);
            context.startService(serviceIntent);
        }
    }
}
