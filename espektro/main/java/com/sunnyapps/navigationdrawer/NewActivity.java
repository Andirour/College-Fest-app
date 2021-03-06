package com.sunnyapps.navigationdrawer;

import android.app.AlarmManager;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.NotificationCompat;
import android.support.v4.content.WakefulBroadcastReceiver;


import java.util.Calendar;

/**
 * Created by Sourav on 2/28/2017.
 */

public class NewActivity extends WakefulBroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Intent it=new Intent(context,ScheduleActivity.class);
        PendingIntent pd=PendingIntent.getActivity(context,0,it,0);
        NotificationCompat.Builder builder = new NotificationCompat.Builder(context);
        builder.setSmallIcon(R.drawable.icon);
        builder.setContentTitle("Espektro");
        builder.setContentText("You have many events today in Espektro");
        builder.setDefaults(Notification.DEFAULT_ALL);
        builder.setAutoCancel(true);
        builder.setContentIntent(pd);
        NotificationManager nm = (NotificationManager)context.getSystemService(context.NOTIFICATION_SERVICE);
        nm.notify(0, builder.build());
        context.stopService(new Intent(context,NotifyMain.class));
        context.startService(new Intent(context,NotifyMain.class));
    }
}
