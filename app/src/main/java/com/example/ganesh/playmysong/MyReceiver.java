package com.example.ganesh.playmysong;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/**
 * Created by Ganesh on 2015-03-20.
 */
public class MyReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {

       // Intent i = new Intent();
        //intent.setAction("android.intent.action.BOOT_COMPLETED");
        // startService(intent);
        Intent intents = new Intent(context, MyService.class);
        context.startService(intents);

     //   Intent intent=(intent, MyService.class);
       // startService(intent);
    }



  //  MyReceiver () {}

}
