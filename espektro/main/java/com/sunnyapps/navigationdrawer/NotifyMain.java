package com.sunnyapps.navigationdrawer;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;


import java.util.Calendar;



public class NotifyMain extends Service {

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCreate() {
        super.onCreate();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Intent it = new Intent(this,NewActivity.class);
        PendingIntent pd = PendingIntent.getBroadcast(this,0,it,PendingIntent.FLAG_UPDATE_CURRENT);
        Intent sc = new Intent(this,Second.class);
        PendingIntent sec = PendingIntent.getBroadcast(this,0,sc,PendingIntent.FLAG_UPDATE_CURRENT);
        Intent th = new Intent(this,Third.class);
        PendingIntent thd = PendingIntent.getBroadcast(this,0,th,PendingIntent.FLAG_UPDATE_CURRENT);
        Calendar cal=Calendar.getInstance();
        Calendar c=Calendar.getInstance();
        Calendar d=Calendar.getInstance();
        Calendar e=Calendar.getInstance();
        int currentm=c.get(Calendar.MINUTE);
        int currenth=c.get(Calendar.HOUR_OF_DAY);
        int currentd=c.get(Calendar.DAY_OF_MONTH);
        //cal.set(Calendar.HOUR_OF_DAY,16);
        cal.set(Calendar.DAY_OF_MONTH,9);
        cal.set(Calendar.HOUR_OF_DAY,10);
        cal.set(Calendar.MINUTE,00);
        d.set(Calendar.DAY_OF_MONTH,10);
        d.set(Calendar.HOUR_OF_DAY,10);
        d.set(Calendar.MINUTE,00);
        e.set(Calendar.DAY_OF_MONTH,11);
        e.set(Calendar.HOUR_OF_DAY,10);
        e.set(Calendar.MINUTE,00);
        int firstm=cal.get(Calendar.MINUTE);
        int secondm=d.get(Calendar.MINUTE);
        int thirdm=e.get(Calendar.MINUTE);
        int firsth=cal.get(Calendar.HOUR_OF_DAY);
        int secondh=d.get(Calendar.HOUR_OF_DAY);
        int thirdh=e.get(Calendar.HOUR_OF_DAY);
        int firstd=cal.get(Calendar.DAY_OF_MONTH);
        int secondd=d.get(Calendar.DAY_OF_MONTH);
        int thirdd=e.get(Calendar.DAY_OF_MONTH);
        if (currentd<firstd)
        {
            AlarmManager alm=(AlarmManager)this.getSystemService(this.ALARM_SERVICE);
            alm.set(AlarmManager.RTC_WAKEUP,cal.getTimeInMillis(),pd);
        }
        else if(currentd==firstd){
            if(currenth<firsth){
                AlarmManager alm=(AlarmManager)this.getSystemService(this.ALARM_SERVICE);
                alm.set(AlarmManager.RTC_WAKEUP,cal.getTimeInMillis(),pd);
            }
            else if(currenth>=firsth){
                AlarmManager alm=(AlarmManager)this.getSystemService(this.ALARM_SERVICE);
                alm.set(AlarmManager.RTC_WAKEUP,d.getTimeInMillis(),sec);
            }
        }
        else if(currentd==secondd){
            if(currenth<secondh){
                AlarmManager alm=(AlarmManager)this.getSystemService(this.ALARM_SERVICE);
                alm.set(AlarmManager.RTC_WAKEUP,d.getTimeInMillis(),sec);
            }
            else if(currenth>=secondh){
                AlarmManager alm=(AlarmManager)this.getSystemService(this.ALARM_SERVICE);
                alm.set(AlarmManager.RTC_WAKEUP,e.getTimeInMillis(),thd);
            }
        }
        else if(currentd==thirdd){
            if(currenth<thirdh){
                AlarmManager alm=(AlarmManager)this.getSystemService(this.ALARM_SERVICE);
                alm.set(AlarmManager.RTC_WAKEUP,e.getTimeInMillis(),thd);
            }

        }

        return START_STICKY;
    }
    @Override
    public void onDestroy() {
        //Toast.makeText(this,"Service Stopped",Toast.LENGTH_LONG).show();
        super.onDestroy();
    }
}
