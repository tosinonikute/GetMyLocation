package com.getmylocation;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private AlarmManager alarmMgr;
    private PendingIntent pendingIntent;
    private Context context;
    private int interval = 7000; // interval set to 30 minutes

    protected static final String TAG = "hello1: ";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        context = getApplicationContext();
        registerReceiver(broadcastReceiver, new IntentFilter("USERS_LOCATION"));

        // Retrieve a PendingIntent that will perform a broadcast
        Intent alarmIntent = new Intent(this, AlarmReceiver.class);
        pendingIntent = PendingIntent.getBroadcast(this, 0, alarmIntent, 0);
        startAlarm();

    }

    BroadcastReceiver broadcastReceiver = new BroadcastReceiver() {
        @Override
        public void onReceive(Context context, Intent intent) {
            // internet lost alert dialog method call from here...
            displayLocation(context);
        }
    };


    public void startAlarm() {
        alarmMgr = (AlarmManager)getSystemService(Context.ALARM_SERVICE);

        alarmMgr.setRepeating(AlarmManager.RTC_WAKEUP, System.currentTimeMillis(), interval, pendingIntent);
        Toast.makeText(this, "Alarm Set", Toast.LENGTH_SHORT).show();
    }

    public void cancelAlarm() {
        if (alarmMgr != null) {
            alarmMgr.cancel(pendingIntent);
            Toast.makeText(this, "Alarm Canceled", Toast.LENGTH_SHORT).show();
        }
    }


    private void displayLocation(Context context){

        // call the google api & output the user's location
        GoogleApiHelper googleApiHelper = new GoogleApiHelper(context, this);
    }






}
