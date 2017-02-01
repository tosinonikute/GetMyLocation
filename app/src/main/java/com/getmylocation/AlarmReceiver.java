package com.getmylocation;

/**
 * Created by Tosin Onikute on 10/10/16.
 */

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class AlarmReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        // For our recurring task, we'll send a broadcast
        Toast.makeText(context, "Alarm receiver running", Toast.LENGTH_SHORT).show();
        context.sendBroadcast(new Intent("USERS_LOCATION"));

    }

}
