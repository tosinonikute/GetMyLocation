package com.getmylocation;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

public class AlarmActivity extends AppCompatActivity {

    private AlarmManager alarmMgr;
    private PendingIntent pendingIntent;
    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        context = getApplicationContext();

        // Retrieve a PendingIntent that will perform a broadcast
        Intent alarmIntent = new Intent(this, AlarmReceiver.class);
        pendingIntent = PendingIntent.getBroadcast(this, 0, alarmIntent, 0);
        startAlarm();



    }

    public void startAlarm() {
        alarmMgr = (AlarmManager)getSystemService(Context.ALARM_SERVICE);
        int interval = 10000;

        alarmMgr.setRepeating(AlarmManager.RTC_WAKEUP, System.currentTimeMillis(), interval, pendingIntent);
        Toast.makeText(this, "Alarm Set", Toast.LENGTH_SHORT).show();
    }

    public void cancelAlarm() {
        if (alarmMgr != null) {
            alarmMgr.cancel(pendingIntent);
            Toast.makeText(this, "Alarm Canceled", Toast.LENGTH_SHORT).show();
        }
    }

}
