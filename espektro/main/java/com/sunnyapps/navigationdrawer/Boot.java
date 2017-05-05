package com.sunnyapps.navigationdrawer;

import android.content.Context;
        import android.content.Intent;
        import android.support.v4.content.WakefulBroadcastReceiver;

/**
 * Created by Sushovan on 3/4/2017.
 */

public class Boot extends WakefulBroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Intent it=new Intent(context,NotifyMain.class);
        context.startService(it);
    }
}
