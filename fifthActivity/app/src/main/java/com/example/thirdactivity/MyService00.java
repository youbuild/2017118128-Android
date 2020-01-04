package com.example.thirdactivity;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

public class MyService00 extends Service {
    public MyService00() {
    }

    @Override
    public void onCreate(){
        super.onCreate();
        Log.d("MyService00", "onCreate executed");
    }

    @Override
    public int onStartCommand(Intent intent,int flags,int startId){
        Log.d("MyService00", "onStartCommand executed");
        return super.onStartCommand(intent,flags,startId);
    }

    @Override
    public void onDestroy(){
        super.onDestroy();
        Log.d("MyService00", "onDestroy executed");
    }
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
